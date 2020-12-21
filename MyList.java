package Prak16;

import java.util.Arrays;

public class MyList {
    private Item items[] = new Item[100];
    private int index,j;
    public int getIndex() {
        return index;
    }
    public MyList(){
        index=0;
    }
    public boolean delete(String name){
        if(Arrays.asList(getAllName()).contains(name)){
            for(int i=index-1;i>0;i--) {
                if (items[i].getName().equals(name)){
                    this.j=i;
                    i=0;
                }
            }
            for(int i=j;i<index;i++){
                items[i]=items[i+1];
            }
            this.index--;
            System.out.println(index);
            return true;
        }
        else {
            return false;
        }
    }
    public Item[] sort(){
        for(int i=0;i<index-1;i++){
            for(int j=0;j<index-1;j++) {
                if(items[j].getCost()<items[j+1].getCost()){
                    Item min = items[j];
                    items[j]=items[j+1];
                    items[j+1]=min;
                }
            }
        }
        return items;
    }
    public boolean add(Item item){
        if(index==100){
            return false;
        }
        items[index]=item;
        index++;
        return true;
    }
    public Item[] toArray(){
        return items;
    }
    public void addItems(Item array[]){
        for(int i=0;i< array.length;i++){
            items[index]=array[i];
            index++;
        }
    }
    public int size(){
        int i=0;
        while (items[i]!=null){
            i++;
        }
        return i;
    }
    public Item[] getAllItem(){
        return items;
    }
    public int getCostTotal(){
        int cost=0;
        for(int i=0;i< index;i++){
                cost+=items[i].getCost();
        }
        return cost;
    }
    public int itemQuantity(Item item){
        int quantity=0;
        for(int i=0;i<index;i++){
            if (items[i].equals(item)) quantity++;
        }
        return  quantity;
    }
    public int itemQuantity(String name){
        int quantity=0;
        for(int i=0;i<index;i++){
                if (items[i].getName().equals(name)) quantity++;
        }
        return  quantity;
    }
    public String[] getAllName(){
        String names[]= new String[index];
        int j=0;
        for(int i=0;i<index;i++){
            names[j]=items[i].getName();
            j++;
        }
        return names;
    }
}
