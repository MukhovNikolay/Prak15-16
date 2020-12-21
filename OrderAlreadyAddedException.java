package Prak16;

public class OrderAlreadyAddedException extends Exception{
    public OrderAlreadyAddedException (String errorMes){
        super(errorMes);
    }
}
