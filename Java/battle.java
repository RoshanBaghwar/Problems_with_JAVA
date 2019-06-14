import java.util.*;
class battle
{
    static long Ans(long l, long r, long[] A, long[] B)
    {
        long ans = 0;
        for(long i = l-1; i < r; i++)
        {
            ans += A[i] * B[i];
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        long N = ob.nextLong(); long Q = ob.nextLong();
        long A[] = new long[N];
        for(long i = 0; i < N; i++)
        {
            A[i] = ob.nextLong();
        }
        long[] B = new long[N];
        for(long i = 0; i < N; i++)
        {
            B[i] = ob.nextLong();
        }
        for(long i = 0; i < Q; i++)
        {
            long l = ob.nextLong();
            long r = ob.nextLong();
            System.out.println(Ans(l, r, A, B));
        }
    }
}
