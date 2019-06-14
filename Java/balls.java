import java.util.*;
public class balls
{
    static long Ans(long A, long B, long x, long y, long z)
    {
        long ans = 0;
        long yellow = 0;
        long blue = 0;

        //for yellow
        yellow += x * 2;
        //for green
        yellow += y * 1;
        blue += y * 1;
        //for blue
        blue += z * 3;

        if(yellow > A)
        ans += yellow - A;
        if(blue > B)
        ans += blue - B;

        return ans;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        long A = ob.nextLong(); long B = ob.nextLong();
        long x = ob.nextLong(); long y = ob.nextLong(); long z = ob.nextLong();

        System.out.println(Ans(A, B, x, y, z));
    }
}