// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.TurntableConstants;

public class Rotate extends SubsystemBase {
  /** Creates a new Rotate. */
  private final CANSparkMax turntableMotor = new CANSparkMax(TurntableConstants.kTurntableMotorPort, MotorType.kBrushless);

  public void TurnRight() {
    turntableMotor.set(TurntableConstants.kTurnRight);
  }

  public void TurnLeft() {
    turntableMotor.set(TurntableConstants.kTurnLeft);
  }

  public void Stop() {
    turntableMotor.set(0);
  }
  
  public Rotate() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
