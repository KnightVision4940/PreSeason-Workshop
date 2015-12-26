package org.usfirst.frc.team4940.robot;
import edu.wpi.first.wpilibj.RobotDrive;

public class Wheels {

	RobotDrive Wheels = new RobotDrive(Map.FRONTWHEEL,Map.BACKWHEEL);
	
	public void DriveRobot(double _Speed,double _Turn){
		Wheels.drive(_Speed, _Turn);	
	}
}
