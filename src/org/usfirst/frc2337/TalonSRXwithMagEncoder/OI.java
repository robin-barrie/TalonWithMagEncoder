
package org.usfirst.frc2337.TalonSRXwithMagEncoder;

import org.usfirst.frc2337.TalonSRXwithMagEncoder.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc2337.TalonSRXwithMagEncoder.subsystems.*;
import edu.wpi.first.wpilibj.buttons.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.



    public JoystickButton green_A;
    public JoystickButton red_B;
    public JoystickButton blue_X;
    public JoystickButton yellow_Y;
    public JoystickButton left_Bumper;
    public JoystickButton right_Bumper;
    public JoystickButton back_Button;
    public JoystickButton start_Button;
    public JoystickButton left_Stick_Hat;
    public JoystickButton right_Stick_Hat;
    public Joystick joystick;

    public OI() {
   
        joystick = new Joystick(0);
        
        right_Stick_Hat = new JoystickButton(joystick, 10);
        right_Stick_Hat.whenPressed(new DoNothing());
        
        left_Stick_Hat = new JoystickButton(joystick, 9);
        left_Stick_Hat.whenPressed(new DoNothing());
        
        start_Button = new JoystickButton(joystick, 8);
        start_Button.whenPressed(new enable());
        SmartDashboard.putData("enable", new enable());
        
        back_Button = new JoystickButton(joystick, 7);
        back_Button.whenPressed(new disable());
        SmartDashboard.putData("disable", new disable());
        
        right_Bumper = new JoystickButton(joystick, 6);
        right_Bumper.whenPressed(new DoNothing());
        
        left_Bumper = new JoystickButton(joystick, 5);
        left_Bumper.whenPressed(new resetEnc());
        left_Bumper.whenReleased(new resetPWM());
        SmartDashboard.putData("resetEnc", new resetEnc());
        SmartDashboard.putData("resetPWM", new resetPWM());
        
        yellow_Y = new JoystickButton(joystick, 4);
        yellow_Y.whenPressed(new set(5000));
        SmartDashboard.putData("set 5000", new set(5000));
   
        
        blue_X = new JoystickButton(joystick, 3);
        blue_X.whenPressed(new set(1000));
        SmartDashboard.putData("set 1000", new set(1000));
        
        red_B = new JoystickButton(joystick, 2);
        red_B.whenPressed(new set(1));
        SmartDashboard.putData("set 1", new set(1));
        
        green_A = new JoystickButton(joystick, 1);
        green_A.whenPressed(new set(0));
        SmartDashboard.putData("set 0", new set(0));


        // SmartDashboard Buttons
        SmartDashboard.putData("changeControlModeToPercentVbus, 0", new changeControlModeToPercentVbus(0));
        SmartDashboard.putData("changeControlModeToPercentVbus, 0", new changeControlModeToPosition(0));
        
        SmartDashboard.putData("setAllowableClosedLoopErr, 500", new setAllowableClosedLoopErr(500));
        SmartDashboard.putData("setAllowableClosedLoopErr, 30", new setAllowableClosedLoopErr(30));
        
        SmartDashboard.putData("setEncPosition, 3500", new setEncPosition(3500));
        SmartDashboard.putData("setEncPosition, 22", new setEncPosition(22));
        
        SmartDashboard.putData("setPosition, 300", new setPosition(300));
        SmartDashboard.putData("setPosition, 3", new setPosition(3));
        
        SmartDashboard.putData("setPulseWidthPosition, 16", new setPulseWidthPosition(16));
        SmartDashboard.putData("setPulseWidthPosition, 1", new setPulseWidthPosition(1));
        
        SmartDashboard.putData("configEncoderCodesPerRev, 360", new configEncoderCPR(360));

        
        

        SmartDashboard.putNumber("get", RobotMap.retractorMotorA.get());
        SmartDashboard.putNumber("getPosition", RobotMap.retractorMotorA.getPosition());
        SmartDashboard.putNumber("getEncPosition", RobotMap.retractorMotorA.getEncPosition());
        SmartDashboard.putNumber("getPulseWidthPosition", RobotMap.retractorMotorA.getPulseWidthPosition());
        SmartDashboard.putNumber("pidGet", RobotMap.retractorMotorA.pidGet());
        
        SmartDashboard.putNumber("getSetpoint", RobotMap.retractorMotorA.getSetpoint());
        
        SmartDashboard.putNumber("getError", RobotMap.retractorMotorA.getError());
        SmartDashboard.putNumber("getClosedLoopError", RobotMap.retractorMotorA.getClosedLoopError());
        
        SmartDashboard.putNumber("getCloseLoopRampRate", RobotMap.retractorMotorA.getCloseLoopRampRate());
        
      
        
        
        
/*
        SmartDashboard.putString("test", RobotMap.retractorMotorA.getClass());
        SmartDashboard.putNumber(RobotMap.retractorMotorA.getControlMode());
        SmartDashboard.putData(RobotMap.retractorMotorA.getDescription());
        SmartDashboard.putData(RobotMap.retractorMotorA.getPIDSourceType());
        SmartDashboard.putData(RobotMap.retractorMotorA.getTable());
*/
 
    }


    public Joystick getJoystick() {
        return joystick;
    }



}

