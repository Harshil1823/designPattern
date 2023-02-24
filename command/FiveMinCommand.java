package command;

/**
 * Represents the five minute command.
 * @author javadoc
 */
public class FiveMinCommand implements Command {
    private StopWatch watch;

    /**
     * Sets this watch to the inputted time.
     * @param watch Type StopWatch used to display time.
     */
    public FiveMinCommand(StopWatch watch) {
        this.watch = watch;
    }
    /**
     * Calls the watch to count down from 5 minutes to 0.
     */
    @Override
    public void execute(){
        watch.countDownFiveMin();
    }
}
