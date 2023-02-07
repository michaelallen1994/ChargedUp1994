// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ArmConstants;

public class Arm extends SubsystemBase {
  private final CANSparkMax armMotor = new CANSparkMax(ArmConstants.kArmMotorPort, MotorType.kBrushless);

  public void Lift() {
    armMotor.set(ArmConstants.kArmMotorSpeedUp);
  }
             
   public void Lower() {
    armMotor.set(ArmConstants.kArmMotorSpeedDown);
   }

   public void Stop() {
    armMotor.set(0);
   }
   public Arm() {}

   @Override
   public void periodic() {
   }
}