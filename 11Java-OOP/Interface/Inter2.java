interface Laptop
{
   default void code()
    {
        System.out.println("Working through Laptop..");
    }

    void work(Laptop lap);
}
class Developer implements Laptop
{
   public  void work(Laptop lap)
    {
        System.out.println("Coding...");
        lap.code();
    }
   public void code()
    {
        System.out.println("Code...");
    }
}
public class Inter2 {
    public static void main(String[] args) {
        Laptop lap=new Developer();
        lap.work(lap);
    }
}
