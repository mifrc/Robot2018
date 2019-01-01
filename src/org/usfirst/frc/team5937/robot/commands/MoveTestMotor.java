package org.usfirst.frc.team5937.robot.commands;

import org.usfirst.frc.team5937.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

//Command to move the test motor
public class MoveTestMotor extends Command {

    public MoveTestMotor() {
        //Requires defines any subsystem dependencies, so more than one command can't
        //use a subsystem at the same time
        requires(Robot.testMotor);
    }	

    //Starts the command
    @Override
    public void start() {

    }

    //Called periodically while the command is running
    @Override
    protected void execute() {
        Robot.testMotor.moveForward();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
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
        end();
    }

}