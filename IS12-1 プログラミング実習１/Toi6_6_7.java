import java.io.*;

import jdk.nashorn.internal.objects.annotations.Constructor;

public class Toi6_6_7 {
    public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final String VACANT = "*";
    final int ELEMENT = 10;
    String[] arrayReserve = new String[ELEMENT];
    int idx;
    System.out.print("ó\ñÒêlêî(0-10)");
    int n = Integer.parseInt(br.readLine());
    for(idx = 0;idx < n;idx++)
    {
        System.out.print("ó\ñÒé“>");
        arrayReserve[idx] = br.readLine();
    }
    }
}