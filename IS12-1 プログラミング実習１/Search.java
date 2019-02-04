public class Search {
    /* 最小値の探索 */
    public minnimum(int[] arrayData) {
        int minValue = Integer.MAX_VALUE;           // 最小値の初期値設定

        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] < minValue) {          // 最小値を超える値のとき
                minValue = arrayData[i];            // 最小値の設定
            }
        }
        return minValue;                          // 最小値の返却
    }

    /* 最大値の探索 */
    public maximum(int[] arrayData) {
        int maxValue = Integer.MIN_VALUE;           // 最大値の初期値設定

        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] > minValue) {          // 最小値を超える値のとき
                maxValue = arrayData[i];            // 最小値の設定
            }
        }
        return maxValue;                           // 最大値の返却
    }
}
