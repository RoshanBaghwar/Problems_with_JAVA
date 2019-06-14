import java.util.*;
public class compote
{
    static int Ans(int a, int b, int c)
    {
        int base = 0;
        int aa = 1;
        int bb = 2;
        int cc = 4;
        while(a >= aa && b >= bb && c >= cc)
        {
            base++;
            aa++;
            bb = 2 * aa;
            cc = 4 * aa;
        }
        int ans = base + base * 2 + base * 4;
        return(ans);
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        int c = ob.nextInt();
        System.out.println(Ans(a, b, c));
    }
}