package Day16;

//Node creation 
class Node    
{
    public int data;
    public Node next;
    public Node(int num)
    {
        data=num;
        next=null;
    }
}
class LinkedList
{
    Node head;
    public LinkedList()
    {
        head=null;
    }
    public void insertAtFirst(int num)
    {
        Node newNode=new Node(num);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }
    public void insertAtLast(int num)
    {
        Node newNode=new Node(num);
        if(head==null)
        {
            head=newNode;
        }
        else if(head.next==null)
        {
            head.next=newNode;h
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
}
public class LinkedListImp {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insertAtFirst(12);
     
    }
}
