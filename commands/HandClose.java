// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Hand;

public class HandClose extends CommandBase {
  /** Creates a new HandClose. */
  private final Hand hand;

  public HandClose(Hand subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    hand = subsystem;
    addRequirements(hand);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    hand.Close();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    hand.Close();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    hand.Stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
