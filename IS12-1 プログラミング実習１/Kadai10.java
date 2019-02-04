import java.io.*;

class CalcData{
    private int[] data;
    public void setData(int[] imported)
    {
        data = imported;
        System.out.println("データ：");
        for(int a:data)
        {
            System.out.print(a+",");
        }
    }
    public int max()
    {
        int max=0;
        for(int a:data)
        {
            if(a>max)
            {
                max = a;
            }
        }
        return max;
    }
    public int sum(){
        int sum=0;
        for(int a:data)
        {
            sum+=a;
        }
        return sum;
    }
    public double average()
    {
        return (double)(this.sum()) / (data.length);
    }
}
public class Kadai10 {
    public static void main(String[] args)throws IOException {
    CalcData c = new CalcData();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("データの個数>");
    int userin[] = new int[Integer.parseInt(br.readLine())];
    for(int i=0;i<userin.length;i++)
    {
        System.out.print("データの入力>");
        userin[i]=Integer.parseInt(br.readLine());
    }
    c.setData(userin);
    System.out.println("最大値:"+c.max());
    System.out.println("合計:"+ c.sum());
    System.out.println("平均"+c.average());

    }

    
}
