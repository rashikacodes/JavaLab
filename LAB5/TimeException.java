import java.util.Scanner;

// User Defined Exception for Invalid Hour
class HrsException extends Exception {
    public HrsException(String msg) {
        super(msg);
    }
}

// User Defined Exception for Invalid Minute
class MinException extends Exception {
    public MinException(String msg) {
        super(msg);
    }
}

// User Defined Exception for Invalid Second
class SecException extends Exception {
    public SecException(String msg) {
        super(msg);
    }
}

// Time Class
class Time {
    int hours, minutes, seconds;

    // Method to take time from user
    void getTime() throws HrsException, MinException, SecException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        hours = sc.nextInt();
        if (hours < 0 || hours > 24) {
            throw new HrsException("hour is not greater than 24");
        }

        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();
        if (minutes < 0 || minutes > 60) {
            throw new MinException("minute is not greater than 60");
        }

        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();
        if (seconds < 0 || seconds > 60) {
            throw new SecException("second is not greater than 60");
        }

        // If everything is valid
        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }
}

// Main Class
public class TimeException {
    public static void main(String[] args) {

        Time t = new Time();

        try {
            t.getTime();
        }
        catch (HrsException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidHourException:" + e.getMessage());
        }
        catch (MinException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidMinuteException:" + e.getMessage());
        }
        catch (SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidSecondException:" + e.getMessage());
        }
    }
}
