package org.usfirst.frc.team4940.robot;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;

public static class IO {

	DigitalInput SwitchRobot = new DigitalInput(Map.SWITCHROBOT);
	DigitalInput SwitchElevator = new DigitalInput(Map.SWITCHELEVATOR);
	
	Joystick xbox = new Joystick(0);
	
	public static boolean GetSwitchRobot(){
		return SwitchRobot.get();
	}
	
	public static boolean GetSwitchElevator(){
		return SwitchElevator.get();
	}
	
	/*
	 * 
	 * AXIS
	 */
	
	public static double getXboxXAxis(){
		return xbox.getRawAxis(0);
	}
	
	public static double getXboxYAxis(){
		return xbox.getRawAxis(1);
	}
	
	/*
	 * 
	 * BUTTONS
	 */
	
	public static boolean getXboxAButton(){
		return xbox.getRawButton(1);
	}
	
	public static boolean getXboxBButton(){
		return xbox.getRawButton(2);
	}
	
	public static boolean getXboxXButton(){
		return xbox.getRawButton(3);
	}
	
	public static boolean getXboxYButton(){
		return xbox.getRawButton(4);
	}
	
}
