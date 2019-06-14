import java.util.*;
public class p2
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt(); long m = ob.nextLong(); int k = ob.nextInt();
        long[] ar = new long[n];
        int[] len = new int[n-1];
        for(int i = 0;i < n; i++)
        {
            ar[i] = ob.nextLong();
        }
        for(int i = 0;i < n-1; i++)
        {
            len[i] = (int)(Math.abs(ar[i] - ar[i+1]) + 1);
        }
        int lengt = len.length;
        for(int i = 0;i < lengt-1; i++)
        {
            for(int j = 0;j < lengt-1-i; j++)
            {
                if(len[j] > len[j+1])
                {
                    int temp = len[j];
                    len[j] = len[j+1];
                    len[j+1] = temp;
                }
            }
        }
        int Length = 0;
        for(int i = 0;i < k;i++)
        {
            Length += len[i];
        }
        System.out.println(Length);

    }
}