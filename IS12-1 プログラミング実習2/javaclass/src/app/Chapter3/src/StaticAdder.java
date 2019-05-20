public class StaticAdder {
	private static int number;

	private static void add() {
		number++;
	}

	public static void main(String[] args) {
		number = 100;
		add();
		add();
		System.out.println("number=" + number);
	}
}
