public class NoOfObjects {
static int count = 0;
    NoOfObjects() {
        count++;
    }
    public static void main(String[] args) {
        NoOfObjects obj1 = new NoOfObjects();
        NoOfObjects obj2 = new NoOfObjects();
        NoOfObjects obj3 = new NoOfObjects();
        System.out.println("Number of objects created: " + count);
    }
}
