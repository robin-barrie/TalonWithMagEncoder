package org.usfirst.frc2337.TalonSRXwithMagEncoder.commands;

import org.usfirst.frc2337.TalonSRXwithMagEncoder.Robot;
import org.usfirst.frc2337.TalonSRXwithMagEncoder.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class configEncoderCPR extends Command{
	public int m_target;
	
    public configEncoderCPR(int target) {
    	m_target = target;
        //super();
       requires(Robot.retractor);   
    }


	protected void initialize() {
		
		RobotMap.retractorMotorA.configEncoderCodesPerRev(m_target);

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
