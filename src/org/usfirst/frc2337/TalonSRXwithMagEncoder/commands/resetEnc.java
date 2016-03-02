package org.usfirst.frc2337.TalonSRXwithMagEncoder.commands;

import org.usfirst.frc2337.TalonSRXwithMagEncoder.Robot;
import org.usfirst.frc2337.TalonSRXwithMagEncoder.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class resetEnc extends Command{
	
	
    public resetEnc() {
    
        //super();
       requires(Robot.retractor);   
    }


	protected void initialize() {
		RobotMap.retractorMotorA.setEncPosition(0);

	}

	@Override
	protected void execute() {
		
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {
		
	}

	@Override
	protected void interrupted() {
		
	}

}
