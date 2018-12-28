package org.usfirst.frc.team5937.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

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
