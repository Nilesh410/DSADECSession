public class MissingNumber
{
    public static void main(String[] args) {
        int arr[]={6,2,5,3,1,7,8,9,10};
        int n=arr.length+1;
        int totalsum=n*(n+1)/2;
        int arraysum=0;
        for(int i=0;i<arr.length;i++)
        {
            arraysum+=arr[i];
        }
        System.out.println(totalsum-arraysum);
    }
}