package handlingExceptions;

public class HandlingException3 {
	public static void main(String[] args){

		Float f= null;
		try{
			//convert String Float
			f = Float.valueOf("12.4");
			
			//Convert Float to String
			String s = f.toString();
			System.out.println(s);
			
			//might throw NumberFormatException// Convert Floating String to Integer
			int i = Integer.parseInt(s); 
			System.out.println("i = "+i);
		}
		catch(Exception e){
			System.out.println("trouble : " + f);
		}
	}
}