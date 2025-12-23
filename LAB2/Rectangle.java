import java.util.Scanner;

class Rectangle {
    double length, breadth;
    double area, perimeter;
  void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }
       void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }
        void display() {
        System.out.println("Area of rectangle = " + area);
        System.out.println("Perimeter of rectangle = " + perimeter);
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read();
        r.calculate();
        r.display();
    }
}
