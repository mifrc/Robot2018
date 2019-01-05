package org.usfirst.frc.team5937.robot.devices;

import edu.wpi.first.wpilibj.Victor;

// Generic wheel
public class Wheel extends Device {
	// The wheel driver
	private Victor motor;
	
	public Wheel(String n) {
		super(n);
	}
	
	public Wheel(String n, Victor d) {
		super(n);
		
		// Assign wheel driver
		this.motor = d;
	}
	
	public void set(double speed) {
		this.motor.set(speed);
	}
	
	public void stop() {
		this.motor.set(0.0);
	}
}
