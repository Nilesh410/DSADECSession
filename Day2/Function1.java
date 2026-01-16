class Demo
{
    public void display()
    {
        System.out.println("From Method of class Demo");
    }
}
public class Function1
{
    public static void main(String[] args) {
        System.out.println("Hello");
        Demo obj=new Demo();
        obj.display();
    }
}