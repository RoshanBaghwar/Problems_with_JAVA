import java.util.*;
public class p1
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int b = ob.nextInt();
        int k = ob.nextInt();
        int a[] = new int[k];
        int n = 0;
        for(int i = 0;i < k;i++)
        {
            a[i] = ob.nextInt();
        }
        int pwr = k - 1;
        for(int i = 0;i < k; i++)
        {
            n += a[i] * (int)Math.pow(b,pwr);
            pwr--;
        }
        if(n % 2 == 0)
        System.out.println("even");
        else
        System.out.println("odd");
    }
}