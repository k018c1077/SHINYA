import java.time.LocalDate;

public class ExecMember {
	public static void main(String[] args) {
		StudentMember stmem = new StudentMember(100, "“c’†G", LocalDate.of(2004, 7, 30));
		Member mem = stmem;
		System.out.println(mem.getId());
		System.out.println(mem.getName());
	}
}
