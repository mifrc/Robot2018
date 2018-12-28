package org.usfirst.frc.team5937.robot.subsystems;

import org.usfirst.frc.team5937.robot.commands.MoveTestMotor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;


//A subsystem to control a single motor, to test the code or system
public class TestMotor extends Subsystem {
	
	//Sets default command for the system
	@Override
	protected void initDefaultCommand() {
		
	}
	
	// Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    public void periodic() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    }
    
    //Moves the motor at a constant rate
    protected void moveForward() {
    	RobotMap.testMotor.set(1.0);
    }
}