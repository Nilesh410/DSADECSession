package Day8;

public class SelectionSort {
    public static void main(String[] args) {
         int arr[]={4,2,1,5,8};
        int n=arr.length;
        for(int i=0;i<n-1;i++)  //for no of passes 
        {
            int min=i;

            for(int j=i+1;j<n;j++) //for no of compare adjancent pair 
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;  //swap(arr[min],arr[i])
        }

        for(int k=0;k<n;k++)
        {
            System.out.println(arr[k]);
        }
    }
    
}
