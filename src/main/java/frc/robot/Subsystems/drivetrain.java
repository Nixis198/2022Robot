// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class drivetrain extends SubsystemBase {

  public static final VictorSP m_frontLeft = new VictorSP(0); //make a constants file later
  public static final VictorSP m_frontRight = new VictorSP(2);
  public static final VictorSP m_backLeft = new VictorSP(1);
  public static final VictorSP m_backRight = new VictorSP(3);

  public static final MotorControllerGroup m_leftMotors = new MotorControllerGroup(m_frontLeft,m_backLeft);
  public static final MotorControllerGroup m_rightMotors = new MotorControllerGroup(m_frontRight,m_backRight);

  public static final DifferentialDrive m_drive = new DifferentialDrive(m_leftMotors, m_rightMotors);

  /** Creates a new drivetrain. */
  public drivetrain() {
    //where we configure stuff
    m_leftMotors.setInverted(false);
    m_rightMotors.setInverted(false);
  }

  public static void tankDrive(double leftSpeed, double rightSpeed) {
    m_drive.tankDrive(leftSpeed, rightSpeed);
  }

  public static void arcadeDrive(double xSpeed, double zRotation) {
    m_drive.arcadeDrive(xSpeed, zRotation);
  }

  public static void stopMotor() {
    m_drive.stopMotor();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
