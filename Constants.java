// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
 
  public static class DriveConstants { 
    public static final int kLeftMotor1Port = 1;
    public static final int kLeftMotor2Port = 4; 
    public static final int kRightMotor1Port = 2; 
    public static final int kRightMotor2Port = 3; 
    
    
    public static final int kLeft = 1; 
    public static final int kRight = 1; 



    public static final double kMaxTurnRateDegPerS = 30; 
    public static final double kMaxTurnAccelarationDegPerSSquared = 300; 

    public static final double kTurnToleranceDeg = 5; 
    public static final double kTurnRateTolerannceDegPerS = 10; // degrees per second

  
     }
    public static final class ArmConstants {
      public static final int kArmMotorPort =5;
      public static final int[] kArmEncoderPorts = new int[]{4, 5};
      public static final int kEncoderCPP = 180;
      public static final double kArmDiameterInches = 8;
      public static final double kEncoderDistancePerPulse = (kArmDiameterInches * Math.PI) / (double) kEncoderCPP;
      public static final double kArmMotorSpeedUp = .75;
      public static final double kArmMotorSpeedDown = -.5;
      public static final double kSVolts = 0;
      public static final double KVVoltSecondPerRotation = 0;
      public static final double kArmToleranceRPS = 0;
      public static final double kArmTargetRPS = 0;
    }

    public static final class HandConstants {
      public static final int kHandMotorPort = 6;
      public static final int[] kHandEncoderPorts = new int[]{6, 7};
      public static final double kHandClose = 1;
      public static final double kHandOpen = -1;
    }

    public static final class ReachConstants {
      public static final int kReachMotorPort = 7;
      public static final double kReachOut = 1;
      public static final double kPullIn = -1;
    }

    public static final class TurntableConstants {
      public static final int kTurntableMotorPort = 8;
      public static final double kTurnRight = .5;
      public static final double kTurnLeft = -.5;
    }

    public static class OperaterConstants {
      public static final int kDriverControllerPort = 0;
    }
}