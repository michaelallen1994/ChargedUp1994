// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ReachConstants;

public class Reach extends SubsystemBase {
  private final CANSparkMax reachMotor = new CANSparkMax(ReachConstants.kReachMotorPort, MotorType.kBrushless);
  /** Creates a new Reach. */

  public void ReachOut() {
    reachMotor.set(ReachConstants.kReachOut);
  }

  public void Pull() {
    reachMotor.set(ReachConstants.kPullIn);
  }

  public void Stop() {
    reachMotor.set(0);
  }
  
  public Reach() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
