package commanddesignpattern;

/**
 * The heal command for the robot
 * @author William Zhang
 */
public class HealCommand implements Command {

    private Robot robot;
    
    public HealCommand(Robot robot) {
        this.robot = robot;
    }

    /**
     * Execute the command
     */
    public void execute() {
        robot.heal();
    }
}
