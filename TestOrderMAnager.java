package Prak16;

import java.util.Arrays;

public class TestOrderMAnager {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        try{
        items[0] = new Dish("Fish","Сырая",300);
        items[1] = new Dish("Fish1","Жареная",350);
        items[2] = new Dish("Fish","Сырая",300);
        items[3] = new Dish("Meat","Сырая",400);
        items[4] = new Dish("Meat1","Жареная",500);
        InternetOrder Od1 = new InternetOrder(items);
        InternetOrder Od2 = new InternetOrder(items);
        InternetOrder Od3 = new InternetOrder(items);
        OrderManager Mn1 = new OrderManager();
        try {
            Mn1.add("Москва", Od1);
            Mn1.add("Тула", Od2);
            Mn1.add("Москва", Od3);
        }catch (OrderAlreadyAddedException e){
            System.err.println(e);
        }
        Mn1.addItem("Тула",items[0]);
        Mn1.addItem("Тула",items[4]);
        Mn1.addItem("Москва",new Drink("Пиво","Светлое",100));
        System.out.println(Arrays.toString(Od1.itemsNames()));
        System.out.println(Arrays.toString(Od2.itemsNames()));
        Od1.sortedItemsByCostDesc();
        System.out.println(Arrays.toString(Od1.itemsNames()));
        System.out.println(Mn1.costTotalOrder());
        System.out.println(Mn1.nameAllQuantity("Meat"));
        Mn1.removeOrder("Москва");
        System.out.println(Mn1.costTotalOrder());
    }catch (IllegalArgumentException e){
        System.err.println(e);
    }
    }
}
