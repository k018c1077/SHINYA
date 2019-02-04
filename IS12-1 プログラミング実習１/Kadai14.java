import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Kadai14{
    public static void main(String[] args) throws IOException {
    Answer a1 = new Answer();
    a1.set("保証期間", "保証期間は購入日から1年間となります。");
    Answer a2 = new Answer();
    a2.set("取扱説明書", "取扱説明書はWeb版がダウンロードできます。");
    Answer a3 = new Answer();
    a3.set("その他", "その他問い合わせ連絡先は0120-000-000です。");
    Answer[] data = {a1,a2,a3};
    FAQList faq = new FAQList();
    faq.setData(data);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("タイトルを入力>");
    String key = br.readLine();
    Answer ans = faq.serach(key);
    if(ans == null){
        System.out.println("【結果】該当する回答はありません。");
    }
    else
    {
        System.out.println("【結果】 "+ans.getTitle()+":"+ans.getText());
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
        System.out.println("データを"+data.length+"件設定しました。");
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