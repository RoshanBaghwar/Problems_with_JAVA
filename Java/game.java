import java.util.*;
public class game
{
    static int Ans(int n, int m)
    {
        int ans = 0;
        if(n == m)
        ans = 0;
        else if(n > m)
        ans = -1;
        else
        {
            while(n < m)
            {
                int x = n * 2;
                int y = n * 3;
                if(x < m)
                {
                    n = n * 2;
                    ans++;
                }
                else if(y < m)
                {
                    n = n * 3;
                    ans++;
                }
            }
            if(n > m)
            ans = -1;
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int m = ob.nextInt();
        System.out.println(Ans(n,m));
    }
}