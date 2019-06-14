import java.util.Scanner;
public class chat
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String str = ob.next();
        String newStr = "" + str.charAt(0);
        String c;
        int len = str.length(), newlen;
        for(int i = 1;i < len;i++)
        {
            c = "" + str.charAt(i);
            newlen = newStr.length();
            int check = 0;
            for(int j = 0;j < newlen;j++)
            {
                String newC = "" + newStr.charAt(j);
                if(newC.equalsIgnoreCase(c))
                check++;
            }
            if(check != 0)
            continue;
            else
            newStr += c;
        }
        int count = newStr.length();
        if(count % 2 == 0)
        System.out.println("CHAT WITH HER!");
        else
        System.out.println("IGNORE HIM!" );
    }
}