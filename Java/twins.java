import java.util.Scanner;
public class twins
{
    static int Ans(int[] arr)
    {
        int total = 0;
        int len = arr.length;
        int count = 0;
        int grt = 0;
        int rem = 0;
        for(int i = 0;i < len;i++)
        {
            total += arr[i];
        }

        for(int i = len-1;i >= 0;i--)
        {
            grt += arr[i];
            rem = total - grt;
            count++;
            if(grt > rem )
            {
                //count++;
                break;
            }
        }
        return count;
    }
    int Partition(int arr[],int low,int high)
    {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low;j < high;j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    void Sort(int arr[],int low,int high)
    {
        if(low < high)
        {
            int pi = Partition(arr,low,high);
            Sort(arr,low,pi-1);
            Sort(arr,pi+1,high);
        }
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int coin[] = new int[n];
        for(int i = 0;i < n; i++)
        {
            coin[i] = ob.nextInt();
        }

        twins obj = new twins();
        obj.Sort(coin,0,n-1);

        int ans = Ans(coin);
        System.out.println(ans);
        for(int i = 0;i < coin.length;i++)
        System.out.print(coin[i]+" ");
    }
}