import java.util.*;
import java.lang.*;
public class stone
{
    static int Ans(String s)
    {
        int count = 0;
        char a,b;
        for(int i = 0; i < s.length() - 1; i++)
        {
            a = s.charAt(i);
            b = s.charAt(i+1);
            if(a == b)
            {
                //remov = i + 1;
                count ++;
            }
        
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        String s = ob.next();
        s = s + " ";
        System.out.println(Ans(s));
    }
}