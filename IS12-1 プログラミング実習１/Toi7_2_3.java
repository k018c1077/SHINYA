public class Toi7_2_3 {
    public static void main(String[] args) {
        /*�z��ƕϐ��̐錾 */
        int[] arrayTen1 = {80, 90, -1, 76, 77, -1, 86, 75, 61, 73, 66};
        int[] arrayTen2 = new int[arrayTen1.length];
        int idx2 = 0;                                   // �R�s�[��̎w�W

        /* arrayTen1�̗v�f���񃋁[�v */
        for (int idx1 = 0; idx1 < arrayTen1.length; idx1++) {
            if (arrayTen1[idx1] == -1) {            // ���Ȏ҂̂Ƃ�
                break;                             // �z��v�f�̃R�s�[
            }
            arrayTen2[idx2] = arrayTen1[idx1];          // �z��v�f�̃R�s�[
            idx2++;                                   // �Y���̃J�E���g�A�b�v
        }
        /* �R�s�[�����v�f���񃋁[�v */
        for (int idx1 = 0; idx1 < idx2; idx1++) {
            System.out.print(arrayTen2[idx1] + " ");    // �R�s�[�f�[�^�̕\��
        }
        System.out.println();
    }
}
