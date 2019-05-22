package sample;
import java.time.LocalDate;

public class ExecMethod {
	public static void main(String[] args) {
		Product p1 = new Product("A100", "XenPad", 35760, LocalDate.of(2016, 9, 16), true);
		sub(p1);
		System.out.println("p1= " + p1);
	}

	public static void sub(Product p2) {
		p2.setPrice(40200);
		System.out.println("p2= " + p2);
	}
}
