import java.util.*;
public class objects
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        ArrObj[] arr = new ArrObj[n];
        String firstName,lastName;
        int age;
        for(int i = 0;i < n;i++)
        {
            firstName = ob.next();
            lastName = ob.next();  
            age = ob.nextInt(); 
            arr[i] = new ArrObj(firstName,lastName,age);
        }
        for(int i = 0;i < n;i++)
        {
            System.out.println(arr[i].a+" "+arr[i].b+" "+arr[i].age);
        }
    }
}
class ArrObj
{
    String a,b;
    int age;
    ArrObj(String a,String b,int age)
    {
        this.a = a;
        this.b = b;
        this.age = age;
    }
    ArrObj getData()
    {
        ArrObj obb = new ArrObj(a,b,age);
        return obb;
    }
}