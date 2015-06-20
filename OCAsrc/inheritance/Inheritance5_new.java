package inheritance;

class AB{
	int x = 11;
	static int y = 21;
}

class MN extends AB{
	int x= 32;
	static int y = 40;
}

public class Inheritance5_new {
	public static void main(String args[]){
		System.out.println(new MN().x+ ", " + new MN().y);

		 AB a = new MN();
		 System.out.println(a.x);
		System.out.println(a.y);
	}
}
