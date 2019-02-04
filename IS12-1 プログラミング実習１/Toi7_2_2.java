import java.io.*;

public class Toi7_2_2 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));
        /* 配列と変数の宣言 */
        int[] arrayKijun = { 80, 65, 50, 0 };
        String[] arrayHyoka = { "優", "良", "可", "不可", "" };
        int i;
        /* 点数の入力 */
        System.out.print("点数(0-100)>");
        int tensu = Integer.parseInt(br.readLine());
        
        for (i = 0; i < arrayKijun.length; i++) {
            if (arrayKijun[i] <= tensu) {
                System.out.println(arrayHyoka[i]);
                break;
            }
        }
        System.out.println("");
    }
}
