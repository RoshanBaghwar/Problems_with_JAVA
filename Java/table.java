import java.util.*;
public class table {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[][] ar = new int[n][n];
        for(int i = 0; i < n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                if(i == 0 || j == 0)
                {
                    ar[i][j] = 1;
                }
                else
                {
                    ar[i][j] = ar[i-1][j] + ar[i][j-1];
                }
            }
        }
        System.out.println(ar[n-1][n-1]);
    }
}
