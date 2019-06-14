import java.util.*;
import java.lang.Math;
public class beautiful
{
    static int Swap(int[][] arr)
    {
        int count = 0;
        int r = 0,c = 0;
        for(int i = 0;i < 5;i++)
        {
            for(int j = 0;j < 5; j++)
            {
                if(arr[i][j] == 1)
                {
                    r = i + 1;
                    c = j + 1;
                    break;
                }
            }
        }
        count = Math.abs(3 - r) + Math.abs(3 - c);
        return count;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        int[][] ar = new int[5][5];
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j ++)
            {
                ar[i][j] = ob.nextInt();
            }
        }
        
        System.out.println(Swap(ar));
    }
}