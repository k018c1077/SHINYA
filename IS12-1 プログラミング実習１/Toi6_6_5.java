public class Toi6_6_5 {
    public static void main(String[] args) {
    String[] arrayHyoka = {"優","良","可","不"};
    int[] arrayNinzu = {23,10,5,2};
    double[] arrayWariai = new double[4];
    int goukei=0;
    for(int idx = 0;idx < arrayNinzu.length;idx++)
    {
        goukei += arrayNinzu[idx];
    }
    
    for(int idx = 0;idx < arrayHyoka.length;idx++)
    {
        arrayWariai[idx] = (double)arrayNinzu[idx] / goukei;
    }
    for(int idx = 0;idx < arrayHyoka.length;idx++)
    {
        System.out.print(arrayHyoka[idx] + "\t");
        System.out.println((int)(arrayWariai[idx]*100) + "%");
    }


}
}