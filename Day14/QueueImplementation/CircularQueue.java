package Day14.QueueImplementation;

class CQueue
{
    int arr[];
    int front; 
    int rear;
    public CQueue()
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
                front=(front+1)%arr.length;
                rear=(rear+1)%arr.length;
                arr[rear]=num;
            }
            else
            {
                rear=(rear+1)%arr.length;
                arr[rear]=num;
            }
        }
    }
    public boolean isFull()
    {
        if((rear+1)%arr.length==front)
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
            if(front==rear)
            {
                front=rear=-1;
            }
            else
            {
                 front=(front+1)%arr.length;
            }
            
        }

    }

    public void display()
    {
        int i=front;
        while(true)
        {
            System.out.println(arr[i]);
            if(i==rear)
                break;
            i=(i+1)%arr.length;
        }
        System.out.println("");
    }
}

public class CircularQueue {
    public static void main(String[] args) {
         CQueue obj=new CQueue();
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
