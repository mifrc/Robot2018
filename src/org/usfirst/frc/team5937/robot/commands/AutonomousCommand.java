package org.usfirst.frc.team5937.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

//Abstract class for an autonomous command. Autonomous commands should extend this
public abstract class AutonomousCommand extends Command {

	public AutonomousCommand() {
	}

	public AutonomousCommand(String name) {
		super(name);
	}

	public AutonomousCommand(double timeout) {
		super(timeout);
	}

	public AutonomousCommand(String name, double timeout) {
		super(name, timeout);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}
