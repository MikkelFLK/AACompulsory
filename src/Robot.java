import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Robot {

	public static void main(String [] args) 
	{
		Behavior b1 = new MoveForward();
		Behavior [] bArray = {b1};
		Arbitrator arby = new Arbitrator(bArray);
		arby.go();
	}
}
