package practice;

public class A {

	 static  int a=9;
	
	public A(int a) throws Exception{
		this.a = a;
	}
	public  void m1() {
		a=8;
	}
	public A() {
		
	}
	
	public static void main(String[] args) throws Exception {
		A aa = new A();
		System.out.println(aa.a);
		A a = new A(5);
		System.out.println(a.a);
		A a1 = new A();
		System.out.println(a1.a);
		A a2 = new A(5);
		System.out.println(a2.a);
		A a3 = new A();
		System.out.println(a3.a);
		

	}
}
