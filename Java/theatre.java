import java.util.*;
import java.lang.Math;
public class theatre
{
    static long Pave(long nn, long mm, long aa)
    {
        double len = (double)nn/aa;
        len = Math.ceil(len);
        double br = (double)mm/aa;
        br = Math.ceil(br);
        long Final = (long)(len * br);
        return Final;
    }
    
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        long n = ob.nextLong();
        long m = ob.nextLong();
        long a = ob.nextLong();
        System.out.println(Pave(n,m,a));
    }
} 