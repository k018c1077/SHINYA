public class ExecCircle {
	public static void main(String[] args) {
		Circle c = new Circle("blue", 5.5);

		System.out.println("�F�@=" + c.getColor());
		System.out.println("���a=" + c.getRadius());
		System.out.printf("�ʐ�=%6.2f", c.area());
	}
}
