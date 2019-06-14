import java.util.*;
public class toolong
{
    static String Ans(String str)
    {
        int len = str.length();
        if(len <= 10)
        return str;
        else
        {
        char a = str.charAt(0);
        char b = str.charAt(len-1);
        len -= 2;
        String newStr = "" + a + len + b;
        return newStr;
        }
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        String word[] = new String[n];
        for(int i = 0; i < n; i++)
        {
            word[i] = ob.next();
        }
        for(int j = 0; j < n; j++)
        {
            System.out.println(Ans(word[j]));
        }
    }
}