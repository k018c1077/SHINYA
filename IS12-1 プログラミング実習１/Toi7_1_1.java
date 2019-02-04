public class Toi7_1_1 {
    public static void main(String[] args) {
        /* 配列と変数の宣言と初期化 */
        final int STOPPER = -1;
        int[] arrayScore1 = { 256, 164, 205, 126, 187, -1, 82, 108, -1, 175 };
        int[] arrayScore2 = new int[arrayScore1.length];
        int i = 0;

        /* 配列arrayScore1の各要素を配列arrayScore2へコピー */
        do {
            arrayScore2[i] = arrayScore1[i];
        } while (arrayScore1[i++] != STOPPER) ;     // STOPPERまで

        /* 配列arrayScore2の要素を表示 */
        i = 0;
        do {
            System.out.print(arrayScore2[i] + "  ");
            
        } while (arrayScore2[i++] != STOPPER) ;     // STOPPERまで
        System.out.println();
    }
}
