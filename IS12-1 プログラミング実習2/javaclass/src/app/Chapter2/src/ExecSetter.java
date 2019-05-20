import java.time.LocalDate;

public class ExecSetter {
	public static void main(String[] args) {
		Product p1 = new Product("A100", "XenPad", 35760, LocalDate.of(2016, 9, 16), true);
		p1.setPrice(40200);
		System.out.println("price: " + p1.getPrice());
	}
}
