package Objects;

import Exceptions.MessageNotSentException;
import Exceptions.NotEnoughFundsException;
import io.swagger.client.ApiException;
import io.swagger.client.model.Account;
import io.swagger.client.model.Transaction;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Item> items = new ArrayList();
    private double subtotal = 0.0;
    private ApiBridge apiBridge = new ApiBridge();

    public ArrayList<Item> getItems() {
        return items;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void addItemToCart(Item item)
    {
        this.items.add(item);
        subtotal += item.getPrice() * item.getQuantity();
    }

    public void addItemsToCart(ArrayList<Item> items)
    {
        for (int i = 0; i < items.size(); i++) {
            addItemToCart(items.get(i));
        }
    }

    public boolean checkBalance() throws ApiException {
        Account account = apiBridge.getAccountApi().accountGet();

        return (account.getBalance() >= new Double((subtotal * 1.07) *100).longValue());
    }

    public void createTransaction(Item item) throws ApiException {
        Transaction transaction = new Transaction();
        transaction.setType(Transaction.TypeEnum.DEBIT);
        Long price = new Double(((item.getPrice() * 100) * 1.07) * item.getQuantity()).longValue();
        transaction.setAmount(price);
        transaction.setDescription(item.getName());
        apiBridge.getTransactionApi().transactionCreate(transaction);
    }

    public void checkout() throws ApiException, NotEnoughFundsException, MessageNotSentException {
        if(checkBalance())
        {
            for (int i = 0; i < items.size(); i++) {
                createTransaction(items.get(i));
            }
        }
        else {
            throw new NotEnoughFundsException();
        }
        Receipt receipt = new Receipt(this);
        Email email = new Email();
        email.openCredentials();
        email.setMessage(receipt.getReceipt());
        email.sendEmail();
    }

    public static void main(String[] args) throws ApiException, NotEnoughFundsException, MessageNotSentException {
        Item item = new Item();
        item.setName("Camera #1");
        item.setPrice(5.00);
        item.setQuantity(5);

        Item item1 = new Item();
        item1.setName("Camera #2");
        item1.setPrice(5.00);
        item1.setQuantity(5);

        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item1);

        Cart cart = new Cart();
        cart.addItemsToCart(items);
        cart.checkout();
    }
}
