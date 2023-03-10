// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {

  public CANSparkMax intakeController0;
  public CANSparkMax intakeController1;
  
  double IntakeSpeed = Constants.Intake.intakeSpeed;
  double intakeSpeedCone = Constants.Intake.intakeSpeedCone;
  double intakeSpeedCube = Constants.Intake.intakeSpeedCube;

  //public CANSparkMax intakeController0;

  /** Creates a new IntakeSubsytstem. */
  public IntakeSubsystem() {

    intakeController0 = new CANSparkMax(
      Constants.Intake.canMotorDeviceId05,
      MotorType.kBrushless
    );

    intakeController1 = new CANSparkMax(
      Constants.Intake.canMotorDeviceId06,
      MotorType.kBrushless
    );

    intakeController0.setInverted(true);
    intakeController1.setInverted(true);


    SmartDashboard.putNumber("Intake Speed", IntakeSpeed);
  }

  public void forwardCube() {
    intakeController0.set(0.02);
    intakeController1.set(-0.02);
  }

  public void backwardCube() {
    intakeController0.set(intakeSpeedCube);
    intakeController1.set(intakeSpeedCube);
  }

  public void backwardCone() {
    intakeController0.set(intakeSpeedCone);
    intakeController1.set(intakeSpeedCone);
  }

  public void ForwardCone() {
    intakeController0.set(intakeSpeedCone);
    intakeController1.set(intakeSpeedCone);
  }

  public void forward(){
    //intakeController0 = SmartDashboard.getNumber("intake", IntakeSpeed);
  }

  public void stop(){
    intakeController0.set(Constants.STOPPOWER);
    intakeController1.set(Constants.STOPPOWER);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
