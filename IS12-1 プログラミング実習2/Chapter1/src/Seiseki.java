
public class Seiseki {
	private String number;
	private String name;
	private int[] score;
	private boolean attend;

	public Seiseki(String number, String name, int[] score, boolean attend) {
		this.number = number;
		this.name = name;
		this.score = score;
		this.attend = attend;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int[] getScore() {
		return score;
	}

	public boolean isAttend() {
		return attend;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

	public void setAttend(boolean attend) {
		this.attend = attend;
	}
}
