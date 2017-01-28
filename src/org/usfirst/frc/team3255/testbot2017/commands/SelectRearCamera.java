package org.usfirst.frc.team3255.testbot2017.commands;

import org.usfirst.frc.team3255.testbot2017.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SelectRearCamera extends Command {

    public SelectRearCamera() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.vision);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.vision.selectRearCamera();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
