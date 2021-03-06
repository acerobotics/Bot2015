// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4711.TankDrive;
    
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainleftMotor;
    public static SpeedController driveTrainrightMotor;
    public static RobotDrive driveTraindrive;
    public static SpeedController forkliftarmMotor;
    public static Encoder forkliftQuadratureEncoder1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainleftMotor = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "leftMotor", (Talon) driveTrainleftMotor);
        
        driveTrainrightMotor = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "rightMotor", (Talon) driveTrainrightMotor);
        
        driveTraindrive = new RobotDrive(driveTrainleftMotor, driveTrainrightMotor);
        
        driveTraindrive.setSafetyEnabled(true);
        driveTraindrive.setExpiration(0.1);
        driveTraindrive.setSensitivity(0.5);
        driveTraindrive.setMaxOutput(1.0);
        

        forkliftarmMotor = new Talon(2);
        LiveWindow.addActuator("Forklift", "armMotor", (Talon) forkliftarmMotor);
        
        forkliftQuadratureEncoder1 = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Forklift", "Quadrature Encoder 1", forkliftQuadratureEncoder1);
        forkliftQuadratureEncoder1.setDistancePerPulse(1.0);
        forkliftQuadratureEncoder1.setPIDSourceParameter(PIDSourceParameter.kRate);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
		
	
}
