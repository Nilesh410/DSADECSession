package Day14.QueueImplementation;

class Queue
{
    int arr[];
    int front; 
    int rear;
    public Queue()
    {
        arr=new int[5];
        front=rear=-1;
    }
    public void enqueue(int num)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
        }
        else
        {
            if(front==-1&&rear==-1)
            {
                front++;
                rear++;
                arr[rear]=num;
            }
            else
            {
                rear++;
                arr[rear]=num;
            }
        }
    }
    public boolean isFull()
    {
        if(rear==arr.length-1)
        {
            return true;
        }
        else
            return false;
    }
    public boolean isEmpty()
    {
        if(rear==-1)
        {
            return true;
        }
        else
            return false;
    }
    public void dequeue()
    {
        if(isEmpty())
            System.out.println("Queue is empty");
        else
        {
            System.out.println("Dequeue element:="+arr[front]);
            front++;
        }

    }

    public void display()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}

public class QueueImplement {
    public static void main(String[] args) {
        Queue obj=new Queue();
        obj.enqueue(10);
        obj.enqueue(23);
        obj.enqueue(54);
        obj.enqueue(50);
        obj.enqueue(100);
        System.out.println("Queue Element");
        obj.display();
        obj.enqueue(78);
        obj.dequeue();
        System.out.println("Queue Element");
        obj.display();
        obj.enqueue(78);
        System.out.println("Queue Element");
        obj.display();
       
    }
}
