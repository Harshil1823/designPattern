package command;

import java.util.concurrent.TimeUnit;

public class StopWatch {
    private int minutes;
    private int seconds;

    public StopWatch() {
        minutes = 0;
        seconds = 0;
    }

    public void countDownOneMin() {
        minutes = 1;
        seconds = 0;
        countDown();
    }

    public void countDownFiveMin() {
        minutes = 5;
        seconds = 0;
        countDown();
    }

    public void countDownThirtySec() {
        minutes = 0;
        seconds = 30;
        countDown();
    }

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
