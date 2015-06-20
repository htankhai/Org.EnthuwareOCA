package methods_;

public class Holder_ {
	int value = 1;
	Holder_ link;
	
	public Holder_ (int val) {
		this.value = val;
	}

	public static void main (String args[] ){
		final Holder_ a = new Holder_(5);
		Holder_ b = new Holder_(10);
		a.link = b;
		b.link = setIt(a,b);
		System.out.println(a.link.value+ "  " +b.link.value);
	}

	public static Holder_ setIt(final Holder_ x, final Holder_ y){
		x.link = y.link;
		return x;
	}
}
