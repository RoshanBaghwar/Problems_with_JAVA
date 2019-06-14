import java.util.*;
public class palindrome
{
    static int Operation1(int a,int b,ArrayN[] arr)
    {
        int Pr = 0;
        int A = a ^ Pr;
        int B = b ^ Pr;
        String Sa = arr[A].str;
        String Sb = arr[B].str;
        arr[A].str = Sa + Sb;
        arr[B].str = null;
        int count = 0;
        int arlen = arr.length;
        for(int i = 0; i < arlen;i++)
        {
            String checkStr = arr[i].str;
            if(Palindrome(checkStr) == true)
            count++;
            else
            continue;
        }
        return count;
    }
    static int Operation2(int a,int k, char c,ArrayN[] arr)
    {
        int Pr = 0;
        int A = a ^ Pr;
        int K = k ^ Pr;
        String str1 = arr[A-1].str;
        int len = str1.length();
        String newStr = "";
        int arlen = arr.length;
        if(K == len+1)
        {
            newStr = str1 + c;
            arr[A-1].str = newStr;
        }
        else
        {
            for(int i = 0;i < len;i++)
            {
                if(K == i+1)
                {
                    newStr += c;
                }
                
                newStr += str1.charAt(i);
            }
            arr[A-1].str = newStr;
        }
        int count = 0;
        for(int i = 0; i < arlen;i++)
        {
            String checkStr = arr[i].str;
            if(Palindrome(checkStr) == true)
            count++;
            else
            continue;
        }
        return count;
    }
    static boolean Palindrome(String str)
    {
        String ans = "";
        int len = str.length();
        for(int i = len-1; i >= 0;i--)
        {
            char c = str.charAt(i);
            ans += c;
        }
        if(ans == str)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int N = ob.nextInt(); int Q = ob.nextInt();
        ArrayN[] arrN = new ArrayN[N];
        for(int i = 0; i < N; i++)
        {
            String str = ob.next();
            arrN[i] = new ArrayN(str);
        }
        for(int i = 0;i < Q;i++)
        {
            int OP = ob.nextInt();
            switch(OP)
            {
                case 1 : int A = ob.nextInt();
                         int B = ob.nextInt();
                         System.out.println(Operation1(A,B,arrN));
                         break;

                case 2 : int AA = ob.nextInt();
                         int KK = ob.nextInt();
                         char C = ob.next().charAt(0);  //Also check for Character.parseChar();
                         System.out.println(Operation2(AA,KK,C,arrN));
                         break;

            }
        }
    }
}
class ArrayN
{
    String str;
    ArrayN(String str)
    {
        this.str = str;
    }
}