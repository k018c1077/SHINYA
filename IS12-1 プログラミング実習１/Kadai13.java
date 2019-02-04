import java.io.*;
public class Kadai13 {
    public static void main(String[] args)throws IOException {
    User u1 = new User();
    u1.set("Larry","google");
    User u2 = new User();
    u2.set("Steve","apple");
    User u3 = new User();
    u3.set("Mark","Facebook");
    User[] data = {u1,u2,u3};
    Login lg = new Login();
    lg.setData(data);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("ID�����>>");
    String ID  = br.readLine();
    System.out.print("�p�X���[�h�����>>");
    String pw  = br.readLine();
    String ans = lg.certify(ID, pw);
    System.out.println(ans);
    }
}
class User{
    private String id;
    private String pw;
    public void set(String id,String pw)
    {
        this.id = id;
        this.pw = pw;

    }
    public String getID(){
        return id;

    }
    public boolean match(String id,String pw)
    {
        if(this.id.equals(id)&&this.pw.equals(pw))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
class Login{
    private User[] data;
    public void setData(User[] data)
    {
        this.data = data;
    }
    public String certify(String ID,String pw)
    {
        String result = "";
        for(User check:data)
        {
            if(check.match(ID, pw))
            {
                result = "���O�C������";
            }
       }  
       if(result.equals(""))
       {
        result = "���O�C�����s";
       }
        return result;   
    }
}