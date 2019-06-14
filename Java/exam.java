import java.util.Scanner;
public class exam
{
	static String Ans(String arr[], int n)
	{
		String ans = "";
		int check1 = 0, check2 = 0, check3 = 0;
		char x = arr[0].charAt(0);
		char y = arr[0].charAt(1);
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				char a = arr[i].charAt(j);
				if(i == j)
				{
					if(a == x)
						check1++;
				}
				else if(i + j == n-1)
				{
					if(a == x)
						check2++;
				}
				else
				{
					if(a != x && a == y)
						check3++;
				}
			}
		}

		if(check1 == n && check2 == n && check3 == (n*n - 2*n + 1))
			ans = "YES";
		else
			ans = "NO";

		return ans;
	}

	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		String arr[] = new String[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = ob.next();
		}
		String ans = Ans(arr, n);
		System.out.println(ans);
	}
}