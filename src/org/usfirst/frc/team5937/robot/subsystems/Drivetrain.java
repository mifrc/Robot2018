package org.usfirst.frc.team5937.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

// Abstract class for a drive train. Drive train classes should extend this.
public abstract class Drivetrain extends Subsystem {
	
	public double speed = 1.0;
	
	public Drivetrain() {
	}

	public Drivetrain(String name) {
		super(name);
	}

	@Override
	protected void initDefaultCommand() {
	}
	
	public void moveForwards() {
	}
	
	public void moveBackwards() {
	}
	
	public void moveRight() {
		
	}
	
	public void moveLeft() {
		
	}
	
	public void turnRight() {
		
	}

	public void turnLeft() {
		
	}
	
	public void stop() {
	}
}
