public class ExecAdder {
	public static void main(String[] args) {
		Adder num = new Adder(100);
		num.add();
		num.add();
		System.out.println("number=" + num.getNumber());
	}
}
