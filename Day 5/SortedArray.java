public class SortedArray {
    public static void main(String[] args) {
        int arr[]={5,12,24,31,36};

        boolean result=sortedArray1(arr,arr.length);
        if(result==true)
            System.out.println("Given array is sorted");
        else
            System.out.println("Given array is not sorted");
    }

    public static boolean sortedArray1(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }
}
