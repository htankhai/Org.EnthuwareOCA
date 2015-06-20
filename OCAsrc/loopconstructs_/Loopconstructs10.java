package loopconstructs_;
public class Loopconstructs10 {
	public static void main(String[] args){
		int[] values = { 10, 30, 40};
		for ( int val : values){
			int x = 0;

			while (x < values.length){
				System.out.println(x +" "+ val);
				x++;
			}
		}
	}        
}

