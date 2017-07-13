package org.usfirst.frc.team2374.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
	
	private Joystick driver;
	private JoystickButton leftBumper;
	private JoystickButton rightBumper;
	
	public OI() {
		driver = new Joystick(RobotMap.DRIVER_JOY);
		leftBumper = new JoystickButton(driver, RobotMap.RS_LEFT_BUMPER);
		rightBumper = new JoystickButton(driver, RobotMap.RS_RIGHT_BUMPER);
	}
	
	public double getDriverLeftY() {
		return driver.getRawAxis(RobotMap.RS_LEFT_AXIS_Y);
	}
	
	public double getDriverRightY() {
		return driver.getRawAxis(RobotMap.RS_RIGHT_AXIS_Y);
	}
	
	public boolean getLeftBumper() {
		return leftBumper.get();
	}

	public boolean getRightBumper() {
		return rightBumper.get();
	}
	
}
