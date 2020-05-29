package commanddesignpattern;

import java.util.HashMap;

/**
 *
 * @author Jadon T Schuler
 */
public class InputHandler {
    private HashMap<String, Command> commands;

    public InputHandler(Robot robot) {

    }

    public void inputEntered(String command) {
        commands.get(command).execute();
    }
}
