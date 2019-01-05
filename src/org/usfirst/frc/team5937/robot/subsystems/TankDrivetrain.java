package org.usfirst.frc.team5937.robot.subsystems;

import org.usfirst.frc.team5937.robot.devices.Wheel;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;


// Tank drivetrain subsystem
class TankDrivetrain extends Drivetrain {
	public void moveForwards() {
		doMotion(1, 1, 1, 1);
	}
	
	public void moveBackwards() {
		doMotion(-1, -1, -1, -1);
	}
	
	public void moveRight() {
		
	}
	
	public void moveLeft() {
		
	}
	
	public void turnRight() {
		doMotion(1, -1, 1, -1);
	}

	public void turnLeft() {
		doMotion(-1, 1, -1, 1);
	}
}
