import java.util.Scanner;

class Plate {
    double length, width;

    Plate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width:");
        length = sc.nextDouble();
        width = sc.nextDouble();
        System.out.println("Plate constructor executed");
    }
}


class Box extends Plate {
    double height;

    Box() {
        super(); // calls Plate constructor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height:");
        height = sc.nextDouble();
        System.out.println("Box constructor executed");
    }
}


class WoodBox extends Box {
    double thick;

    WoodBox() {
        super(); // calls Box constructor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thickness:");
        thick = sc.nextDouble();
        System.out.println("WoodBox constructor executed");
    }

    void display() {
        System.out.println("\n--- Dimensions of WoodBox ---");
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Thickness = " + thick);
    }
}
public class MultilevelConstructor {
    public static void main(String[] args) {
        WoodBox wb = new WoodBox();  // object of most derived class
        wb.display();
    }
}
