package inheritance;

class A{
	int i = 20;
	
	public static  void m1(){
		System.out.println("Static method m1 in A");
	}
	
	public void m2(){
		System.out.println("A's m2 method");
	}

	public static void sM1(){
		System.out.println("In class Static");
	}
}

public class Inheritance3 extends A{
	int i = 21;
	public static  void m1(){}
	public void m2(){
		System.out.println("Instance method m2");
	}
	
	public static void main(String args[]){
		A a = new Inheritance3();
		a.sM1();//call A's sM1()
		System.out.println(a.i);//call A's i
		a.m1();//call A's m1()
		a.m2();//call Inheritance3's m2()

		sM1();//call Inheritance3's sM1()
	}
	
	public static void sM1(){
		System.out.println("In subclass static ");
	}
	
	//Unresolved compilation problem
	 /* public void sM1(){
	  System.out.println("In Non-static");
	}*/
}

