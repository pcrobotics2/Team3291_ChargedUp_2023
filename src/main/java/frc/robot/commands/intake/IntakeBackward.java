// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeBackward extends CommandBase {
  public IntakeSubsystem intakeSubsytstem;
  /** Creates a new IntakeBackward. */
  public IntakeBackward(IntakeSubsystem intake) {
    // Use addRequirements() here to declare subsystem dependencies.
  intakeSubsytstem = intake;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    intakeSubsytstem.backward();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intakeSubsytstem.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
