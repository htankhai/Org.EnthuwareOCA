package dataTypes_String;

public class DataTypes_StringBuilder1 {
	public static void main(String[] args ){
		StringBuilder b1 = new StringBuilder("snackbite");
		StringBuilder b2 = new StringBuilder("lunch");
		
		System.out.println( b1.append(b2.substring(2,5).toUpperCase()));
		//b2.substring(2,5).toUpperCase()= NCH
		// b1 = snackbiteNCH
		
		System.out.println(b2.insert(3, b1.append("a")));
		// b1.append("a") = snackbiteNCHa
		//b2 = lunsnackbiteNCHach
		
		System.out.println("b2 :"+ b2);
		
		System.out.println(b1.replace(3,4,b2.substring (4)).append(b2.append(false)));
		
		//(b2.append(false) = lunsnackbiteNCHachfalse
		
		//b2.substring (4) = nackbiteNCHach
		//b1= snackbiteNCHa
		//(b1.replace(3,4,b2.substring (4))) = snanackbiteNCHachkbiteNCHa
		
		//(b1.replace(3,4,b2.substring (4)).append(b2.append(false))=snanackbiteNCHachkbiteNCHalunsnackbiteNCHachfalse
		System.out.println("b1= " + b1);
	}
}
