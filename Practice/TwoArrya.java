import java.util.Scanner;
public class TwoArrya {
    public static void main(String[] args) {
        int arr[][]={{2,3,},{1,2},{4,2}};
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
