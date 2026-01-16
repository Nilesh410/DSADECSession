package String;

public class CharCount {
    public static void main(String[] args) {
        String s="Hello Programmer";
        charCountMethod(s);
    }
    public static void charCountMethod(String s)
    {
        String updated_string=s.toLowerCase();
        int arr[]=new int[26];

        for (int i=0;i<updated_string.length();i++)
        {
            char c=updated_string.charAt(i);
            if(c>='a'&&c<='z')
            {
                arr[c-'a']++;
            }
        }
        int maxCount=0;
        char result=' ';
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                if(maxCount<arr[i])
                {
                    maxCount=arr[i];
                    result=(char)(i+'a');
                }
            }
        }
        System.out.println("max chr occ="+result+" and count ="+maxCount);
    }
}
