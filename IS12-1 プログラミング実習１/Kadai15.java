class Room{
    private String name;
    private boolean inUSE;
    public void setname(String name){
        this.name = name;

    }
    public void change()
    {
        this.inUSE = !this.inUSE;
    }
    public String getName(){
        return this.name;
    }
    public String GetInUse(){
        String ret="空き";
        if(this.inUSE)
        {
            ret = "使用中";
        }
        return ret;
    }

}
class RoomManager{
    private Room[] data;
    public void setData(Room[] data){
        this.data = data;
    }
    public void display()
    {
        System.out.println("-------------------------");
        int i = 0;
        String show = "";
        for(Room now :data)
        {
            System.out.print(i+" " + now.getName() + " ");
            show = now.GetInUse();
            System.out.println(show);
            i++;
        }
        System.out.println("-------------------------");
    }
    public void setInUse(int roomno){
        data[roomno].change();
        System.out.print(roomno +" " +data[roomno].getName()+"を「");
        String show =  data[roomno].GetInUse();
        System.out.println(show+"」に変更しました。");

    }
}
class Kadai15{
    public static void main(String[] args) {
        Room r1 = new Room();
        r1.setname("小会議室");
        Room r2 = new Room();
        r2.setname("中会議室");
        Room r3 = new Room();
        r3.setname("大会議室");
        Room[] data = {r1,r2,r3};
        RoomManager mgr = new RoomManager();
        mgr.setData(data);
        mgr.display();
        mgr.setInUse(0);
        mgr.display();
        mgr.setInUse(2);
        mgr.setInUse(0);
        mgr.display();
    }
}