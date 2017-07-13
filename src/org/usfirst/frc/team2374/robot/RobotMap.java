package org.usfirst.frc.team2374.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static final int TALON_LEFT_1 = 1;
	public static final int TALON_LEFT_2 = 2;
	public static final int TALON_RIGHT_1 = 3;
	public static final int TALON_RIGHT_2 = 4;
	
	public static final int TALON_LEFT_BROOM = 5;
	public static final int TALON_RIGHT_BROOM = 6;
	public static final int TALON_FRONT_BROOM = 7;
	public static final int TALON_REAR_BROOM = 8;
	
	public static final int DRIVER_JOY = 0;
	
	//this may only work with Razor Sabertooth
	public static final int RS_LEFT_AXIS_Y = 1;
	public static final int RS_RIGHT_AXIS_Y = 5;
	public static final int RS_LEFT_BUMPER = 5;
	public static final int RS_RIGHT_BUMPER = 6;
}
