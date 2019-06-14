public class sample
{
    public static void main(String args[])
    {
        Data data1 = new Data(10,20);
        Data data2 = new Data(100,200);
        Data data[] = new Data[5];
        for(int i = 0; i < 5; i++)
            data[i] = new Data(i, i + 10);

        System.out.println("data1 : " +data1.x+" "+data1.y);
        System.out.println("data2 : " +data2.x+" "+data2.y+"\n\n");

        for(int j = 0; j < 5; j++)
            System.out.println(data[j].x+"  "+data[j].y);
    }
}

class Data
{
    int x, y;
    Data(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
