package loopconstructs_;

public class Loopconstructs13 {
	public static void main(String[] args){
		int c = 0;
		JACK: while (c< 8){
			JILL: System.out.println(c);
		if (c> 3) break JACK ; else c++;
		}    

		int d = 0;
		JACK: while (d< 8){
			JILL: System.out.println(d);

		for(int k = 0; k<d ; k++) {
			System.out.println("k = " + k+ " d = " +d);
			if (d> 3) break JACK ;}
		d++;

		}

		int e = 0;
		JACK: while (e< 8){
			JILL: System.out.println(e);

		for(int k = 0; k<e ; k++) {
			System.out.println("k = " + k+ " d = " +e);
			if (e> 3) break ;}
		e++;
		}
	}
}
