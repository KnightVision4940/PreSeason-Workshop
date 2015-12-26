package org.usfirst.frc.team4940.robot;
import edu.wpi.first.wpilibj.Talon;
public class Elevator {

	Talon Elevator = new Talon(Map.ELEVATOR);
	
	public double GetElevator(){
		return Elevator.get();
	}

	public void SetElevator(double _Speed){
		Elevator.set(_Speed);
	}
	
	Talon TopElevator = new Talon(Map.TOPELEVATOR);
	
	public double GetTopElevator(){
		return TopElevator.get();
	}

	public void SetTopElevator(double _Speed){
		TopElevator.set(_Speed);
	}
	
	
	
	
	
	
}
