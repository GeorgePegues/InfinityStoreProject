package commanddesignpattern;

public class FireCommand {
	Robot robot;
	
	public FireCommand(Robot robot)
	{
		this.robot = Robot;
	}
	
	public void execute()
	{
		robot.fire();
	}


}
