package dataTypes_String;

public class DataTypes_String1 {
	int i;
	public DataTypes_String1(int i ) {
		this.i = i;
	}

	public String toString(){
		if(i== 0 ) return null;
		else 
			return "" + i;
	}

	public static void main(String args[])
	{
		DataTypes_String1 t1 = new DataTypes_String1(0);
		DataTypes_String1 t2 = new DataTypes_String1(2);
		System.out.println(t2);
		System.out.println(""+t1);

		Object o = null;
		System.out.println(o);

		String abc = "";
		abc.concat("abc");//abc
		abc.concat("def");//def
		System.out.println(abc);//print empty string
		
		String abcd = abc.concat("abc");//abc
		String def = abcd.concat("def");//def
		System.out.println(def);//abcdef

		String blank = " ";
		String line = blank + "hello" + blank + blank;// hello  
		line.concat("world");// hello  world
		String newLine = line.trim();//hello
		System.out.println(newLine);
		System.out.println((int)(line.length()) + newLine.length());


		//throw StringIndexOutOfBoundsException
		//System.out.println("12345".charAt(6));

	}
}
