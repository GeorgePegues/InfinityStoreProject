package decoratordesignpattern;

public class JumpCommand {
	
	Robot robot;
	
	public JumpCommand(Robot robot)
	{
		this.robot = Robot;
	}
	
	public void execute()
	{
		if(key.equalsIgnoreCase("jump"))
		{
		System.out.println("Oh no a hazard, I'm jumping over it.");
		}
	}

}
