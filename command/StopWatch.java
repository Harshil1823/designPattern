package command;

import java.util.concurrent.TimeUnit;

/**
 * The StopWatch class is responsible for counting down the time and displaying it on the console.
 * It also contains methods for setting the countdown time to one minute, five minutes, or thirty seconds.
 * @author javadoc
 */
public class StopWatch {
    private int minutes;
    private int seconds;

    /**
     * The StopWatch constructor initializes the minutes and seconds variables to zero.
     */
    public StopWatch() {
        minutes = 0;
        seconds = 0;
    }

    /**
     * The countDownOneMin method sets the countdown time to one minute and calls the countDown method.
     */
    public void countDownOneMin() {
        minutes = 1;
        seconds = 0;
        countDown();
    }

    /**
     * The countDownFiveMin method sets the countdown time to five minutes and calls the countDown method.
     */
    public void countDownFiveMin() {
        minutes = 5;
        seconds = 0;
        countDown();
    }

    /**
     * The countDownThirtySec method sets the countdown time to thirty seconds and calls the countDown method.
     */
    public void countDownThirtySec() {
        minutes = 0;
        seconds = 30;
        countDown();
    }

    /**
     * The countDown method decrements the countdown time and displays it on the console until it reaches zero.
     * It uses a try-catch block to handle interruptions from sleeping threads.
     */
    public void countDown() {
        try {
            while (minutes > 0 || seconds > 0) {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.printf("%02d:%02d%n", minutes, seconds);
                TimeUnit.MILLISECONDS.sleep(100);

                if (seconds == 0) {
                    if (minutes == 0) {
                        break;
                    }
                    seconds = 59;
                    minutes--;
                } else {
                    seconds--;
                }
            }
            // Printing final time (00:00)
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.printf("%02d:%02d%n", minutes, seconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

