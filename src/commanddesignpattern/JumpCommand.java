package commanddesignpattern;
/**
 * this class is responsible to the Jump Command it allows for the robot to jump
 * @author natiyaashmon
 */
public class JumpCommand implements Command {
	private Robot robot;
	/**
	 * this is the jump command it tells the robot to jump
	 * @param robot the robot
	 */
	public JumpCommand (Robot robot) {
		this.robot = robot;
	}
	/**
	 * this method tells the robot to jump
	 */
	public void execute () {
		robot.jump();


	}


}
