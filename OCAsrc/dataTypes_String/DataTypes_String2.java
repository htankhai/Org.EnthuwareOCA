package dataTypes_String;

public class DataTypes_String2 {
	static String str = "Hello world";

	public static void changeIt(String s){
		s = "Good bye world";
		System.out.println(s);
	}

	public static void main (String[] args){
		changeIt(str);
		System.out.println(str);

	}
}
