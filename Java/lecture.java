import java.util.*;
public class lecture
{
    static int Search(String[] note, int low, int high, String key)
    {
        if(low <= high)
        {
            int mid = (low + high) / 2;
            if(note[mid] == key)
            return mid;

            if(note[mid] > key)
            {return Search(note, low, mid-1, key);}

            else
            return Search(note, mid+1, high, key);
        }
        return -1;
    }
    static void Ans(ArrayList<Data> Lang, String[] note)
    {
        int len = note.length;
        int len1, len2;
        String[] ans = new String[len];
        for(int i = 0;i < len;i++)
        {
            String key = note[i];
            int index = Search(note, 0, len-1, key);
        }
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int m = ob.nextInt();
        ArrayList<Data> Lang = new ArrayList<Data>();
        for(int i = 0;i < m;i++)
        {
            String l1 = ob.next();
            String l2 = ob.next();
            Lang.add(new Data(l1, l2));
        }
        String[] note = new String[n];
        for(int i = 0;i < n;i++)
        {
            note[i] = ob.next();
        }
        lecture obj = new lecture();
        obj.Ans(Lang, note);
    }
}
class Data
{
    String l1, l2;
    Data(String l1, String l2)
    {
        this.l1 = l1;
        this.l2 = l2;
    }
}