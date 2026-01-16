package Day11;

public class StringJAVA1 {
    public static void main(String[] args) {
        String s="Hello Programmer";
        System.out.println("s="+s);

        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println("");
        String reverse="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse+=s.charAt(i);
           
        }
         System.out.println(reverse);
    }
}
