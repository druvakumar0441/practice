package practice;

public class B {

	private static int f=7;
	
	
	public static void main(String[] args) throws Exception {
		
		A a = new A(5);
		System.out.println(a.a);
		A a1 = new A(6);
		System.out.println(a1.a);
		B b= new B();
		System.out.println(b.f);
		b.f=50;
		System.out.println(b.f);
		B b1= new B();
		System.out.println(b1.f);
	}
}
