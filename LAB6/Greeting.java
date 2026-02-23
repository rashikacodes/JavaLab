public interface Greeting {
    void sayHello();
}

class TestGreeting {

    public static void main(String args[]) {

        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello! Welcome to Java Anonymous Inner Class.");
            }
        };

        g.sayHello();
    }
}
 {
    
}
