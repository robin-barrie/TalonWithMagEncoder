
package org.usfirst.frc2337.TalonSRXwithMagEncoder;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
 
    public static CANTalon retractorMotorA;

  

    public static void init() {
   
        retractorMotorA = new CANTalon(7);
        LiveWindow.addActuator("Retractor", "MotorA", retractorMotorA);
        
        //PercentVbus(0), Position(1), Speed(2), Current(3), Voltage(4), Follower(5), Disabled(15);
        retractorMotorA.setControlMode(1); 
        
        //QuadEncoder(0), AnalogPot(2), AnalogEncoder(3), EncRising(4), EncFalling(5), 
        //CtreMagEncoder_Relative(6), CtreMagEncoder_Absolute(7), PulseWidth(8);
        //defaults to QuadEncoder
        retractorMotorA.setFeedbackDevice(FeedbackDevice.CtreMagEncoder_Relative);
     
        //  * Set the allowable closed loop error for selected profile. (0 or 1)
        // mA for Curent closed loop.  Talon Native Units for position and velocity 
        //409 corresponds to 9.985% of a rotation or 35.95 degrees (assuming 4096 units per rotation, CTRE Mag Encoder).
        retractorMotorA.setAllowableClosedLoopErr(60);

        //Configure how many codes per revolution are generated by your encoder.
        	//retractorMotorA.configEncoderCodesPerRev(360);
        
        // Limits the rate at which the throttle will change. Only affects position
        // and speed closed loop modes, in volts / sec.
        	//retractorMotorA.setCloseLoopRampRate(12);
        
        // Set the voltage ramp rate for the current profile.
        // Limits the rate at which the throttle will change. Affects all modes.
        // @param rampRate Maximum change in voltage, in volts / sec.
        	//retractorMotorA.setVoltageRampRate(12);

        //all modes
        retractorMotorA.configMaxOutputVoltage(12);
        //above calls below and applies value as (+,-) for closed loop modes
        retractorMotorA.configPeakOutputVoltage(12, -12);
        
        retractorMotorA.configNominalOutputVoltage(6, -6);
        
        retractorMotorA.enableBrakeMode(true);
        
        retractorMotorA.setEncPosition(11);
        
        //retractorMotorA.setPIDSourceType(source); getPIDSourceType...???
        //retractorMotorA.startLiveWindowMode();
        
        
        //used to change mode later in program?,  use set right after.
        	//retractorMotorA.changeControlMode(TalonControlMode.Position);   //TalonControlMode.PercentVbus
        	//retractorMotorA.set(0);//encoder tic for position; -1 to 1 for %vbus, depending on mode

        
        /* NOTES:
         * 
         * SENSOR MUST GO POSITIVE WHILE TALON DRIVES POSITIVE (GREEN LIGHT)
         * PWM => getPulseWidthPosition (absolute)  ...setPulseWidthPosition
         * Quad => getEncoderPosition ....setEncoderPosition
        
         * delete() calls disable()
         * 
         * setPID(double p, double i, double d, double f, int izone, double closeLoopRampRate, int profile)
         * note!!:  use roboRio to tune on the fly and then set in program.
         * profiles store above along with peak & nominal output.
         * 
         * 
         * set()
         *    * Sets the appropriate output on the talon, depending on the mode.
         * In PercentVbus, the output is between -1.0 and 1.0, with 0.0 as stopped. In
         * Follower mode, the output is the integer device ID of the talon to
         * duplicate. In Voltage mode, outputValue is in volts. In Current mode,
         * outputValue is in amperes. In Speed mode, outputValue is in position change
         * / 10ms. In Position mode, outputValue is in encoder ticks or an analog
         * value, depending on the sensor.
         * 
         *setInverted();
         * Inverts the direction of the motor's rotation. Only works in PercentVbus mode.
         * 
         * getError()
         * Returns the difference between the setpoint and the current position.
         * @return The error in units corresponding to whichever mode we are in.
         * returns getClosedLoopError()
         * 
         * reverseSensor(true);
         *    * Flips the sign (multiplies by negative one) the sensor values going into
         * the talon.  This only affects position and velocity closed loop control. Allows for
         * situations where you may have a sensor flipped and going in the wrong direction
         * 
         * reverseOutput(true)
         *    * Flips the sign (multiplies by negative one) the throttle values going into
         * the motor on the talon in closed loop modes.
         * 
         * get()
         *  * In Current mode: returns output current. In Speed mode: returns current
         * speed. In Position mode: returns current sensor position. In PercentVbus
         * and Follower modes: returns current applied throttle.
         * Position : getSensorPosition???
         * 
         * getEncPosition()
         * gets encoder position regardless if it is input device
         * 
         *pidget() returns getPosition()
         * 
         * getPosition()
         *  * @return The position of the sensor currently providing feedback. 
         * 
         * setPosition()
         * ???????
         * 
         * setAllowableCLosedLoopError(int)
         *  * Set the allowable closed loop error for selected profile. (0 or 1)
         * mA for Curent closed loop.  Talon Native Units for position and velocity 
         * 
         * getControlMode()
         * 
         * setFeedbackDevice()
         * 
         * enable() calls enableControl()
         * 
         * isControlEnabled()
         * 
         * GetFirmwareVersion()
         * 
         * getSetpoint()
         * * Returns the latest value set using set()
         * 
         * stopMotor() & disable() calls disableControl()
         * 
         * 
         *GetNativeUnitsPerRotationScalar(FeedbackDevice devToLookup)
         * * CtreMagEncoder_Relative, CtreMagEncoder_Absolute, QuadEncoder
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         */
        
        
    }
}