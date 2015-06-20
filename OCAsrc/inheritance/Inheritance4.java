package inheritance;

class D {
	D(){ print();}
	void print() { System.out.println("D class");}
}

public class Inheritance4 extends D {
	int i = Math.round(3.5f);

	public static void main(String args[]){
		D a = new Inheritance4();
		a.print();

	}
	
	void print() {System.out.println(i);

	}
}
