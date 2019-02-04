public class Kadai3_4 {
    public static void main(String[] args) {
    cat tama = new cat();
    tama.name="ÇΩÇ‹";
    tama.age = 3;
    cat mike = new cat();
    mike.name = "Ç›ÇØ";
    mike.age=1;
    extracted(tama);
    extracted(mike);
    }

    private static void extracted(cat tama) {
        System.out.println("îL" + "(" + tama.name + "ÅA" + tama.age + "çÀ)");
    }
}