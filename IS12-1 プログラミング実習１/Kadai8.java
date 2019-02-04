class Circle{
    int radius;
    public void setR(int r)
    {
        this.radius =r;
        System.out.println("半径:"+r+"を設定");
    }
    public int diameter(){
        return this.radius*2;
    }
    public double area(){
        return this.radius*this.radius*3.14;
    }
    public double cylinder(double y){
        return this.area()*y;
    }
    
}
public class Kadai8 {
    public static void main(String[] args) {
    Circle c = new Circle();
    c.setR(3);
    int ans1 = c.diameter();
    System.out.println("直径:"+ans1);
    double ans2 = c.area();
    System.out.println("円の面積:"+ans2);
    double ans3 = c.cylinder(5.5);
    System.out.println("円柱の体積"+ans3);

    }
}