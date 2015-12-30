package org.usfirst.frc.team4940.robot;



public class TeleOp {

	Wheels chasis = new Wheels();
	Claw claw = new Claw();
	Elevator elevator = new Elevator();
		
	public void run(){
		
		chasis.DriveRobot(IO.getXboxYAxis(),IO.getXboxXAxis());
	
		if(IO.getXboxAButton() == true && IO.getXboxBButton() == true){
			claw.SetClaw(0);
		}else if (IO.getXboxAButton() == true){
			claw.SetClaw(1);
		}else if (IO.getXboxBButton() == true){
			claw.SetClaw(-1);
		}else{
			claw.SetClaw(0);
		}
	
		if(IO.getXboxXButton() == true && IO.getXboxYButton() == true){
			elevator.SetTopElevator(0);
			elevator.SetElevator(0);
		}else if (IO.getXboxXButton() == true){
			elevator.SetElevator(1);
		}else if (IO.getXboxYButton() == true){
			elevator.SetTopElevator(-1);
		}else{
			elevator.SetTopElevator(0);
			elevator.SetElevator(0);
		}
	}
}



