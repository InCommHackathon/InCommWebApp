package Objects;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brandoncarter
 */
public class Item implements Serializable {

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
        ArrayList<Item> items = new ArrayList<>();
        while(true)
        {
            Item item = new Item();
            System.out.print("Enter a name: ");
            item.setName(input.nextLine());
            item.setQuantity(1);
            System.out.print("Enter a price: ");
            item.setPrice(Double.parseDouble(input.nextLine()));
            if(item.getPrice() == 0.0 || item.getName().equals("0"))
            {
                break;
            }
            items.add(item);
        }
        ObjectIO objectIO = new ObjectIO(new File("data.dta"));
        objectIO.writeObject(items);
                
    }
    
}

