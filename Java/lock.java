import java.util.*;
public class lock
{
    static int Pattern(int n,ArrOrg[] org,ArrReq[] req)
    {
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            int a = (int)Math.abs(org[i].org - req[i].req);
            int Max = (int)Math.max(org[i].org, req[i].req);
            int Min = (int)Math.min(org[i].org, req[i].req);
            int b = (9 - Max) + Min + 1;
            if(a < b)
            count += a;
            else
            count += b;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        String Original = ob.next();
        String Required = ob.next();
        ArrOrg[] org = new ArrOrg[n];
        ArrReq[] req = new ArrReq[n];

        for(int i = 0; i < n; i++)
        {
            char c = Original.charAt(i);
            String str = "" + c;
            int dig = Integer.parseInt(str);
            org[i] = new ArrOrg(dig);
        }

        for(int i = 0; i < n; i++)
        {
            char c = Required.charAt(i);
            String str = "" + c;
            int dig = Integer.parseInt(str);
            req[i] = new ArrReq(dig);
        }
        
        System.out.println(Pattern(n,org,req));
    }
}
class ArrOrg
{
    long org;
    ArrOrg(long org)
    {
        this.org = org;
    }
}
class ArrReq
{
    long req;
    ArrReq(long req)
    {
        this.req = req;
    }
}