class A {
	public A() {
		System.out.println("A�N���X");
	}
}

class B extends A {
	public B() {
		System.out.println("B�N���X");
	}
}

class C extends B {
	public C() {
		System.out.println("C�N���X");
	}
}

public class ManyClasses {
	public static void main(String[] args) {
		C obj = new C();
	}
}
