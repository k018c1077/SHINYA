public class Toi7_2_3 {
    public static void main(String[] args) {
        /*配列と変数の宣言 */
        int[] arrayTen1 = {80, 90, -1, 76, 77, -1, 86, 75, 61, 73, 66};
        int[] arrayTen2 = new int[arrayTen1.length];
        int idx2 = 0;                                   // コピー先の指標

        /* arrayTen1の要素数回ループ */
        for (int idx1 = 0; idx1 < arrayTen1.length; idx1++) {
            if (arrayTen1[idx1] == -1) {            // 欠席者のとき
                break;                             // 配列要素のコピー
            }
            arrayTen2[idx2] = arrayTen1[idx1];          // 配列要素のコピー
            idx2++;                                   // 添字のカウントアップ
        }
        /* コピーした要素数回ループ */
        for (int idx1 = 0; idx1 < idx2; idx1++) {
            System.out.print(arrayTen2[idx1] + " ");    // コピーデータの表示
        }
        System.out.println();
    }
}
