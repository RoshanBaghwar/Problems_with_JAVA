import java.util.*;
public class divisible
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        //divisible obj = new divisible();
        int t = ob.nextInt();
        int T = t;
        int[] l = new int[T];
        int[] r = new int[T];
        int ansX[] = new int[T];
        int ansY[] = new int[T];
        for(int i = 0;i < T;i++)
        {
                l[i] = ob.nextInt();
                r[i] = ob.nextInt();
        }
       
        int j = 0;
        int x,y;

            while(j < T)
            {
                x = l[j];
                y = r[j];
                if(y/x >= 2)
                {
                    if(y % x == 0)
                    {
                     ansX[j] = x;
                     ansY[j] = y;

                    }
                    else{
                        for(int i = y-1;i > x;i--)
                        {
                            if(i % x == 0)
                            {
                                ansX[j] = x;
                                ansY[j] = i;
                            }
                        }
                    }
                }
                
                j++;
            }
        
        
        for(int i = 0; i < T;i++)
        {
            System.out.println(ansX[i]+" "+ansY[i]);
        }
    }
}