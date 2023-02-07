// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.HandConstants;

public class Hand extends SubsystemBase {
  /** Creates a new Hand. */
  private final CANSparkMax handMotor = new CANSparkMax(HandConstants.kHandMotorPort, MotorType.kBrushless);

  public void Close() {
    handMotor.set(HandConstants.kHandClose);
  }

  public void Open() {
    handMotor.set(HandConstants.kHandOpen);
  }

  public void Stop() {
    handMotor.set(0);
  }
  
  public Hand() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
