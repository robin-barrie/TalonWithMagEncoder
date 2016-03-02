
package org.usfirst.frc2337.TalonSRXwithMagEncoder.subsystems;

import org.usfirst.frc2337.TalonSRXwithMagEncoder.RobotMap;
import org.usfirst.frc2337.TalonSRXwithMagEncoder.commands.*;
import edu.wpi.first.wpilibj.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Retractor extends Subsystem {



    private final CANTalon motorA = RobotMap.retractorMotorA;

  

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {

        // Set the default command for a subsystem here.
        setDefaultCommand(new DoNothing());
    }
    
    public void set(double target) {
    	set(target);
    }
    
    public void methods() {
    
    	
    	this.motorA.setEncPosition(1);
    	this.motorA.setAllowableClosedLoopErr(400);
    	this.motorA.setEncPosition(1);
    	this.motorA.setPosition(0);
    	this.motorA.setPulseWidthPosition(0);
    	this.motorA.setSetpoint(0);
    	
    	this.motorA.configEncoderCodesPerRev(360);
    	this.motorA.disable();
    	this.motorA.enable();
    	this.motorA.pidGet();
  
    	
    }
    public void setControlModeTest() {
     //case statement   
    	this.motorA.changeControlMode(CANTalon.TalonControlMode.Position);
    	
    	this.motorA.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
    	}

    
    
    
    
}

