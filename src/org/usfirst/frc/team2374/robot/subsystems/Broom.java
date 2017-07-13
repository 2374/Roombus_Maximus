package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.RobotMap;
import org.usfirst.frc.team2374.robot.commands.BroomWithJoy;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Broom extends Subsystem {
	
	private static final double BROOM_SPEED = 0.5;

	private Talon left, right, front, rear;
	
	public Broom() {
		left = new Talon(RobotMap.TALON_LEFT_BROOM);
		right = new Talon(RobotMap.TALON_RIGHT_BROOM);
		front = new Talon(RobotMap.TALON_FRONT_BROOM);
		rear = new Talon(RobotMap.TALON_REAR_BROOM);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new BroomWithJoy());
	}
	
	public void start() {
		left.set(BROOM_SPEED);
		right.set(-BROOM_SPEED);
		front.set(BROOM_SPEED);
		rear.set(-BROOM_SPEED);
	}
	
	public void stop() {
		left.set(0);
		right.set(0);
		front.set(0);
		rear.set(0);
	}

}
