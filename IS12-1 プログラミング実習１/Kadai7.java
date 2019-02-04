class Figure{
    public int square (int p)
    {
        return p*p;
    }
    public double rect(double x ,double y){
        return x*y;
    }
    public double triangle(int floor,int y)
    {
        return (floor*y)/(double)(2);
    }

}
public class Kadai7 {
    public static void main(String[] args) {
    Figure f = new Figure();
    int ans1 = f.square(8);
    System.out.println("正方形の面積:"+ans1);
    double ans2 = f.rect(3.5,2.8);
    System.out.println("長方形の面積:"+ans2);
    double ans3 = f.triangle(11,25);
    System.out.println("三角系の面積:"+ans3);
    }


}