package classDesign;

import java.io.IOException;
import java.sql.SQLException;

interface Int1 {
	void m1() throws IOException;
}

interface Int2 { 
	void m1() throws SQLException;
}

public class TestClassInterface implements Int1, Int2{
	public static void main (String args[]) throws Exception
	{
		TestClass tc = new TestClass();
		Int1 i1 = (Int1) tc;//classDesign.TestClass cannot be cast to classDesign.Int1
		i1.m1();

		Int2 i2= (Int2) tc ;
		i2.m1();
	}
	
	public void m1()
	{
		System.out.println("Hi");
	}
}
