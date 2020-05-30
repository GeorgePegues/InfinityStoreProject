package commanddesignpattern;
/**
 * this class is responsible for the Pickup Command it allows for the robot to pick things up
 * @author natiyaashmon
 */
public class PickupCommand implements Command {
	private Robot robot;
	/**
	 * this is the pick up command it tells the robot to pick up an item
	 * @param robot the robot
	 */
	public PickupCommand (Robot robot) {
		this.robot = robot;
	}
	/**
	 * this method executes the command
	 */
	public void execute () {
		robot.pickup();


	}


}
