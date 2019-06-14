import java.util.Scanner;
public class banana
{
    static int Total(int k,int n,int w)
    {
        int total = 0;
        for(int i = 1;i <= w;i++)
        {
            total += k*i;
        }
        return total;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int k = ob.nextInt(); int n = ob.nextInt(); int w = ob.nextInt();
        

        int ans = Total(k,n,w) - n;
        if(ans < 0)
        System.out.println(0);
        else
        System.out.println(ans);
    }
}