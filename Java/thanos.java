import java.util.*;
public class thanos
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = ob.nextInt();
        }
        int total = 0;
        if(arr[0] <= arr[n/2] && arr[n/2] <= arr[n-1])
        {
            for(int i = 0; i < n-1; i++)
            {
                if(arr[i] <= arr[i+1])
                total++;
            }
            System.out.println(total+1);
        }
        else if(arr[0] <= arr[(n/2) - 1])
        {
            for(int i = 0; i < (n/2)-1; i++)
            {
                if(arr[i] <= arr[i+1])
                total++;
            }
            System.out.println(total);
        }
        else if(arr[n/2] <= arr[n-1])
        {
            for(int i = n/2; i < n-1; i++)
            {
                if(arr[i] <= arr[i+1])
                total++;
            }
            System.out.println(total);
        }
        else
        {
            for(int i = 0; i < n-1; i++)
            {
                if(arr[i] > arr[i+1])
                break;
                else
                total++;
            }
            System.out.println(total+1);
        }
    }
}