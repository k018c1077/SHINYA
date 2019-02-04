import java.io.*;
import java.util.Random;

public class BJ {
    
    int[] card = new int[20];
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BJ player = new BJ();
    player.card[0]=0;
    BJ enemy = new BJ();
    enemy.card[0]=0;
    System.out.println("here is your card.");
    player = drowcard(player);
    player = drowcard(player);
    showcard(player);
    System.out.println("");
    System.out.println("here is my card.");
    enemy = drowcard(enemy);
    enemy = drowcard(enemy);
    showcard(enemy);
    while(true)
    {
        System.out.println("");
        System.out.println("hit or stand??(h or s)");
        if(br.readLine().equals("s"))
        {
            break;
         }
        player = drowcard(player);
        showcard(player);
    try{
        if(judge(player)==true)
        {
            System.out.println("BJ!!\nYou WIN!!!");
            System.exit(0);
        }
    }catch(OverBJException e){
        System.out.println("BURST!!!\nYou LOSE...");
        System.exit(0);

    }
    }
    //whileî≤ÇØèoÇµ
        System.out.println("dealer's turn!!");
        while(sum(enemy)<=sum(player))
        {
        enemy = drowcard(enemy);
        showcard(enemy);
        try{
            if(judge(enemy)==true)
            {
                System.out.println("BJ!!\ndealer win! You lose...");
                System.exit(0);
            }
        }catch(OverBJException e){
            System.out.println("BURST!!!\nYou WIN!!");
            System.exit(0);
    
        }
        }
        System.out.println("dealer win! You lose...");
       
    }


    
    
    
    
	private static void showcard(BJ ones) {
		for(int i = 1;i<=ones.card[0];i++)
		{
            System.out.print("/"+ones.card[i]);
        }
    }

    private static BJ drowcard(BJ man) {
        man.card[0]++;
        man.card[man.card[0]] = (int)(Math.random()*10)+1;
        return man;
    }  
    private static Boolean judge (BJ man) throws OverBJException
    {
        int sum = 0;
        for(int i = 1;i<=man.card[0];i++)
        {
            sum += man.card[i];
        }
        System.out.print("\tÅ®now " +sum);
        System.out.println();
        if(sum==21)
        {
            return true;
        }
        else if(sum>21)
        {
            throw new OverBJException("OVERBJ");
        }
        else
        {
            return false;
        }


    }
    private static int sum (BJ man)
    {
        
        int sum = 0;
        for(int i = 1;i<=man.card[0];i++)
        {
            sum += man.card[i];
        }
        return sum;

    }
}
