// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.Constants.OperaterConstants;
import frc.robot.commands.ArmDown;
import frc.robot.commands.ArmUp;
import frc.robot.commands.AutoOne;
import frc.robot.commands.HandClose;
import frc.robot.commands.HandOpen;
import frc.robot.commands.PullBack;
import frc.robot.commands.ReachOut;
import frc.robot.commands.RotateLeft;
import frc.robot.commands.RotateRight;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Hand;
import frc.robot.subsystems.Reach;
import frc.robot.subsystems.Rotate;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  AHRS ahrs;
  Joystick joystick = new Joystick(OperaterConstants.kDriverControllerPort);
  private final Drivetrain driveTrain = new Drivetrain();
  private final Arm arm = new Arm();
  private final Hand hand = new Hand();
  private final Reach reach = new Reach();
  private final Rotate rotate = new Rotate();
  
  private final Command autoOne = new AutoOne(driveTrain);

  SendableChooser<Command> chooser = new SendableChooser<>();

  public void teleopPeriodic() {
    
  }

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
    new JoystickButton(joystick, 1).whileTrue((new HandClose(hand)));
    new JoystickButton(joystick, 3).whileTrue((new HandOpen(hand)));
    new JoystickButton(joystick, 6).whileTrue((new RotateRight(rotate)));
    new JoystickButton(joystick, 5).whileTrue((new RotateLeft(rotate)));
    new JoystickButton(joystick, 7).whileTrue((new ArmDown(arm)));
    new JoystickButton(joystick, 8).whileTrue((new ArmUp(arm)));
    new JoystickButton(joystick, 4).whileTrue((new ReachOut(reach)));
    new JoystickButton(joystick, 2).whileTrue((new PullBack(reach)));

  driveTrain.setDefaultCommand(
    Commands.run(() -> driveTrain.arcadeDrive(joystick.getX(), joystick.getY()), driveTrain));
      } 
  


  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
    

    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return autoOne;
  }
}
