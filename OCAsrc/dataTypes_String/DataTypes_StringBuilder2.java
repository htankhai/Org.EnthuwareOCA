package dataTypes_String;

public class DataTypes_StringBuilder2 {
	public static void main( String[] args){
		StringBuilder sb = new StringBuilder("12345678");
		sb.setLength(10);
		System.out.println(sb);
		
		sb.setLength(5);
		sb.setLength(10);
		System.out.println(sb);

		sb.setLength(5);
		sb.setLength(10);
		System.out.println(sb);

		System.out.println(sb.length());



		String s ="blooper";
		StringBuilder sbu = new StringBuilder(s);
		//s.append("shopper");
		sbu.append("whopper");
		System.out.println(sbu);
	}
}
