import java.util.*;
import java.lang.*;
class sub
{
	static long Ans(long arr[], int n, int p)
	{
		long andValue = 1, totaland = 1;
		int i, j;
		long diff[] = new long[n];
		for(i = 0; i < n; i++)
		{
			andValue = 0;
			for(j = i; j < n; j++)
			{
				andValue = (andValue & arr[j]);
				diff[i] = Math.abs(p - andValue);
				totaland = totaland & andValue;
			}

		}
		System.out.println("TotalAnd");
		System.out.println(totaland);
		System.out.println("diff");
		long min = diff[0];
		for(i = 0; i < n; i++)
		{
			if(diff[i] <= min)
				min = diff[i];
			System.out.print(diff[i]+ " ");
		}
		return min;

	}
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		int T = ob.nextInt();
		while(T != 0)
		{
			T--;
			int n = ob.nextInt();
			int p = ob.nextInt();
			long A[] = new long[n];
			for(int i = 0; i < n; i++)
			{
				A[i] = ob.nextLong();
			}
			System.out.println(Ans(A, n, p));
		}
	}
}