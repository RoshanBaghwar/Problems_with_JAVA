import java.util.Scanner;
public class room
{
    
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        Arr[] obj2 = new Arr[n];

        for(int i = 0;i < n;i++)
        {
            int p = ob.nextInt();
            int q = ob.nextInt();
            obj2[i] = new Arr(p,q);
        }
        int ans = 0;
        for(int i = 0;i <n;i ++)
       {
           if(obj[i].q > obj[i].p)
           {
               if(obj[i].q - obj[i].p >= 2)
               ans++;
           } 
       }
       System.out.println(ans);
    }
}
class Arr
{
    int p,q;
    Arr(int a,int b)
    {
        p = a;
        q = b;
    }

    Arr getData()
    {
        Arr RetObj = new Arr(p,q);
        return RetObj;
    }
}