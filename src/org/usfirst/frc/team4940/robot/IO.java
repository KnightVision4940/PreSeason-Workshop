package org.usfirst.frc.team4940.robot;
import edu.wpi.first.wpilibj.DigitalInput;

public class IO {

	DigitalInput SwitchRobot = new DigitalInput(Map.SWITCHROBOT);
	DigitalInput SwitchElevator = new DigitalInput(Map.SWITCHELEVATOR);
	
	public boolean GetSwitchRobot(){
		return SwitchRobot.get();
	}
	
	public boolean GetSwitchElevator(){
		return SwitchElevator.get();
	}
	
	
	
	
	
	
}
