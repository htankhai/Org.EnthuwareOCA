package inheritance;

class Game{
	public void play() throws Exception{
		System.out.println("Playing ...");
	}
}

class Soccer extends Game{
	public void play(String ball){
		System.out.println("Playing soccer with " + ball);
	}
}

public class Inheritance1 {
	public static void main(String args[]) throws Exception//handled exception
	{

		Game g = new Soccer();
		g.play();
		Soccer s = (Soccer) g ;
		s.play("cosco");
		s.play();
	}    
}
