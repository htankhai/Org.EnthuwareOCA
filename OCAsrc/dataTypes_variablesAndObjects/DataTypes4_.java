package dataTypes_variablesAndObjects;

public class DataTypes4_ {
	String a = "x";
	static char b = 'x';
	String c = "x";
	
	class Inner{
		String a = "y";
		
		String get(){
			String c = "temp";

			//call x value
			//c = ""+DataTypes4.this.b;//static variable
			//c = ""+DataTypes4.b;//static variable
			//c = ""+b;//static variable
			
			c = DataTypes4_.this.c;
			
			 //c = DataTypes4.this.a;

			 //c = ""+a;// call y value
			//c=this.a;
			//c= c;
			return c;
		}
	}
	
	DataTypes4_(){
		System.out.println(new Inner().get());
	}
	
	public static void main(String[] args)   {
		new DataTypes4_();
	}
}
