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
    System.out.print("IDを入力>>");
    String ID  = br.readLine();
    System.out.print("パスワードを入力>>");
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
                result = "ログイン成功";
            }
       }  
       if(result.equals(""))
       {
        result = "ログイン失敗";
       }
        return result;   
    }
}