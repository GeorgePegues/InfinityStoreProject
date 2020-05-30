package commanddesignpattern;

public class JumpCommand {
	
	Robot robot;
	
	public JumpCommand(Robot robot)
	{
		this.robot = Robot;
	}
	
	public void execute()
	{
		robot.jump();
	}

}
