package Prak16;

public interface Order {
    boolean add(Item item);
    String[] itemsNames();
    int itemQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(Item item);
    Item[] getItems();
    boolean remove(String itemName);
    boolean removeAll(String itemName);
    Item[] sortedItemsByCostDesc();
    int costTotal();

}
