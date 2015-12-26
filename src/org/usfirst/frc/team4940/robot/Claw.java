package org.usfirst.frc.team4940.robot;
import edu.wpi.first.wpilibj.Talon;

public class Claw {

	Talon Claw = new Talon(Map.CLAWMOTOR);
	
	public double GetClaw(){
		return Claw.get();
	}

	public void SetClaw(double _Speed){
		Claw.set(_Speed);
	}
	
	
	
	
}
