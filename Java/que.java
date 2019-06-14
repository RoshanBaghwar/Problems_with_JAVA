import java.util.*;
public class que
{
    static String Ans(String s,int t)
    {
        String ans = "";
        String str = s;
        int len = str.length();
        
        ArrayList<Integer> pos = new ArrayList<Integer>();
        for(int j = 1;j <= t;j++)
        {
            for(int i = 0;i < len-1; i++)
            {
                String c = "" + str.charAt(i) + str.charAt(i+1);
                if(c.equals("BG"))
                {
                    pos.add(i);
                }

            }
            if(pos.size() != 0)
            {
                for(int i = 1;i <= pos.size(); i++)
                {
                    for(int k = 0;k < len-1;k++)
                    {
                        int temp = pos.get(i);
                        char ci = str.charAt(temp);
                        char cii = str.charAt(temp+1);
                        char tci = str.charAt(k);
                        char tcii = str.charAt(k+1);
                        if(tci == 'B' && tcii == 'G')
                        {
                            ans = ans + cii + ci;
                        }
                        else
                        ans += tci + tcii;

                        str = ans;
                    }
                }
            }
        }
        String F = str;
        return F;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt(); int t = ob.nextInt();
        String str = ob.next();
        System.out.println(Ans(str,t));
    }
}