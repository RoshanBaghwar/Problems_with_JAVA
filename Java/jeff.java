import java.util.Scanner;
public class jeff
{
	static String Ans(int[] arr, int d0, int d5)
	{
		String ans = "";
		if(d0 == 0)
			ans = "-1";
		else
		{
			if(d5 < 9)
				ans = "0";
			else
			{
				int q = d5 / 9;
				int total = q * 9;
				for(int i = 0; i < total; i++)
				{
					ans += "5";
				}
				for(int i = 0; i < d0; i++)
				{
					ans += "0";
				}
			}
		}

		return ans;
	}
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		int arrA[] = new int[n];
		int digit5 = 0;
		int digit0 = 0;
		for(int i = 0; i < n; i++)
		{
			arrA[i] = ob.nextInt();
			if(arrA[i] == 0)
				digit0++;
			else
				digit5++;
		}
		System.out.println(Ans(arrA, digit0, digit5));
	}
}