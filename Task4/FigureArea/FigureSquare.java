import java.io.PrintStream;

public class FigureSquare {
    double sideA, sideB, sideC, radius;

    public FigureSquare(double sideA, double sideB, double sideC, double radius) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.radius = radius;
    }

    public PrintStream triangleArea(){

        final double semiTriangleAreaConstant = 2.0;
        double semiTriangleArea = (sideA + sideB + sideC) / semiTriangleAreaConstant;
        double triangleArea =  Math.sqrt(semiTriangleArea * (semiTriangleArea - sideA) * (semiTriangleArea - sideB)
                * (semiTriangleArea - sideC));

        return
        System.out.printf("The Square of the triangle with sides: %.2f, %.2f, %.2f is %.2f\n", sideA, sideB,
                sideC, triangleArea);
    }

    public PrintStream rectangleArea (){

        double rectangleArea = sideA * sideB;

        return
        System.out.printf("The Square of the rectangle with sides: %.2f, %.2f is %.2f\n", sideA, sideB, rectangleArea);
    }


    public PrintStream circleArea(){

        double circleArea = Math.PI * Math.pow(radius,2);

        return System.out.printf("The area of circle with radius %.2f is %.2f\n", radius, circleArea);
    }

}

