import java.util.*;
class hanoi
{
    static int HanoiTower(int n, int Base, int Help, int Final)
    {
        if(n == 1)
        {
            System.out.println("Disk moved from "+Base+" to "+Final);
            return 1;
        }
        else
        {
            System.out.println("Null");
            return 0;
        }
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        HanoiTower(n, 0, 1, 2);
    }
}