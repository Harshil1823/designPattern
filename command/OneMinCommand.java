package command;

/**
 * The OneMinCommand class is responsible for decrementing the StopWatch by one minute when executed.
 */
public class OneMinCommand implements Command {

    /**
     * The watch instance variable is the StopWatch that the command will operate on.
     */
    private StopWatch watch;

    /**
     * The OneMinCommand constructor initializes the watch instance variable.
     *
     * @param watch The StopWatch object that the command will operate on.
     */
    public OneMinCommand(StopWatch watch) {
        this.watch = watch;
    }

    /**
     * The execute method decrements the StopWatch by one minute.
     */
    public void execute() {
       watch.countDownOneMin();
    }
}

