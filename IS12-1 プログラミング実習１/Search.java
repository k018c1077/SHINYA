public class Search {
    /* �ŏ��l�̒T�� */
    public minnimum(int[] arrayData) {
        int minValue = Integer.MAX_VALUE;           // �ŏ��l�̏����l�ݒ�

        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] < minValue) {          // �ŏ��l�𒴂���l�̂Ƃ�
                minValue = arrayData[i];            // �ŏ��l�̐ݒ�
            }
        }
        return minValue;                          // �ŏ��l�̕ԋp
    }

    /* �ő�l�̒T�� */
    public maximum(int[] arrayData) {
        int maxValue = Integer.MIN_VALUE;           // �ő�l�̏����l�ݒ�

        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] > minValue) {          // �ŏ��l�𒴂���l�̂Ƃ�
                maxValue = arrayData[i];            // �ŏ��l�̐ݒ�
            }
        }
        return maxValue;                           // �ő�l�̕ԋp
    }
}
