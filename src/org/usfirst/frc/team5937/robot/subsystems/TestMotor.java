package org.usfirst.frc.team5937.robot.subsystems;

import org.usfirst.frc.team5937.robot.commands.MoveTestMotor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;


//A subsystem to control a single motor, to test the code or system
public class TestMotor extends Subsystem {

    //Sets default command for the system
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new MoveTestMotor());
    }

    //Moves the motor at a constant rate
    public void moveForward() {
        RobotMap.testMotor.set(1.0);
    }
}