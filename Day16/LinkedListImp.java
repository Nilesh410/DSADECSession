package Day16;

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
public class LinkedListImp {
    public static void main(String[] args) {
        Node new_node=new Node(12);
        System.out.println(new_node.data);
        System.out.println(new_node.next);
    }
}
