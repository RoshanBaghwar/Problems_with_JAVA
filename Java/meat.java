import java.util.*;
public class meat
{
    static int Answer(Array[] ar,int n)
    {
        int ans = ar[0].p * ar[0].a;
        int Price = ar[0].p;
        
        for(int i = 1;i < n;i++)
        {
            if(ar[i].p < Price)
            {
                ans += ar[i].p * ar[i].a;
                Price = ar[i].p;
            }
            else{
                ans += Price * ar[i].a;
            }
            
        }
        
        return ans;

    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        Array[] ar = new Array[n];
        for(int i = 0; i < n; i++)
        {
            int a = ob.nextInt();
            int p = ob.nextInt();
            ar[i] = new Array(a,p);
        }
        System.out.println(Answer(ar,n));
    }
}
class Array
{
    int a,p;
    Array(int a,int p)
    {
        this.a = a;
        this.p = p;
    }
}