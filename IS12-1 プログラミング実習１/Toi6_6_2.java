public class Toi6_6_2 {
    public static void main(String[] args) {
    int[] arrayTensu = {10,20,30,-1,10,-1,18};
    int ninzu = 0;
    int gokei = 0;
    double heikin;
    for(int i = 0;i<arrayTensu.length;i++)
    {
        if(0<arrayTensu[i])
        {
            gokei+= arrayTensu[i];
            ninzu++;
        }
    } 
    heikin = (double)gokei/ninzu;
    System.out.println("平均=" +heikin);
    }
}