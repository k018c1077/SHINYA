import java.io.*;
import java.io.IOException;

public class Kadai12 {
    public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("�f�[�^�̌�>");
        City[] data = new City[Integer.parseInt(br.readLine())];
        for(int i = 0;i<data.length;i++)
        {
            City city = new City();
            System.out.print("�s�s������>");
            String name = br.readLine();
            System.out.print("�_������>");
            int point = Integer.parseInt(br.readLine());
            city.set(name, point);
            data[i] = city;

        }
        CalcData c = new CalcData();
        c.setData(data);

    }
}

class City {
    private String name;
    private int point;
    public void set(String name,int point)
    {
        this.name = name;
        this.point = point;

    }
    public String getName()
    {
        return this.name;
    }

    public int getPoint() {
        return this.point;
    }
    
}

class CalcData {
    private City[] data;

    public void setData(City[] data) {
        this.data = data;
        System.out.print("�f�[�^:");
        for(City now : data)
        {
            System.out.print(" " + now.getName() + ":" + now.getPoint() + ",");
        }
        
    }

}