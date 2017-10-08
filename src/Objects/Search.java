package Objects;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeMap;

public class Search {

    private TreeMap<String, Item> items = new TreeMap<>();

    public Search() {
        importData();
    }

    public void importData()
    {
        ObjectIO objectIO = new ObjectIO(new File("data1.dta"));
        items = (TreeMap<String, Item>) objectIO.readObject();
        ArrayList<Item> data = new ArrayList<>(items.values());
        for (Item item: data) {
            //System.out.println(item.getName());
        }
    }

    public ArrayList<Item> search(String search)
    {
        ArrayList<Item> results = new ArrayList<>();
        ArrayList<Item> data = new ArrayList<>(items.values());
        for (Item item: data) {

            String itemName = item.getName().toLowerCase();
            itemName = itemName.replaceAll("\\s+$", "");
            String searchName = search.toLowerCase();
            searchName = searchName.replaceAll("\\s+$", "");
            if(itemName.contains(searchName))
            {
                results.add(item);
            }
        }
        return results;
    }

}
