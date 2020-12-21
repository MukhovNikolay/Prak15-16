package Prak16;

import java.util.Arrays;

public class TestOrder {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        try {
            items[0] = new Dish("Fish", "Сырая", 300);
            items[1] = new Dish("Fish1", "Жареная", 350);
            items[2] = new Dish("Fish", "Сырая", 300);
            items[3] = new Dish("Meat", "Сырая", 400);
            items[4] = new Dish("Meat", "Жареная", 500);
            InternetOrder Od1 = new InternetOrder(items);
            Od1.add(new Drink("Пиво", "Светлое", 100));
            Od1.itemQuantity();
            Od1.removeAll("Meat");
            System.out.println(Od1.costTotal());
            System.out.println(Arrays.toString(Od1.itemsNames()));
            Od1.sortedItemsByCostDesc();
            System.out.println(Arrays.toString(Od1.itemsNames()));
        }catch (IllegalArgumentException e){
            System.err.println(e);
        }
    }
}
