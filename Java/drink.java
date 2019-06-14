import java.util.*;
public class drink
{
    static int Ans(int[] price, int coin)
    {
        drink ob = new drink();
        int ans = 0;
        int n = price.length;
        int min = price[0];
        int max = price[n-1];
        if(coin < min)
        ans = 0;
        else if(coin > max)
        ans = n;
        else
        {
            ans = ob.Find(price, coin);
        }

        return ans;
    }
    
    int Find(int[] arr, int coin)
    {
        int count = 0;
        int l = arr.length;
        for(int i = 0;i < l;i++)
        {
            if(arr[i] > coin)
            break;
            else
            count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] price = new int[n];
        for(int i = 0;i < n;i++)
        {
            price[i] = ob.nextInt();
        }
        int q = ob.nextInt();
        int[] coin = new int[q];
        for(int i = 0;i < q;i++)
        {
            coin[i] = ob.nextInt();
        }
        int[] ans = new int[q];
        
        QuickSort obj = new QuickSort();
        obj.Sort(price, 0, n-1);
        
        for(int i = 0;i < q;i++)
        {
            ans[i] = Ans(price, coin[i]);
        }

        for(int i = 0;i < q;i++)
        {
            System.out.println(ans[i]);
        }
    }
}

class QuickSort
{
    int Partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low;j < high; j++)
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

    void Sort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pi = Partition(arr, low, high);
            Sort(arr, low, pi-1);
            Sort(arr, pi+1, high);
        }
    }
}