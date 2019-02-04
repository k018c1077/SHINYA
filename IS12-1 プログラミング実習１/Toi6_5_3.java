import java.io.*;

public class Toi6_5_3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N =5;
        String[] arrayName = new String[N];
        int[] arrayTensu = new int[N];

        for(int i =0;i<arrayName.length;i++)
        {
            System.out.print((i+1)+"人目の名前を入力>");
            arrayName[i] = br.readLine();
            System.out.print((i+1)+"人目の点数を入力>");
            arrayTensu[i] = Integer.parseInt(br.readLine());            
        }
        for(int i = 0;i<arrayName.length;i++)
        {
            System.out.print(arrayName[i]+"さん");
            System.out.println(arrayTensu[i]+"点");
        }
        }
}