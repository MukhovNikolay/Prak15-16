package Prak16;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(Item item);
    /*public IOrder[] getOrder();*/
    int ordersCostSummary();
    int ordersQuantity();

}
