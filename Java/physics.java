import java.util.*;
import java.lang.Math;
public class physics
{
    static double ForceValue(int x,int y,int z)
    {
        double ans = 0;
        double a = Math.pow(x,2);
        double b = Math.pow(y,2);
        double c = Math.pow(z,2);
        ans = Math.sqrt(a + b + c);
        return ans;
    }
     int Partition(double arr[],int low,int high)
        {
            double piv = arr[high];
            int i = low - 1;
            for(int j = low;j < high; j++)
            {
                if(arr[j] <= piv)
                {
                    i++;
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            double temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;
            return i+1;
        }

     void Sort(double[] arr,int low,int high)
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
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];

        for(int i = 0;i < n; i++)
        {
            x[i] = ob.nextInt();
            y[i] = ob.nextInt();
            z[i] = ob.nextInt();
        }
        double Force[] = new double[n];
        for(int i = 0; i < n; i++)
        {
            Force[i] = ForceValue(x[i],y[i],z[i]);
        }

        physics obj = new physics();
        obj.Sort(Force,0,n-1);
        double total = 0;
        for(int i = 0;i < n-1;i++)
        {
            total += Force[i];
        }
        if(Force[n-1] == total)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}