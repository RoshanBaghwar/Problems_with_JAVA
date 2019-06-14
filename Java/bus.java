import java.util.*;
public class bus
{
	static int BinarySearch(Data[] arr, int low, int high, int value)
	{
		if(high >= low)
		{
			int mid = (high + low) / 2;
			if(arr[mid].s == value)
				return arr[mid].pos;
			if(arr[mid].s > value)
			{
				return (BinarySearch(arr, low, mid - 1, value));
			}
			else
			{
				return (BinarySearch(arr, mid + 1, high, value));
			}
		}
		return -1;
	}
	static int Ans(Data[] arr, int n, int t)
	{
		
		int found = BinarySearch(arr, 0 , n-1, t);
		int ans[] = new int[n];
		int pos = 0;
		if(found != -1)
		{
			pos = found;
		}
		else
		{
				for(int i = 0; i < n; i++)
				{
					int start = arr[i].s;
					int stop = start + t * arr[i].d;
					for(int j = start; j <= stop; j++)
					{
						if(j >= t)
						{
							ans[i] = j - t;
							break;
						}
						j = j + arr[i].d;
					}
				}
			
			int min = 0;
			int index = 0;
			for(int i = 0; i < n; i++)
			{
				if(ans[i] <= min)
					{
						min = ans[i];
						index = i;
					} 
			}
			pos = arr[index].pos;
		}
		return pos;
	}
	
	public static void main(String args[])
	{
		Scanner ob = new Scanner (System.in);
		int n = ob.nextInt(); int t = ob.nextInt();
		Data[] data = new Data[n];
		for(int i = 0; i < n; i++)
		{
			int s = ob.nextInt();
			int d = ob.nextInt();
			data[i] = new Data(s, d, i+1);
		}
		
		Arrays.sort(data, new Sortbys());

		System.out.println(Ans(data, n, t));
	}
}
class Data
{
	int s, d, pos;
	Data(int s, int d, int pos)
	{
		this.s = s;
		this.d = d;
		this.pos = pos;
	}
}
class Sortbys implements Comparator <Data>
{
	public int compare(Data a, Data b)
	{
		return (a.s - b.s);
	}
}