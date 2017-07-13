package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;
import org.usfirst.frc.team2374.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

public class DriveWithJoy extends Command {
	
	private static final Drivetrain DRIVE = Robot.drive;

	public DriveWithJoy() {
		requires(DRIVE);
	}
	
	@Override
	protected void initialize() {
	}
	
	@Override
	protected void execute() {
		double leftJoy = Robot.oi.getDriverLeftY();
		double rightJoy = Robot.oi.getDriverRightY();
		DRIVE.tankDrive(leftJoy, rightJoy);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void end() {
		DRIVE.tankDrive(0, 0);
	}
	
	@Override
	protected void interrupted() {
		end();
	}

}
