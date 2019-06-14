import java.util.*;
public class watermelon
{
    static boolean check(int n)
    {
        boolean rtn = false;
        if(n == 2)
        {
            rtn = false;
        }
        else if(n % 2 == 0)
        {
            int a = n - 2;
            if(a % 2 == 0)
            rtn = true;
        }
        return rtn;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        int w = ob.nextInt();
        boolean ans = check(w);
        if(ans == true)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}