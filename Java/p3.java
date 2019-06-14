import java.util.*;
public class p3
{
    static long gcd(long a,long b)
    {
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a;
        if(a == b)
          return a;
        if (a > b) 
        return gcd(a-b, b); 

        return gcd(a, b-a); 
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int q = ob.nextInt();
        long[] ar = new long[q];
        long[] ans = new long[q];
        for(int i = 0;i < q;i++)
        {
            ar[i] = ob.nextLong();
        }
        
        
        for(int i = 0; i < q; i++)
        {
            //int c = 0;
            long max = 0;
            for(int j = 1;j <= ar[i]-1;j++)
            {
                long a = j ^ (ar[i]);
                long b = j & (ar[i]);
                long m = gcd(a,b);
                if(m > max)
                max = m;
            }
            ans[i] = max;

        }
        for(int i = 0;i < q; i++)
        System.out.println(ans[i]);
    }
}