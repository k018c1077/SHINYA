public class Arithmetic {
    /* double�l�̐�Βl */
    public double absolute(double value) {
        if(value < 0){                      // �����̔���
            value *= -1.0;                  // �����̔��]
        }
        return value;                      // ��Βl(double�l)�̕ԋp
    }

    /* int�l�̐�Βl */
    public int absolute(int value) {
        return (int)absolute((double)value);// ��Βl(int�l)�̕ԋp
    }

    /* �l�̌ܓ� */
    public int round(double value) {
        int sign = 1;                       // ����
        if(value < 0) {                     // �����̔���
            sign = -1;                      // ���̐ݒ�
        }
        value += (0.5 * sign);              // �������l�����l�̌ܓ�����
        return value;                 // int�l�ŕԋp
    }
}
