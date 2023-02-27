package command;

/**
 * The ThirtySecCommand class is responsible for setting the StopWatch countdown time to thirty seconds and executing it.
 */
public class ThirtySecCommand implements Command {

    /**
     * The watch instance variable is the StopWatch that the command will operate on.
     */
    private StopWatch watch;

    /**
     * The ThirtySecCommand constructor initializes the watch instance variable.
     *
     * @param watch The StopWatch object that the command will operate on.
     */
    public ThirtySecCommand(StopWatch watch) {
        this.watch = watch;
    }

    /**
     * The execute method sets the StopWatch countdown time to thirty seconds and executes it.
     */
    public void execute() {
        watch.countDownThirtySec();
    }
}

