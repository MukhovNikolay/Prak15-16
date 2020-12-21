package Prak16;

public class InternetOrder implements Order{
    MyList Lt1 =new MyList();
    public InternetOrder(Item items[]){
        Lt1.addItems(items);
    }
    public boolean add(Item item){
        return Lt1.add(item);
    }
    public int itemQuantity(){
        return  Lt1.size();
    }
    public Item[] sortedItemsByCostDesc(){
        return Lt1.sort();
    }
    public boolean remove(String itemName){
        return Lt1.delete(itemName);
    }
    public boolean removeAll(String itemName) {
        if (Lt1.delete(itemName)){
            System.out.println(true);
            while (!Lt1.delete(itemName)) {
            }
        return true;
        }
        else {
            return false;
        }
    }
    public Item[] getItems(){
        return Lt1.getAllItem();
    }
    public int costTotal(){
        return  Lt1.getCostTotal();
    }
    public int itemQuantity(Item item){
        return Lt1.itemQuantity(item);
    }
    public int itemQuantity(String name){
        return Lt1.itemQuantity(name);
    }
    public String[] itemsNames(){
        return  Lt1.getAllName();
    }

}
