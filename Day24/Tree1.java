class TNode
{
    int data;
    TNode left;
    TNode right;
    public TNode(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
public class Tree1
{
    public static void main(String[] args) {
        //Creation and Connection of Tree
        TNode root=new TNode(1);
        root.left=new TNode(2);
        root.right=new TNode(3);
        root.right.left=new TNode(4);
        root.right.left.left=new TNode(5);
        root.right.left.right=new TNode(6);

        //Display the tree elements
        System.out.println("PreOrder=");
        preOrder(root);
        System.out.println("");
        System.out.println("InOrder=");
        inOrder(root);
        System.out.println("");
        System.out.println("PostOrder=");
        postOrder(root);
        System.out.println("");

    }
    public static void preOrder(TNode root)
    {
        if(root!=null)
        {
            System.out.print(root.data+"->");
            preOrder(root.left);
            preOrder(root.right);
        }
      
    }
     public static void inOrder(TNode root)
    {
         if(root!=null)
        {
            inOrder(root.left);
            System.out.print(root.data+"->");
            inOrder(root.right);
        }
        
    }
     public static void postOrder(TNode root)
    {
         if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"->");
        }
       
    }
}