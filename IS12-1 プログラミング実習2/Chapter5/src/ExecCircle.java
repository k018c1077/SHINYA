public class ExecCircle {
	public static void main(String[] args) {
		Circle c = new Circle("blue", 5.5);

		System.out.println("êFÅ@=" + c.getColor());
		System.out.println("îºåa=" + c.getRadius());
		System.out.printf("ñ êœ=%6.2f", c.area());
	}
}
