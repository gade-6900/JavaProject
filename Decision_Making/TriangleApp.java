import java.util.*;
public class TriangleApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side1: ");
        int side1 = sc.nextInt();
        System.out.print("Enter Side2: ");
        int side2 = sc.nextInt();
        System.out.print("Enter Side3: ");
        int side3 = sc.nextInt();

        // Check validity first
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {

            // Check type
            if (side1 == side2 && side2 == side3) {
                System.out.println("Triangle is Equilateral");
            } 
            else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("Triangle is Isosceles");
            } 
            else {
                System.out.println("Triangle is Scalene");
            }

        } else {
            System.out.println("Not a valid triangle!");
        }
    }
}
