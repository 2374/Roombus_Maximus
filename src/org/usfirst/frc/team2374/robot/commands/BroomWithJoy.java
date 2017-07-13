package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;
import org.usfirst.frc.team2374.robot.subsystems.Broom;

import edu.wpi.first.wpilibj.command.Command;

public class BroomWithJoy extends Command {
	
	private static final Broom BROOM = Robot.broom;
	
	public BroomWithJoy() {
		requires(BROOM);
	}
	
	@Override 
	protected void initialize() {
	}
	
	@Override
	protected void execute() {
		if(Robot.oi.getLeftBumper() || Robot.oi.getRightBumper())
			BROOM.start();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void end() {
		BROOM.stop();
	}
	
	@Override
	protected void interrupted() {
		end();
	}

}
