import java.io.*;

public class Enshu6_1 {
    public static void main(String[] args) throws IOException {
        /* ???????? */
        BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));

        /*?z???????? */
        int[] arrayKinshu =
                { 10000,5000,2000,1000,500,100, 50, 10, 5, 1 };
        int[] arrayMaisu  = new int[10];

        /* ??z?????\?? */
        System.out.print("??z>");
        int kingaku = Integer.parseInt(br.readLine());

        for (int i = 0;i<arrayKinshu.length;i++)
        {
            arrayMaisu[i] = kingaku /arrayKinshu[i];
            kingaku %= arrayKinshu[i];
            }
        for (int i = 0;i<arrayKinshu.length;i++)

    {
        System.out.println(arrayKinshu[i] +"\t"+arrayMaisu[i]);
        

    }
    }
}
