public class Toi7_1_1 {
    public static void main(String[] args) {
        /* �z��ƕϐ��̐錾�Ə����� */
        final int STOPPER = -1;
        int[] arrayScore1 = { 256, 164, 205, 126, 187, -1, 82, 108, -1, 175 };
        int[] arrayScore2 = new int[arrayScore1.length];
        int i = 0;

        /* �z��arrayScore1�̊e�v�f��z��arrayScore2�փR�s�[ */
        do {
            arrayScore2[i] = arrayScore1[i];
        } while (arrayScore1[i++] != STOPPER) ;     // STOPPER�܂�

        /* �z��arrayScore2�̗v�f��\�� */
        i = 0;
        do {
            System.out.print(arrayScore2[i] + "  ");
            
        } while (arrayScore2[i++] != STOPPER) ;     // STOPPER�܂�
        System.out.println();
    }
}
