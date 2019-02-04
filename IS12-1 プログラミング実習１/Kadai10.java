import java.io.*;

class CalcData{
    private int[] data;
    public void setData(int[] imported)
    {
        data = imported;
        System.out.println("�f�[�^�F");
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
    System.out.print("�f�[�^�̌�>");
    int userin[] = new int[Integer.parseInt(br.readLine())];
    for(int i=0;i<userin.length;i++)
    {
        System.out.print("�f�[�^�̓���>");
        userin[i]=Integer.parseInt(br.readLine());
    }
    c.setData(userin);
    System.out.println("�ő�l:"+c.max());
    System.out.println("���v:"+ c.sum());
    System.out.println("����"+c.average());

    }

    
}
