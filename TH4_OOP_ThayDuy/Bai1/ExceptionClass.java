package Bai1;

public class ExceptionClass extends Exception{
    private int price;
    public void setPrice(int price) throws IllegalArgumentException
    {
        if(price > 20000000) 
        {
            throw new IllegalArgumentException("Tong tien phu kien vuot qua 20 trieu");
        }
        this.price = price;
    }
}
