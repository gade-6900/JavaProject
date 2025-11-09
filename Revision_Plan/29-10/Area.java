
import java.util.Scanner;

class Area{
    Area(float  radius){
        double CircleArea = 3.14 * radius*radius;
        System.out.println("Area of circle: " + CircleArea);

    }
    Area(int len, int width){
        int rectArea = len * width;
        System.out.println("Area of rectangle: " + rectArea);
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Eneter radius of circle: ");
            float r = sc.nextFloat();
            Area c = new Area(r);

            System.out.print("Enter the length and width of rectangle: ");
            int l = sc.nextInt();
            int w = sc.nextInt();
            Area R = new Area(l,w);

        }
    }
    