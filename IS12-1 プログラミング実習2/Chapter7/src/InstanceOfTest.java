public class InstanceOfTest {
	public static void main(String[] args) {
		Object o1 = new A();
		Object o2 = new B();
		Object o3 = new C();
		System.out.println(o1 instanceof B);
		System.out.println(o2 instanceof B);
		System.out.println(o3 instanceof B);
	}
}

class A {
}

class B extends A {
}

class C extends B {
}