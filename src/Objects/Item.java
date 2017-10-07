package Objects;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brandoncarter
 */
public class Item {

    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        double min = 0;
        double max = 1000;
        int quanity = 5;
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Enter Item:");
        String item = input.nextLine();
        
        Random r = new Random();
        double randomValue = min + (max - min) * r.nextDouble();
        
        System.out.println("Price: S" + df.format(randomValue));
        
        System.out.println("Quanity: " + quanity);
        
                
    }
    
}

