package handlingExceptions;
import java.io.IOException;

class PortConnector{
	public PortConnector(int port){
		if(Math.random() > 0.5){
			throw new IOException();//Unhandled exception 
		}
		throw new RuntimeException();
	}
}

public class TestClassException {
	public static void main ( String args[]) { 
		try{ PortConnector pc = new PortConnector(10);
		}
		catch (RuntimeException re){
			re.printStackTrace();
		}
	}
}