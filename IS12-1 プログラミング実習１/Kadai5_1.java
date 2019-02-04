public class Kadai5_1 {
    public static void main(String[] args) {
    Saline S = new Saline();
    S.set(100,700);
    System.out.println("総量"+S.amount()+"g");
    System.out.println("濃度"+(S.concentration()*100)+"%");
    }
}
class Saline
{
    private double salt;
    private double water;
    //The "s" stands for solt.
    //The "w" stands for water.
    public void set(double s,double w)
    {
        this.salt = s;
        this.water = w;  

    } 
    public double amount(){
        return this.salt+this.water;
    }
    public double concentration()
    {
        return this.salt/(this.salt+this.water);
    }
    
}