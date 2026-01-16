package Day10;
import java.util.Scanner;
public class TwoDArray {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no of row:");
     int row=sc.nextInt();
     System.out.println("Enter the no of clmn:");
     int clmn=sc.nextInt();
     int arr[][]=new int [row][clmn];

     //Intialize the array elements
     System.out.println("Enter the array elements:");
     for(int i=0;i<row;i++)
     {
        for(int j=0;j<clmn;j++)
        {
            System.out.print("arr["+i+"]["+j+"]=");
            arr[i][j]=sc.nextInt();
        }
     }

     //Display the array elements
     System.out.println("Array elements are:");
      for(int i=0;i<arr.length;i++)
     {
        for(int j=0;j<arr[0].length;j++)
        {
            System.out.print(arr[i][j]+" ");  
        }
        System.out.println("");
     }

     //Search an element inside the 2 D array
     System.out.println("enter the value to search");
     int key=sc.nextInt();
     int flag=0;
     for(int i=0;i<arr.length;i++)
     {
        for(int j=0;j<arr[0].length;j++)
        {
            if(arr[i][j]==key)
            {
                flag=1;
                System.out.println("Element is present");
                break;
            }    
        }
     }
     if(flag==0)
        System.out.println("Element is not present");

   }
}
