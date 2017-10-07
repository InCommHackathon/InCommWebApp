package Objects;

import Exceptions.NotEnoughFundsException;
import io.swagger.client.ApiException;
import io.swagger.client.model.Account;
import io.swagger.client.model.Transaction;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Item> items = new ArrayList();
    private double subtotal = 0.0;
    private ApiBridge apiBridge = new ApiBridge();

    public void addItemToCart(Item item)
    {
        this.items.add(item);
        subtotal += item.getPrice();
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
        Long price = new Double((item.getPrice() * 100) * 1.07).longValue();
        transaction.setAmount(price);
        transaction.setDescription(item.getName());
        apiBridge.getTransactionApi().transactionCreate(transaction);
    }

    public void checkout() throws ApiException, NotEnoughFundsException {
        if(checkBalance())
        {
            for (int i = 0; i < items.size(); i++) {
                createTransaction(items.get(i));
            }
        }
        else {
            throw new NotEnoughFundsException();
        }
    }

    public static void main(String[] args) throws ApiException, NotEnoughFundsException {
        Item item = new Item();
        item.setName("item");
        item.setPrice(5.00);
        item.setQuantity(5);

        Cart cart = new Cart();
        cart.addItemToCart(item);
        cart.checkout();
    }
}
