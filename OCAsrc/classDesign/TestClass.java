package classDesign;

class A implements Cloneable
{
	public int i = 10 ; 
}

class B extends A implements Cloneable
{
	public int i = 20;
	public B clone()
	{
		B b =new B();
		b.i = this.i ;//20

		return b;
	}
}

public class TestClass {
	public static void main(String args[]) throws Exception{
		B b1= new B();

		B b2 = (B) b1.clone();

		System.out.println( b1==b2);
		System.out.println(b1.equals(b2));
		System.out.println(new java.util.Date().getTime());
	}
}

