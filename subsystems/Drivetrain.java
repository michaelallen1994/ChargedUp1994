// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class Drivetrain extends SubsystemBase {
  private final MotorController leftMotor1 = new CANSparkMax(DriveConstants.kLeftMotor1Port, MotorType.kBrushless);
  private final MotorController leftMotor2 = new CANSparkMax(DriveConstants.kLeftMotor2Port, MotorType.kBrushless);
  private final MotorControllerGroup left = new MotorControllerGroup(leftMotor1, leftMotor2);
  private final MotorController rightMotor1 = new CANSparkMax(DriveConstants.kRightMotor1Port, MotorType.kBrushless);
  private final MotorController rightMotor2 = new CANSparkMax(DriveConstants.kRightMotor2Port, MotorType.kBrushless);
  private final MotorControllerGroup right = new MotorControllerGroup(rightMotor1, rightMotor2);
  private final DifferentialDrive drive = new DifferentialDrive(left, right);
  AHRS ahrs;
  
  /** Creates a new DriveSubsystem. */
  public void Drive (int kleft, int kright) {
    drive.arcadeDrive(kleft, kright);
    drive.setMaxOutput(1);
    left.set(DriveConstants.kLeft);
    right.set(DriveConstants.kRight);
    drive.setSafetyEnabled(false);
  }

  public void arcadeDrive(double fwd, double rot) {
    drive.arcadeDrive(fwd, rot);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }

  public void Stop() {
    
  }
}
