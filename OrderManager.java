package Prak16;

import java.util.HashMap;
import java.util.Set;

public class OrderManager {
    HashMap<String,Order> AdrOrd = new HashMap<>();
    public void add(String address,Order order) throws OrderAlreadyAddedException{
        if(AdrOrd.containsKey(address)){
            throw new OrderAlreadyAddedException("По адресу "+address+" уже существет заказ");
        }
        AdrOrd.put(address,order);
    }
    public Order getOrder(String address){
        return AdrOrd.get(address);
    }
    public Order removeOrder(String address){
        return AdrOrd.remove(address);
    }
    public void addItem (String address,Item item){
        getOrder(address).add(item);
    }
    public Order[] getAllOrder(){
        Set<String> address = AdrOrd.keySet();
        String [] StrAddress = address.toArray(new String[0]);
        Order [] orders = new Order[address.size()];
        for(int i=0;i<StrAddress.length;i++){
            orders[i] = getOrder(StrAddress[i]);
        }
        return  orders;
    }
    public int costTotalOrder(){
        Set<String> address = AdrOrd.keySet();
        String [] StrAddress = address.toArray(new String[0]);
        int cost=0;
        for(int i=0;i<StrAddress.length;i++){
            cost+=getOrder(StrAddress[i]).costTotal();
        }
        return cost;
    }
    public int nameAllQuantity(String name){
        Set<String> address = AdrOrd.keySet();
        String [] StrAddress = address.toArray(new String[0]);
        int names=0;
        for(int i=0;i<StrAddress.length;i++) {
            names+=getOrder(StrAddress[i]).itemQuantity(name);
        }
        return names;
    }
}
