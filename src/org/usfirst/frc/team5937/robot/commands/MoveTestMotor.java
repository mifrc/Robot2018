package org.usfirst.frc.team5937.robot.commands;

import org.usfirst.frc.team5937.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class MoveTestMotor extends Command {

    public MoveTestMotor() {
    	//Requires defines any subsystem dependencies, so more than one command can't
    	//use a subsystem at the same time
    	requires(Robot.testMotor);
    }	
	
    //Returns whether the command is finished
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	//Starts the command
	@Override
	public void start() {
		
	}
	
}