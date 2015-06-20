package handlingExceptions;

class MyException extends Exception{}

public class TestClassMyException {
	public static void main(String[] args) throws MyException{
		TestClassMyException tc =new TestClassMyException();
		try{
			tc.m1();
		}
		catch(MyException e){
			tc.m1();//unhandled exception
		}
		finally{
			tc.m2();
		}
	}

	public void m1() throws MyException{
		throw new MyException();
	}

	public void m2() throws RunTimeException{
		throw new NullPointerException();
	}
}
