package org.usfirst.frc2337.TalonSRXwithMagEncoder.commands;

import org.usfirst.frc2337.TalonSRXwithMagEncoder.Robot;
import org.usfirst.frc2337.TalonSRXwithMagEncoder.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class set extends Command{
	
	public double m_target;
	
    public set(double target) {
    	m_target = target;
        //super();
       requires(Robot.retractor);   
    }

	/*
	Sets the appropriate output on the talon, depending on the mode. 
	In PercentVbus, the output is between -1.0 and 1.0, with 0.0 as stopped. 
	In Follower mode, the output is the integer device ID of the talon to duplicate. 
	In Voltage mode, outputValue is in volts. In Current mode, outputValue is in amperes. 
	In Speed mode, outputValue is in position change / 10ms. 
	In Position mode, outputValue is in encoder ticks or an analog value, depending on the sensor.
	 */
	protected void initialize() {
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
