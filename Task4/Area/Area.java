import java.io.PrintStream;
import java.util.Scanner;

public class Area {

    private String figureName;
    private double sideA, sideB, sideC, radius;
    final double NOT_ALLOWED = 0.0;
    Scanner input = new Scanner(System.in);

    public Area(String figureName, double sideA, double sideB, double sideC, double radius) {

        this.figureName = figureName;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.radius = radius;
    }

    public void displayMessage() {
        System.out.printf("This is %s\n\n", figureName);
    }

    public PrintStream triangleArea() {

        double triangleArea;
        double semiTriangleArea;
        final double SEMI_TRIANGLE_AREA_CONSTANT = 2.0;

        System.out.println("Enter the size of the first side of triangle: ");
        sideA = input.nextDouble();

        System.out.println("Enter the size of the second side of triangle: ");
        sideB = input.nextDouble();

        System.out.println("Enter the size of the third side of triangle: ");
        sideC = input.nextDouble();


        if (sideA > 0 && sideB > 0 && sideC > 0) {

            semiTriangleArea = (sideA + sideB + sideC) / SEMI_TRIANGLE_AREA_CONSTANT;

            triangleArea = Math.sqrt(semiTriangleArea * (semiTriangleArea - sideA) * (semiTriangleArea - sideB)
                    * (semiTriangleArea - sideC));
            return
                    System.out.printf("The Area of the triangle with sides: %.2f, %.2f, %.2f is %.2f\n\n", sideA, sideB,
                            sideC, triangleArea);
        } else
            return System.out.printf("Triangle can not have size of its side equal to %.2f or less then %.2f\n\n",
                    NOT_ALLOWED, NOT_ALLOWED);
    }

    public PrintStream rectangleArea() {

        double rectangleArea;

        System.out.println("Enter the size of the first side of this rectangle: ");
        sideA = input.nextDouble();

        System.out.println("Enter the size of the second side of this rectangle: ");
        sideB = input.nextDouble();

        if (sideA > 0 && sideB > 0) {

            rectangleArea = sideA * sideB;

            return
                    System.out.printf("The Area of the Rectangle with sides: %.2f, %.2f is %.2f\n\n", sideA, sideB, rectangleArea);
        } else
            return System.out.printf("Rectangle can not have size of its side equal to %.2f or less then %.2f\n\n", NOT_ALLOWED, NOT_ALLOWED);

    }

    public PrintStream circleArea(){

        double circleArea;

        System.out.println("Enter the size of the circle radius: ");
        radius = input.nextDouble();

        if (radius > 0){
            circleArea = Math.PI * Math.pow(radius,2);

            return System.out.printf("The area of circle with radius %.2f is %.2f\n\n", radius, circleArea);
        }
        else
            return System.out.printf("The Circle can not have the size of its radius equal to %.2f or less then %.2f\n\n", NOT_ALLOWED, NOT_ALLOWED);
    }
}
