public class Toi7_2_1 {
    public static void main(String[] args) {
        /* �z��ƕϐ��̐錾�Ə����� */
        final int STOPPER = -1;
        int[] arrayScore1 = { 256, 164, 205, 126, 187, -1, 82, 108, -1, 175 };
        int[] arrayScore2 = new int[arrayScore1.length];

        /* �z��arrayScore1�̊e�v�f��z��arrayScore2�փR�s�[ */
        for (int i = 0; i < arrayScore1.length; i++) {
            arrayScore2[i] = arrayScore1[i];
            if (arrayScore2[i] == STOPPER) {
                break;
            }
        }
        /* �z��arrayScore2�̗v�f��\�� */
        for (int i = 0; i < arrayScore2.length; i++) {
            System.out.print(arrayScore2[i] + "  ");
            if (arrayScore2[i] == STOPPER) {
                break;
            }
        }
        System.out.println();
    }
}
