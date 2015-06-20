package inheritance;

class Super{static String ID = "Bank";}

class Sub extends Super{
	static {System.out.println("In Sub static");}
	{System.out.println("In Sub");}

	Sub(){
		System.out.println("constructor in Sub");
	}
}

public class StaticBlock {
	public static void main(String[] args){
		System.out.println(Sub.ID);
		System.out.println(Super.ID);

		System.out.println(new Sub());
	}

}
