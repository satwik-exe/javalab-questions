package Lab6;

import java.util.Scanner;
class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours, minutes, seconds;

    // Method to take input and validate time
    public void setTime(int h, int m, int s) throws HrsException, MinException, SecException {
        if (h < 0 || h > 24) {
            throw new HrsException("InvalidHourException: Hour must be between 0 and 24");
        }
        if (m < 0 || m >= 60) {
            throw new MinException("InvalidMinuteException: Minutes must be between 0 and 59");
        }
        if (s < 0 || s >= 60) {
            throw new SecException("InvalidSecondException: Seconds must be between 0 and 59");
        }
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }
}

public class lab6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int h = sc.nextInt();

        System.out.print("Enter minutes: ");
        int m = sc.nextInt();

        System.out.print("Enter seconds: ");
        int s = sc.nextInt();

        Time time = new Time();

        try {
            time.setTime(h, m, s);
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getMessage());
        }

    }
}
