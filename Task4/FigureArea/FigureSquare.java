import java.io.PrintStream;
import java.util.Scanner;

public class FigureSquare {

    private String figureName;
    private double sideA, sideB, sideC, radius;
    final double NOT_ALLOWED = 0.0;
    Scanner input = new Scanner (System.in);

    public FigureSquare(String figureName, double sideA, double sideB, double sideC, double radius) {

        this.figureName = figureName;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.radius = radius;
    }
    public void displayMessage (){
        System.out.printf("This is %s\n", figureName);
    }

    public PrintStream triangleArea(){

        double triangleArea;
        double semiTriangleArea;
        final double SEMI_TRIANGLE_AREA_CONSTANT = 2.0;

        for (int sideCounter = 1; sideCounter <=3; sideCounter++){

            System.out.println("Enter the size of the Triangle's side:");

            switch (sideCounter){

                case 1: sideA = input.nextDouble();
                    if (sideA <= 0)
                        return System.out.printf("Triangle can not have size of its side equal to %.2f or less then %.2f\n\n", NOT_ALLOWED, NOT_ALLOWED);
                    break;
                case 2: sideB = input.nextDouble();
                    if (sideB <= 0)
                        return System.out.printf("Triangle can not have size of its side equal to %.2f or less then %.2f\n\n", NOT_ALLOWED, NOT_ALLOWED);
                    break;
                case 3: sideC = input.nextDouble();
                    if (sideC <= 0)
                        return System.out.printf("Triangle can not have size of its side equal to %.2f or less then %.2f\n\n", NOT_ALLOWED, NOT_ALLOWED);
                    break;
            }

        }

            semiTriangleArea = (sideA + sideB + sideC) / SEMI_TRIANGLE_AREA_CONSTANT;

            triangleArea = Math.sqrt(semiTriangleArea * (semiTriangleArea - sideA) * (semiTriangleArea - sideB)
                    * (semiTriangleArea - sideC));

            return
                    System.out.printf("The Area of the triangle with sides: %.2f, %.2f, %.2f is %.2f\n\n", sideA, sideB,
                            sideC, triangleArea);
        }

    public PrintStream rectangleArea () {

        double rectangleArea;

        for (int sideCounter = 1; sideCounter <= 2; sideCounter++) {

            System.out.println("Enter the size of the Rectangle's side:");

            switch (sideCounter) {
                case 1:
                    sideA = input.nextDouble();
                    if (sideA <= 0)
                        return System.out.printf("Rectangle can not have size of its side equal to %.2f or less then %.2f\n\n", NOT_ALLOWED, NOT_ALLOWED);
                    break;
                case 2:
                    sideB = input.nextDouble();
                    if (sideB <= 0)
                        return System.out.printf("Rectangle can not have size of its side equal to %.2f or less then %.2f\n\n", NOT_ALLOWED, NOT_ALLOWED);
                    break;
            }
        }
            rectangleArea = sideA * sideB;

            return
                    System.out.printf("The Area of the Rectangle with sides: %.2f, %.2f is %.2f\n\n", sideA, sideB, rectangleArea);
        }



    public PrintStream circleArea(){

        double circleArea;
        int radiusCounter = 1;

        while (radiusCounter == 1){

            System.out.println("Enter the size of the Circle radius:");

            radius = input.nextDouble();

            ++radiusCounter;

            input.close();
        }

        if (radius <= NOT_ALLOWED)

            return System.out.printf("The Circle can not have the size of its radius equal to %.2f or less then %.2f\n\n", NOT_ALLOWED, NOT_ALLOWED);

        else

        circleArea = Math.PI * Math.pow(radius,2);

        return System.out.printf("The area of circle with radius %.2f is %.2f\n\n", radius, circleArea);
    }

}

