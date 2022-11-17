// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.DemandType;
import com.ctre.phoenix.motorcontrol.TalonSRXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motor extends SubsystemBase {
  /** Creates a new Motor. */

  private TalonSRX motor;
  private int motorID = 0;
  private double kP = 0;
  private double kI = 0;
  private double kD = 0;
  private double kFF = 0;
  
  public Motor() {
    motor = new TalonSRX(motorID);
    motor.configFactoryDefault();

    motor.config_kP(0, kP);
    motor.config_kI(0, kI);
    motor.config_kD(0, kD);
    motor.config_kF(0, kFF);
    motor.configSelectedFeedbackSensor(TalonSRXFeedbackDevice.CTRE_MagEncoder_Relative,0, 35);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    log();
  }

  public void setSpeed(double speed)
  {
    // use ControlMode.Velocity to set the speed of the motor
  }

  public void log()
  {
      // log out current speed
  }

  public void stopSpeed()
  {
    // stop the motor
  }

}
