package Prak16;

final class Drink implements Item{
    private String name, description;
    int cost;
    public Drink(String name,String description)throws  IllegalArgumentException{
        if((name==null)||(description==null)){
            throw new IllegalArgumentException("Произошла ошибка, отсутствует имя или описание");
        }
        this.name = name;
        this.description = description;
        cost = 0;
    }
    public Drink(String name,String description,int cost)throws IllegalArgumentException{
        if((name==null)||(description==null)||(cost==0))
            throw new IllegalArgumentException("Произошла ошибка, отсутствует имя, цена или описание");
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getCost(){
        return cost;
    }
}
