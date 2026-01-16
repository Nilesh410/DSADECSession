public class Bubble {
    public static void main(String[] args) {
        int arr[]={2,4,1,5,8};
        int n=arr.length;
        for(int i=0;i<n-1;i++)  //for no of passes 
        {
            for(int j=0;j<n-1-i;j++) //for no of compare adjancent pair 
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}
