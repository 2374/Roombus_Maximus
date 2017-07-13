/**
 * 
 */
package org.usfirst.frc.team2374.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team2374.robot.RobotMap;
import org.usfirst.frc.team2374.robot.commands.DriveWithJoy;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;

/**
 * @author robotics
 *
 */
public class Drivetrain extends Subsystem {
	
	private RobotDrive robotDrive;
	private Talon left1, left2, right1, right2, left3;
	
	public Drivetrain() {
		left1 = new Talon(RobotMap.TALON_LEFT_1);
		left2 = new Talon(RobotMap.TALON_LEFT_2);
		right1 = new Talon(RobotMap.TALON_RIGHT_1);
		right2 = new Talon(RobotMap.TALON_RIGHT_2);
		
		left1.setInverted(true);
		left2.setInverted(false);
		right1.setInverted(true);
		right2.setInverted(false);
		
		robotDrive = new RobotDrive(left1, left2, right1, right2);
		robotDrive.setSafetyEnabled(false);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveWithJoy());
	}
	
	public void tankDrive(double left, double right) {
		robotDrive.tankDrive(left, right);
	}

}
