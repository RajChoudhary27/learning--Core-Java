enum Laptop{
    Macbook(2000),Victus(1500),Pavallion(1000),Ideapad(500);

    private int price;
    private Laptop(int price)
    {
        this.price=price;
    }
public int getPrice() {
    return price;
}

public void setPrice(int price) {
    this.price = price;
}
}
public class Enum3 {
    public static void main(String[] args) {
        Laptop lap=Laptop.Ideapad;
        System.out.println(lap);

        for(Laptop ss:Laptop.values())
        {
            System.out.println(ss);
        }
    }
}
