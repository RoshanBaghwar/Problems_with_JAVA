import java.util.Scanner;
class avg
{
	static int Ans(int[] arrA, int total, int n)
	{

	}
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		int arrA[] = new int[n];
		ArrayList<Data> arrAList = new ArrayList<Data>();
		int total = 0;
		for(int i = 0; i < n; i++)
		{
			arrA[i] = ob.nextInt()
			total += arrA[i];
		}
	}
	System.out.println(Ans(arrA, total, n));
}

class Data
{
	int x,y;
	Data(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}