package org.usfirst.frc2337.TalonSRXwithMagEncoder.commands;

import org.usfirst.frc2337.TalonSRXwithMagEncoder.Robot;
import org.usfirst.frc2337.TalonSRXwithMagEncoder.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Command;

public class changeControlModeToPosition extends Command{
	
	public double m_target;
	
    public changeControlModeToPosition(double target) {
    	m_target = target;
        //super();
       requires(Robot.retractor);   
    }


	protected void initialize() {
		RobotMap.retractorMotorA.changeControlMode(CANTalon.TalonControlMode.Position);
		
		RobotMap.retractorMotorA.set(m_target);
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
