package org.usfirst.frc.team5937.robot;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.usfirst.frc.team5937.robot.commands.Autonomous1;
import org.usfirst.frc.team5937.robot.commands.AutonomousCommand;

import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

// Singleton class to communicate with 
public class SmartDashboardCommunicator {
    private static SmartDashboardCommunicator instance;
    
    public SendableChooser<AutonomousCommand> autonomousChooser = new SendableChooser<>(); //SendableChooser for choosing autonomous program
    private Set<AutonomousCommand> autonomousCommands; // The set of all autonomous routines
    
    public static SmartDashboardCommunicator getInstance() {
        if (instance == null) {
            instance = new SmartDashboardCommunicator();
        }
        return instance;
    }
    
    public static void initialize() {
        instance = new SmartDashboardCommunicator();
    }
    
    public SmartDashboardCommunicator() {
        
        // AUTONOMOUS SETUP:
        autonomousCommands = new TreeSet<AutonomousCommand>();

        // Add any autonomous programs to autonomousCommands as shown here:
        autonomousCommands.add(new Autonomous1());

        // Adds all autonomous commands to the SmartDashboard for the user to choose between
        Iterator<AutonomousCommand> it = autonomousCommands.iterator();
        while (it.hasNext()) {
            AutonomousCommand temp = it.next();
            autonomousChooser.addObject(temp.name, temp);
        }
        SmartDashboard.putData("Auto choices", autonomousChooser);
        
        SmartDashboard.putData(Scheduler.getInstance()); //Makes the SmartDashboard display the status of running commands
    }
}
