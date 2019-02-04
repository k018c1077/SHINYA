class Kadai16{
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.set("商品A",10);
        Product p2 = new Product();
        p2.set("商品B",6);
        Product p3 = new Product();
        p3.set("商品C",0);
        Product[] data = {p1,p2,p3};
        ProductManager mgr = new ProductManager();
        mgr.setData(data);
        mgr.display();
        mgr.shipment(0, 6);
        mgr.shipment(1, 20);
        mgr.display();
    }
}
class Product{
    private String name;
    private int count;
    public void set(String name,int count){
        this.name = name;
        this.count = count;
    }
    public void setCount(int count){
        this.count=count;
    }
    public String getName(){
        return this.name;
    }
    public int getCount(){
        return this.count;
    }
}
class ProductManager{
    private Product[] data;
    public void setData(Product[] data)
    {
        this.data = data;
    }
    public void display(){
        System.out.println("--------------------");
        int i = 0;
        for(Product C :data){
            System.out.println(i+" "+C.getName()+" "+C.getCount());
            i++;
        }
        System.out.println("--------------------");

    }
    public void shipment(int no,int value){
        Product p = data[no];
        int c =p.getCount();
        c -= value;
        if(0<=c){
            p.setCount(c);
            System.out.println(p.getName()+"を"+p.getName()+"個出荷しました。");
        }
        else{
            System.out.println(p.getName()+"は出荷できません。");
        }
    }
}