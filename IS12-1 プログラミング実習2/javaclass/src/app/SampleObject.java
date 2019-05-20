public class SampleObject {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static void main(String[] args) {
		SampleObject obj = new SampleObject();
		System.out.println("number=" + obj.getNumber());
	}
}
