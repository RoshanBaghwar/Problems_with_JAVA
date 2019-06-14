import java.util.*;
public class door
{
    
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int left0 = 0;
        int right1 = 0;
        int[] seq = new int[n];
        for(int i = 0;i < n;i++)
        {
            seq[i] = ob.nextInt();
            if(seq[i] == 1)
            right1++;
            else
            left0++;
        }
        int ans = 0, i = 0;
        while(left0 != 0 && right1 != 0)
        {
            ans++;
            if(seq[i] == 0)
            left0--;
            else
            right1--;
            i++;
        }

        System.out.println(ans);
    }
}