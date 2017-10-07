package Objects;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Receipt {

    private Cart cart;
    private double total;
    private Customer customer = new Customer();

    public Receipt(Cart cart) {
        this.cart = cart;
        double total = cart.getSubtotal() * 1.07;
        this.total = Double.parseDouble(new DecimalFormat("0.00").format(total));
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getReceipt()
    {

        String message = "<h1><a href = \"http://localhost:8080/\">Order Submitted</a></h1>\n";
        message += "<br><b>Invoice:</b> " + new SimpleDateFormat().format(new Date());
        message += "<br><table style='border:1px solid black;border-collapse:collapse'>";
        message += "<br><tr>";
        message += "<br><th>Name</th>";
        message += "<br><th>Qty</th>";
        message += "<br><th>Unit Price</th>";
        message += "<br><th>Total Price</th>";
        message += "<br></tr>";
        DecimalFormat format = new DecimalFormat("0.00");
        for (Item item: cart.getItems()) {
            message += "<tr>";
            message += "<br><td>" + item.getName()+ "</td>";
            message += "<br><td>" + item.getQuantity() + "</td>";
            message += "<br><td>" + format.format(item.getPrice()) + "</td>";
            message += "<br><td>" + format.format(item.getQuantity() * item.getPrice()) + "</td>";
            message += "</tr>";
        }
        message += "</table>";
        message += "<br><b>Subtotal:</b> $" + format.format(cart.getSubtotal());
        message += "<br><b>Tax:</b> $" + format.format(cart.getSubtotal() *.07);
        message += "<br><b>Total:</b> $" + format.format(getTotal());

        message += "<br>You now have: $" + format.format(customer.getBalance() / 100.0);
        message += " in your account.";

        message += "<br><br><br>Thank you for shopping!";


        return message;
    }
}
