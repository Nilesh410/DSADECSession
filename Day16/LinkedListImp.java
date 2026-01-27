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
    public void insertInBetween(int num,int pos)
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return;
        }
        Node newNode=new Node(num);
        Node curr=head;
        Node prev=null;
        while(curr.data!=pos && curr!=null)
        {
            prev=curr;
            curr=curr.next;
        }
        if(curr==null)
        {
            System.out.println("Linked does not have that pos");
            return ;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }
    public void deleteFirstNode()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return ;
        }
        head=head.next;
    }
    public void deleteLastNode()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return ;
        }
        else if(head.next==null)
        {
            head=null;
            return ;
        }
        else
        {
            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    public void deleteAnyNode(int value)
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return ;
        }
        Node prev=null;
        Node curr=head;
        while(curr.data!=value&&curr!=null)
        {
            prev=curr;
            curr=curr.next;
        }
        if(curr==null)
        {
            System.out.println("Linked list does not have that value");
            return ;
        }
        prev.next=curr.next;
    }
}
public class LinkedListImp {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insertAtFirst(12);
     
    }
}
