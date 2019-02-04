public class Toi7_2_1 {
    public static void main(String[] args) {
        /* 配列と変数の宣言と初期化 */
        final int STOPPER = -1;
        int[] arrayScore1 = { 256, 164, 205, 126, 187, -1, 82, 108, -1, 175 };
        int[] arrayScore2 = new int[arrayScore1.length];

        /* 配列arrayScore1の各要素を配列arrayScore2へコピー */
        for (int i = 0; i < arrayScore1.length; i++) {
            arrayScore2[i] = arrayScore1[i];
            if (arrayScore2[i] == STOPPER) {
                break;
            }
        }
        /* 配列arrayScore2の要素を表示 */
        for (int i = 0; i < arrayScore2.length; i++) {
            System.out.print(arrayScore2[i] + "  ");
            if (arrayScore2[i] == STOPPER) {
                break;
            }
        }
        System.out.println();
    }
}
