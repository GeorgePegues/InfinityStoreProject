package commanddesignpattern;

public class JumpCommand implements Command {
	
	Robot robot;
	
	public JumpCommand(Robot robot)
	{
		this.robot = robot;
	}
	
	public void execute()
	{
		robot.jump();
	}

}
