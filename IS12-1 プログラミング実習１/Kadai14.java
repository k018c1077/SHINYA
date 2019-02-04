import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Kadai14{
    public static void main(String[] args) throws IOException {
    Answer a1 = new Answer();
    a1.set("�ۏ؊���", "�ۏ؊��Ԃ͍w��������1�N�ԂƂȂ�܂��B");
    Answer a2 = new Answer();
    a2.set("�戵������", "�戵��������Web�ł��_�E�����[�h�ł��܂��B");
    Answer a3 = new Answer();
    a3.set("���̑�", "���̑��₢���킹�A�����0120-000-000�ł��B");
    Answer[] data = {a1,a2,a3};
    FAQList faq = new FAQList();
    faq.setData(data);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("�^�C�g�������>");
    String key = br.readLine();
    Answer ans = faq.serach(key);
    if(ans == null){
        System.out.println("�y���ʁz�Y������񓚂͂���܂���B");
    }
    else
    {
        System.out.println("�y���ʁz "+ans.getTitle()+":"+ans.getText());
    }
    }
}
class Answer{
    private String title;
    private String text;
    public void set(String title,String text){
        this.title = title;
        this.text = text;
    }
    public String getTitle(){
        return this.title;
    }
    public String getText(){
        return this.text;
    }

}
class FAQList{
    private Answer[] data;
    public void setData(Answer[] data){
        this.data = data;
        System.out.println("�f�[�^��"+data.length+"���ݒ肵�܂����B");
    }
    public Answer serach(String keyword)
    {
        Answer ret = null;
        for(Answer search:data)
        {
            if(search.getTitle().equals(keyword))
            {
                ret = search;
            }
        }
        return ret;

    }

}