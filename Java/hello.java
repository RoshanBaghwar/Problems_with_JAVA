import java.util.*;
public class hello
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String s = ob.next();
        int count = 0;
        int len = s.length();
        char[] hel = {'h','e','l','l','o'};
        int pos = 0;
        char c;
        if(len < 5)
        count = 0;
        else{
            for(int i = 0; i < len; i++)
            {
                c = s.charAt(i);
                if(pos == 5)
                break;
                if(c == hel[pos])
                {
                    pos++;
                    count++;
                    continue;
                }
                else
                continue;
            }
        }
        if(count >= 5)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}