public class Toi6_6_3 {
    public static void main(String[] args) {
    int[] arrayNyujo = {856,861,862,854,864,846,848};
    int max = 0;

    for(int i = 0;i<arrayNyujo.length;i++)
        {
            if(max < arrayNyujo[i])
            {
                max = arrayNyujo[i];
            }
        }
        System.out.println("最大=" + max);
    }
}