public class Toi6_6_8 {
    public static void main(String[] args) {
    int[] arrayTen1 = {80,90,-1,76,77,-1,86,75,61,75,61,73,66};
    int[] arrayTen2 = new int[arrayTen1.length];
    int idx2 = 0;
    for(int idx1 = 0;idx1 < arrayTen1.length;idx1++)
    {
        if(arrayTen1[idx1] != -1)
        {
            arrayTen2[idx2] = arrayTen1[idx1];
            idx2++;
        }
    } 
    for(int idx1 = 0;idx1<idx2;idx1++)
    {
        System.out.print(arrayTen2[idx1]+" ");
    }
    System.out.println();
    }
}