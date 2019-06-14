import java.util.Scanner;
public class Case
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String str = ob.next();
        int len = str.length();
        String UP = str.toUpperCase();
        char first = str.charAt(0);
        char firstlow = Character.toLowerCase(first); 
        String newStr = "" + Character.toLowerCase(first);
        String STR = "" + Character.toUpperCase(first);
        char c,c2;

        for(int i = 1;i < len; i++)
            {
                c = Character.toUpperCase(str.charAt(i));
                newStr += c; 
            }

        if(len == 1 && str == UP)
        {
            System.out.println(str.toLowerCase());
        }
        else if(str == UP)
        {
            System.out.println(str.toLowerCase());
        }
        else if(str == newStr)
        {
            /*for(int i = 1;i < len; i++)
            {
                c2 = Character.toLowerCase(str.charAt(i));
                newStr2 += c2; 
            }*/
            System.out.println(STR);
        }
        //else
        //System.out.println(str);
    }
}