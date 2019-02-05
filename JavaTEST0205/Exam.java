public class Exam {
    public static void main(String[] args) {
        Item i1 = new Item();
        i1.set("アイテムA", 110);
        Item i2 = new Item();
        i2.set("アイテムB", 150);
        Item i3 = new Item();
        i3.set("アイテムC", 130);
        Item[] data = { i1, i2, i3 };
        Cart cart = new Cart();
        cart.setData(data);
        cart.add(0, 2);
        cart.add(2, 1);
        cart.display();
    }
}

class Item {
    private String name;
    private int price;
    private int count;

    public void set(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }

    public int getPrice() {
        return this.price;
    }
}

class Cart {
    private Item[] data;

    public void setData(Item[] data) {
        this.data = data;
        int i = 0;
        System.out.println("=商品データ=");
        System.out.println("----------------------------------");
        for (Item now : data) {
            System.out.print(i);
            System.out.print(" " + now.getName());
            System.out.println(" 価格 " + now.getPrice() + "円");
            i++;
        }
        System.out.println("----------------------------------");

    }

    public void display() {
        System.out.println("=カートの中身=");
        System.out.println("----------------------------------");
        int shokei;
        int gokei = 0;
        int i = 0;
        for (Item now : data) {
            if (now.getCount() > 0) {
                shokei = now.getPrice() * now.getCount();
                gokei += shokei;
                System.out.print(i);
                System.out.print(" " + now.getName());
                System.out.print(" 注文数" + now.getCount());
                System.out.println(" 小計 " + shokei + "円");
            }
            i++;

        }
        System.out.println("----------------------------------");
        System.out.println("合計金額 " + gokei + "円");
    }

    public void add(int itemNo, int number) {
        data[itemNo].setCount(number);
    }

}