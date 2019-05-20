import java.time.LocalDate;

public class ExecGetter {
	public static void main(String[] args) {
		Product p1 = new Product("A100", "XenPad", 35760, LocalDate.of(2016, 9, 16), true);
		System.out.println(p1.getName());
		System.out.println(p1.getPrice());
	}
}
