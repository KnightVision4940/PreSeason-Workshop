package org.usfirst.frc.team4940.robot;
import edu.wpi.first.wpilibj.Timer; 
public class Autonomous {

	Claw claw = new Claw();//create Claw Object
	Elevator elev = new Elevator();//create elevator object 
	Wheels chassis = new Wheels();//Create wheel object
	
	public void run(int _mode){//Create method (for different modes of autonomous)
		if (_mode == 0){
			chassis.DriveRobot(0.5, 0); //using object chassis and method from class Wheels
			Timer.delay(5);
			chassis.DriveRobot(0, 0);
		}
		if (_mode == 1){
			chassis.DriveRobot(1, 0);
			Timer.delay(3);
			chassis.DriveRobot(0,0);
			claw.SetClaw(0.5);
			Timer.delay(1);
			claw.SetClaw(0);
			chassis.DriveRobot(-0.5,0);
			Timer.delay(3);
			chassis.DriveRobot(0,0);
		}
		if (_mode == 2){
			elev.SetTopElevator(1);
			Timer.delay(2);
			elev.SetTopElevator(0);
			elev.SetElevator(1);
			Timer.delay(2);
			elev.SetElevator(0);
		}
	}
}

