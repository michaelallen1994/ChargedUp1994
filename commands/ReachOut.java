// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Reach;

public class ReachOut extends CommandBase {
  private final Reach reach;
  /** Creates a new ReachOut. */
  public ReachOut(Reach subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    reach = subsystem;
    addRequirements(reach);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    reach.Pull();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    reach.Pull();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    reach.Stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
