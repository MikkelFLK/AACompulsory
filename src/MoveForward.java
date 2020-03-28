import lejos.hardware.motor.Motor;
import lejos.robotics.subsumption.*;

public class MoveForward implements Behavior{
	private boolean suppressed = false;
	
	public boolean takeControl() {
		return true;
	}
	
	public void suppress() {
		suppressed = true;
	}
	
	public void action() {
		suppressed = false;
		Motor.A.setAcceleration(3000);
		Motor.C.setAcceleration(3000);
		Motor.A.forward();
		Motor.C.forward();
		while( !suppressed )
			Thread.yield();
		Motor.A.stop();
		Motor.C.stop();
	}

}
