class A {
	public A() {
		System.out.println("Aクラス");
	}
}

class B extends A {
	public B() {
		System.out.println("Bクラス");
	}
}

class C extends B {
	public C() {
		System.out.println("Cクラス");
	}
}

public class ManyClasses {
	public static void main(String[] args) {
		C obj = new C();
	}
}
