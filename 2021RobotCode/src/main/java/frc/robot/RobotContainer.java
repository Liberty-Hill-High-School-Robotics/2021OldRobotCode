// RobotBuilder Version: 3.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package frc.robot;

import frc.robot.commands.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.*;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  private static RobotContainer m_robotContainer = new RobotContainer();

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
// The robot's subsystems
    public final drive m_drive = new drive();
    public final belt m_belt = new belt();
    public final intake m_intake = new intake();
    public final flywheel m_flywheel = new flywheel();

// Joysticks
private final XboxController controller = new XboxController(0);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  
  // A chooser for autonomous commands
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  /**
  * The container for the robot.  Contains subsystems, OI devices, and commands.
  */
  private RobotContainer() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Smartdashboard Subsystems


    // SmartDashboard Buttons
    SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
    SmartDashboard.putData("flywheelOutRun", new flywheelOutRun( m_flywheel ));
    SmartDashboard.putData("intakeInRun", new intakeInRun( m_intake ));
    SmartDashboard.putData("beltUpRun", new beltUpRun( m_belt ));
    SmartDashboard.putData("driveCommand", new driveCommand( m_drive ));
    SmartDashboard.putData("flywheelInCommand", new flywheelInCommand( m_flywheel ));
    SmartDashboard.putData("beltDownCommand", new beltDownCommand( m_belt ));
    SmartDashboard.putData("intakeOutCommand", new intakeOutCommand( m_intake ));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Configure the button bindings
    configureButtonBindings();

    // Configure default commands
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND
    m_drive.setDefaultCommand(new driveCommand( m_drive ) );


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND

    // Configure autonomous sendable chooser
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    m_chooser.setDefaultOption("Autonomous Command", new AutonomousCommand());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    SmartDashboard.putData("Auto Mode", m_chooser);
  }

  public static RobotContainer getInstance() {
    return m_robotContainer;
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
// Create some buttons

final JoystickButton intakeOutButton = new JoystickButton(controller, 1);        
intakeOutButton.whileHeld(new intakeOutCommand( m_intake ) ,true);
    SmartDashboard.putData("intakeOutButton",new intakeOutCommand( m_intake ) );

final JoystickButton beltDownButton = new JoystickButton(controller, 7);        
beltDownButton.whileHeld(new beltDownCommand( m_belt ) ,true);
    SmartDashboard.putData("beltDownButton",new beltDownCommand( m_belt ) );

final JoystickButton beltUpButton = new JoystickButton(controller, 8);    // Binding to 4 even though it is one on the controller    
beltUpButton.whileHeld(new beltUpRun( m_belt ) ,true);
    SmartDashboard.putData("beltUpButton",new beltUpRun( m_belt ) );

//final JoystickButton flywheelInButton = new JoystickButton(controller, );        
//flywheelInButton.whileHeld(new flywheelInCommand( m_flywheel ) ,true);
  //  SmartDashboard.putData("flywheelInButton",new flywheelInCommand( m_flywheel ) );

final JoystickButton flywheelOutButton = new JoystickButton(controller, 4);        
flywheelOutButton.whileHeld(new flywheelOutRun( m_flywheel ) ,true);
    SmartDashboard.putData("flywheelOutButton",new flywheelOutRun( m_flywheel ) );

final JoystickButton intakeInButton = new JoystickButton(controller, 2);        // Binding to 1 even though it is four on the controller
intakeInButton.whileHeld(new intakeInRun( m_intake ) ,true);
    SmartDashboard.putData("intakeInButton",new intakeInRun( m_intake ) );



    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
  }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
public XboxController getjoystick() {
        return controller;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
  */
  public Command getAutonomousCommand() {
    // The selected command will be run in autonomous
    return m_chooser.getSelected();
  }
  

}

