public class Kadai6 {
    public static void main(String[] args) {
    Calc c = new Calc();
    int ans1 = c.power(3);
    System.out.println("3‚Ì‚Qæ:"+ans1);
    double ans =c.average(12,25);
    System.out.println("•½‹Ï:"+ans);
    c.kuku(7);
    System.out.println("");
    }
    

}
class Calc{
    public static int power(int num)
    {
        return num*num;
    }
    public static double average(int num1,int num2)
    {
        return (num1+num2)/2;
    }
    public static void kuku(int num)
    {
        for(int i=1;i<=9;i++)
        {
            System.out.print(num*i+" ");
        }
    }
}
