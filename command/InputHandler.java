package command;
import java.util.HashMap;

/**
 * The InputHandler class is reponsible for handling user input and executing corresponding commands
 * @author javdoc
 */
public class InputHandler {

    /**
     * The commands instance variable is a HashMap that maps input strings to corresponding commands.
     */
    private HashMap<String, Command> commands;

    /**
     * The InputHandler constructor initializes the commands HashMap with default values.
     *
     * @param watch The StopWatch object that the commands will operate on.
     */
    public InputHandler(StopWatch watch) {
        commands = new HashMap<String, Command>();
        commands.put("1", new OneMinCommand(watch));
        commands.put("5", new FiveMinCommand(watch));
        commands.put("30", new ThirtySecCommand(watch));
    }

    /**
     * The inputEntered method takes in user input and executes the corresponding command if it exists.
     *
     * @param data The user input as a string.
     * @return Returns true if the input was recognized and the corresponding command was executed, false otherwise.
     */
    public boolean inputEntered(String data) {
        if (commands.containsKey(data)) {
            Command command = commands.get(data);
            command.execute();
            return true;
        } else {
            return false;
        }
    }
}