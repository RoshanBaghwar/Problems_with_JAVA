import java.util.*;
public class trip
{
    int Partition(Array ar[],int low,int high)
    {
        int pivot = ar[high].a;
        int i = low - 1;
        for(int j = low;j < high; j++)
        {
            if(ar[j].a >= pivot)
            {
                i++;
                int temp = ar[i].a;
                ar[i].a = ar[j].a;
                ar[j].a = temp;
            }
        }
        int temp = ar[i+1].a;
        ar[i+1].a = ar[high].a;
        ar[high].a = temp;

        return i+1;
    }
    void Sort(Array ar[],int low,int high)
    {
        if(low < high)
        {
            int pi = Partition(ar,low,high);
            Sort(ar,low,pi-1);
            Sort(ar,pi+1,high);
        }
    }
   
    static int Ans(Array ar[],int k)
    {
        int ans = 0;
        if(k == 0)
        ans = 0;

        else
        {
            int count = 0;
            int sum = 0;
            for(int i = 0; i < 12;i++)
            {
                sum += ar[i].a;
                count++;
                if(sum >= k)
                {
                    ans = count;
                    break;
                }
                
            }
            if(sum < k)
            ans = -1;

        }

        return ans;
    }

    
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int k = ob.nextInt();
        Array ar[] = new Array[12];
        int a;
        for(int i = 0; i < 12; i++)
        {
            a = ob.nextInt();
            ar[i] = new Array(a);
        }

        trip obj = new trip();
        obj.Sort(ar,0,11);
        
        System.out.println(Ans(ar,k));
    }
}

class Array
{
    int a;
    Array(int a)
    {
        this.a = a;
    }
}