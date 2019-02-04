import java.util.Random;

public class Kadai11 {
    public static void main(String[] args) {
        Dice d = new Dice();
        Piece p = new Piece();
        Sugoroku s = new Sugoroku();
        s.set(d, p);
        s.turn();
        s.turn();
        s.turn();
    }
    
}

class Dice {
    static Random r = new Random();
    public static int shake()
    {
        int s = r.nextInt(6) + 1;
        System.out.println("ÉTÉCÉRÉçÇÃñ⁄:" + s);
        return s;
    }
}

class Piece {
    private int pos = 0;
    public void add(int go)
    {
        pos += go;
        for (int i = 0; i <= pos; i++)
        {
            System.out.print(">");
        }
        System.out.print("Åú");
        System.out.println("");
    }
}

class Sugoroku {
    private Dice dice;
    private Piece piece;

    public void set(Dice Fdice, Piece Fpiece) {
        dice = Fdice;
        piece = Fpiece;
    }
    public void turn()
    {
        int n = dice.shake();
        piece.add(n);
    }
}