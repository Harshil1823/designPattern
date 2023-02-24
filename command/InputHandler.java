package command;
import java.util.HashMap;

public class InputHandler{
    private HashMap<String, Command> commands;

    public InputHandler(StopWatch watch) {
        commands = new HashMap<String, Command>();
        commands.put("1", new OneMinCommand(watch));
        commands.put("5", new FiveMinCommand(watch));
        commands.put("30", new ThirtySecCommand(watch));
    }
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