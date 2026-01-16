package StackCodes;
class Stack1
{
    int size;
    int arr[];
    int top;

    public Stack1(int s)
    {
        size=s;
        arr=new int[size];
        top=-1;
    }
    public boolean isFull()
    {
        if(top==size-1)
            return true;
        else
            return false;
    }
    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    public void push(int num)
    {
        if(isFull())
            System.out.println("Stack is full we cant insert the element");
        else
        {
            top++;
            arr[top]=num;
        }
    }
    public void pop()
    {
        if(isEmpty())
            System.out.println("Stack is empty we cant perform the pop operation");
        else
        {
            System.out.println("Pop ele="+arr[top]);
            top--;
        }
    }
    public void display()
    {
        for (int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public void peek()
    {
        System.out.println("Peek ele="+arr[top]);
    }
    public void size()
    {
        System.out.println("Size of stack="+(top+1));
    }
}
public class Stack_Implementation
{
    public static void main(String args[])
    {
        Stack1 obj=new Stack1(5);
        obj.push(12);
        obj.push(7);
        obj.push(34);
        obj.push(52);
        obj.display();
        obj.pop();
        obj.pop();
        obj.display();
        obj.peek();
        obj.size();
    }
}