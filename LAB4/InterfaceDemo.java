
interface Motor {
    int capacity = 5; // public static final by default

    void run();
    void consume();
}


class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing machine is running");
    }

    public void consume() {
        System.out.println("Washing machine is consuming power");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();

        // Checking interface data member
        System.out.println("Capacity of the motor is " + wm.capacity);
    }
}
