import java.util.*;
public class button
{
    static int Ans(int n)
    {
        int count = 0;
        if(n > 1)
        {
        count = n + 1;
        int but = 0;
        int rem = 0;
        int loop = 0;
        for(int i = 2;i < n;i++)
        {
            loop++;
            but = i - 1;
            rem = n - i + 1;
            count = count + rem + but;
        }
        if(loop != 0)
        count = count + loop - 1;
        }
       else
       count = 1;

        return count;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        System.out.println(Ans(n));
    }
}