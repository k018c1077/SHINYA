import java.io.*;

public class Toi7_2_2 {
    public static void main(String[] args) throws IOException {
        /* ���͂̏��� */
        BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));
        /* �z��ƕϐ��̐錾 */
        int[] arrayKijun = { 80, 65, 50, 0 };
        String[] arrayHyoka = { "�D", "��", "��", "�s��", "" };
        int i;
        /* �_���̓��� */
        System.out.print("�_��(0-100)>");
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
