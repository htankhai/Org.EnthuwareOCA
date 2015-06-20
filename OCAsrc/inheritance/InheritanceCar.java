package inheritance;

class Car{
	public int gearRatio = 8;

	public String accelerate(){
		return "Accelerate: Car" ; }
}

public class InheritanceCar extends Car{
	public int gearRatio = 9;

	public String accelerate() { 
		return "Accelerate : InheritanceCar";
	}

	public static void main(String[] args){
		Car c = new InheritanceCar();
		
		//print shadow variable and overiding instance method
		System.out.println(c.gearRatio+ " " + c.accelerate());
	}
}
