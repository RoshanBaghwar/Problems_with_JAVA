import java.util.*;
public class atm
{
    static double Ans(int x, double y)
    {
        double ans = 0;
        if(x > y)
        ans = y;
        else{
            if(x % 5 == 0)
            {
                ans = y - x - (0.50);
            }
            else
            ans = y;
        }
        
        return ans;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int x = ob.nextInt();
        double y = ob.nextDouble();
        System.out.println(Ans(x,y));
    }
}