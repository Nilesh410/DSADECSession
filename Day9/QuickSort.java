package Day9;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={51,95,66,72,42,38,39,41,15};
        int left=0;
        int right=arr.length-1;
        
        quicksort(arr,left,right);

    }
    public static void quicksort(int arr[],int left,int right)
    {
       if(left<right)
       {
          int p=partition(arr,left,right);
          quicksort(arr,left,p-1);
          quicksort(arr,p+1,right);
       }
       for(int i=0;i<arr.length;i++)
       {
          System.out.print(arr[i]+" ");
       }
       System.out.println("");
    }
    public static int partition(int arr[],int left,int right)
    {
        int pivot=arr[left];
        int count=0;
        for(int i=left+1;i<=right;i++)
        {
            if(arr[i]<pivot)
            {
                count++;
            }
        }
        int p=left+count;
        int temp=arr[left];
        arr[left]=arr[p];
        arr[p]=temp;
        int i=left,j=right;
        while(i<p&&j>p)
        {
            while(arr[i]<pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            int temp1=arr[i];
            arr[i]=arr[j];
            arr[j]=temp1;
        }
        return p;
    }

}
