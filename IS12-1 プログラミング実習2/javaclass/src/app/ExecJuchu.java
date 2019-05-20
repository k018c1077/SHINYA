import java.time.LocalDate;

public class ExecJuchu {
	public static void main(String[] args) {
		Order o1 = new Order("ICBK61", LocalDate.of(2020, 7, 11), 2100, 5, true);
		System.out.println("変更前");
		System.out.println("型　番=" + o1.getCode());
		System.out.println("受注日=" + o1.getDate());
		System.out.println("個　数=" + o1.getQuantity() + "\n");

		o1.setDate(LocalDate.of(2020, 8, 30));
		o1.setQuantity(12);
		System.out.println("変更後");
		System.out.println("型　番=" + o1.getCode());
		System.out.println("受注日=" + o1.getDate());
		System.out.println("個　数=" + o1.getQuantity());
	}
}
