import java.util.Scanner;
public class ArrayCreation
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:=");
        n=sc.nextInt();
        int arr[]=new int[n];

        //Intilization
        System.out.println("Enter the array elements=");
        for(int i=0;i<n;i++)
        {
            System.err.println("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }

        //Display
        System.out.println("Array Elements are=");
        for(int i=0;i<n;i++)
        {
            System.out.println("arr["+i+"]="+arr[i]);
        }

        //Search
        System.out.println("Enter the ele to search=");
        int searchele=sc.nextInt();
        int i=0;
        for(i=0;i<n;i++)
        {
            if(searchele==arr[i])
            {
                System.out.println("ele is present at index no="+i);
                return;
            }
        }
        if(i==n)
             System.out.println("Ele is not present");

    
        //Largest Ele from given array
        int largestvalue=arr[0];
        for(int k=0;k<n;k++)
        {
            if(arr[k]>largestvalue)
                    largestvalue=arr[k];
        }
        System.out.println(largestvalue);
    }

    

}