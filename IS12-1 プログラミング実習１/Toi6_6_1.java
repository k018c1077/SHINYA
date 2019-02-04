public class Toi6_6_1 {
    public static void main(String[] args) {
    int[] arrayTensu ={80,70,90,65,80,75,65,50,100,95};
    int ninzu = 0;
    for(int idx = 0;idx<arrayTensu.length;idx++)
    {
        if(80<=arrayTensu[idx])
        {
            ninzu++;
        }
    }
    System.out.println(ninzu);
    }
}