public class Toi6_6_4 {
    public static void main(String[] args) {
    int[] arrayTensu = {80,70,90,65,80,75,65,50,100,95};
    int[] arrayDosu = new int[11];
    int idx;
    for(idx = 0;idx < arrayDosu.length;idx++)
    {
        arrayDosu[idx] = 0;
    }
    for(idx = 0;idx < arrayTensu.length;idx++)
    {
        int j = arrayTensu[idx] /10;
        arrayDosu[j]++;
    }
    for(idx = 0;idx < arrayDosu.length-1;idx++)
    {
        System.out.println((idx*10)+"点台："+arrayDosu[idx]);
    }
    System.out.println(100+"点:" +arrayDosu[idx]);
}
}