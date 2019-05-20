import java.time.LocalDate;

public class ExecToString {
	public static void main(String[] args) {
		Product p1 = new Product("A100", "XenPad", 35760, LocalDate.of(2016, 9, 16), true);
		System.out.println(p1);
	}
}
