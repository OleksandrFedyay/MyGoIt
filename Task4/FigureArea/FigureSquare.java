
public class FigureSquare {
    double sideA, sideB, sideC, radius;

    public void triangleArea(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        double a = 2.0;
        double semiTriangleArea = (sideA + sideB + sideC) / a;
        double triangleArea =  Math.sqrt(semiTriangleArea * (semiTriangleArea - sideA) * (semiTriangleArea - sideB)
                * (semiTriangleArea - sideC));

        System.out.printf("The Square of the triangle with sides: %.2f, %.2f, %.2f is %.2f\n", sideA, sideB,
                sideC, triangleArea);
    }

    public void rectangleArea (double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
        double rectangleArea = sideA * sideB;

        System.out.printf("The Square of the rectangle with sides: %.2f, %.2f is %.2f\n", sideA, sideB, rectangleArea);
    }

    public void circleArea(double radius){
        this.radius = radius;
        double circleArea = Math.PI * Math.pow(radius,2);

        System.out.printf("The area of circle with radius %.2f is %.2f\n", radius, circleArea);
    }

}

