/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.						*/
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.															   */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5937.robot;

import org.usfirst.frc.team5937.robot.subsystems.TestMotor;
import org.usfirst.frc.team5937.robot.commands.Autonomous1;
import org.usfirst.frc.team5937.robot.commands.MoveTestMotor;
import org.usfirst.frc.team5937.robot.commands.AutonomousCommand;
import org.usfirst.frc.team5937.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import java.util.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {
	public RobotInfo info; // Static information about the robot (team and starting position)
	public MoveTestMotor moveTestMotor;
	public AutonomousCommand autonomousCommand; // The command to be run in the autonomous
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		SmartDashboardCommunicator.initialize();

		info = new RobotInfo();
		

		
	}

	// Called when autonomous mode starts. Starts the autonomous command
	@Override
	public void autonomousInit() {
		System.out.printf("Autonomous selected: %s", SmartDashboardCommunicator.getInstance().autonomousChooser.getSelected().name);
		autonomousCommand = SmartDashboardCommunicator.getInstance().autonomousChooser.getSelected();
		autonomousCommand.start();
	}

	// Called periodically during autonomous
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		//TODO send status to the SmartDashboard
	}


	// Called when the robot is put into operator control mode
	@Override
	public void teleopInit() {
		autonomousCommand.cancel();
	}
	
	// Called periodically during operator control period
	@Override
	public void teleopPeriodic() {
	}

	
	//Called when the robot is put into test mode
	@Override
	public void testInit() {
		Scheduler.getInstance().removeAll();
		moveTestMotor.start();
	}
	
	//Called periodically during test mode
	@Override
	public void testPeriodic() {
		Scheduler.getInstance().run();
	}


	//Called when robot is put into disabled mode
	@Override
	public void disabledInit() {
		Scheduler.getInstance().removeAll();
	}
	
	//Called periodically when the robot is in disabled mode
	@Override
	public void disabledPeriodic() {
		
	}
}
