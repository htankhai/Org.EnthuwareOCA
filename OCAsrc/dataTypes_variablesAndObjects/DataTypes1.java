package dataTypes_variablesAndObjects;

public class DataTypes1 {
	public static void main(String[] args){
		String str = "1234";
		long m ;
		System.out.println(new Long(str));
		System.out.println(Long.parseLong(str));
		System.out.println(Long.valueOf(str).longValue());

	}
}
