package commanddesignpattern;

import java.util.HashMap;

/**
 * Creates the HashMap for storing commands, and handles calling them
 * @author Jadon T Schuler
 */
public class InputHandler {
    private HashMap<String, Command> commands;

    /**
     * Initializes the HashMap with commands
     * @param robot The robot that will execute the commands
     */
    public InputHandler(Robot robot) {
        commands = new HashMap<String, Command>();
        commands.put("pickup", new PickupCommand(robot));
        commands.put("jump", new JumpCommand(robot));
        commands.put("fire", new FireCommand(robot));
        commands.put("heal", new HealCommand(robot));
    }

    /**
     * Finds the requested command, then executes it
     * @param command the key that refers to its command
     */
    public void inputEntered(String command) {
        commands.get(command).execute();
    }
}
