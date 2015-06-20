package inheritance;

class Doll{
	String name;
	Doll(String nm){
		this.name = nm;
		System.out.println(this.name);
	}
}

class Barbie extends Doll{
	Barbie(){
		this("unknown");
		// super("unknown");

	}
	Barbie(String nm){
		super(nm);
	}

}
public class thissuperInheritance {
	public static void main(String[] args ) {
		Barbie b =new Barbie("mydoll");
	
	}
}
