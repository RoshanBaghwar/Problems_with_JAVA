import java.util.*;
public class nextround
{
    static int NextRound(int[] score, int k)
    {
        int count = 0;
        for(int i = 0; i < score.length; i++)
        {
            if(score[i] == 0)
            break;
            else
            {
                if(score[i] >= k)
                count ++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int k = ob.nextInt();
        int[] score = new int[n];
        for(int i = 0; i < n; i++)
        {
            score[i] = ob.nextInt();
        }
        System.out.println(NextRound(score,score[k-1]));
    }
}