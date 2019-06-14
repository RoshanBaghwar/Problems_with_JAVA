import java.util.*;
public class twoSum{

static int[] twoSum(int[] nums, int target) {
    int[] ans = new int[2];
    //int check = -5;
    for(int i = 0; i < nums.length;i++)
    {
        int n = nums[i];
        int find = target - check;
        int check = Search(nums,0,nums.length-1,find,i); 
        if(check != -5)
        {
            ans[0] = i;
            ans[1] = check;
            break;
        }
    }
    return ans;
}
static int Search(int[] arr,int low,int high,int x,int i)
{
    if(high >= low)
    {
    int mid = (high + low) / 2;
    if(arr[mid] == x && mid != i)
    return mid;
    if(arr[mid] > x)
    return Search(arr,low,mid-1,x,i);
    else
    return Search(arr,mid+1,high,x,i);
    }
    return -1;
}
public static void main(String args[])
{
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    int t = ob.nextInt();
    int[] ar = new int[n];
    for(int i = 0;i < n; i++)
    {
        ar[i] = ob.nextInt();
    }
    int[] sol = twoSum(ar,t);
    for(int i = 0; i < sol.length; i++)
    System.out.print(sol[i]+" ");
}
}