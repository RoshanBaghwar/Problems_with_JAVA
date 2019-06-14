import java.util.*;
public class nirvana
{
    static String Change(long n)
    {
        String data = "";
        long m = n;
        long dig = 0;
        boolean found = false;
        while(m != 0)
        {
            dig = m % 10;
            if(dig == 0)
            {
                found = true;
                data = 9 + data;
            }
            else
            {
                if(found == true)
                {
                    dig = dig - 1;
                    found = false;
                    data = dig + data;
                }
                else
                {
                    if(dig != 0)
                    data = dig + data;
                }
            }

            m = m / 10;
        }

        return data;
    }

    static long Ans(long n)
    {
        long pro = 1;
        long dig = 0;
        while(n != 0)
        {
            dig = n % 10;
            pro = pro * dig;
            n = n / 10;
        }
        return pro;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        long n = ob.nextLong();
        String newNum = Change(n);
    
        long newData = Integer.parseInt(newNum);
        
        System.out.println(Ans(newData));
    }
}
