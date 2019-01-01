package org.usfirst.frc.team5937.robot.commands;

import org.usfirst.frc.team5937.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


//Example of how to program an autonomous command
public class Autonomous1 extends AutonomousCommand {

    public String name; // The name to be displayed as a choice at the SmartDashboard

    public Autonomous1() {
        name = "Autonomous1";

        //Requires defines any subsystem dependencies, so more than one command can't
        //use a subsystem at the same time
        requires(null);
    }

    //Starts the command
    @Override
    public void start() {

    }

    //Called periodically while the command is running
    @Override
    protected void execute() {

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

    }

}