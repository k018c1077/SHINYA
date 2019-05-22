public class ExecManager {
	public static void main(String[] args) {
		Manager mg = new Manager(110, "森下 樹", 32, "プロジェクトマネージャー");
		System.out.println(mg.getId() + "\t" + mg.getName() + "\t" + mg.getAge() + "\t" + mg.getTitle());
	}
}
