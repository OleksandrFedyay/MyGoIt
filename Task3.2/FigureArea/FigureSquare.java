/**
 * Created by FedYAY on 06.03.2016.
 */
public class FigureSquare {



    public void triangleArea(double sideA, double sideB, double sideC){

        double semiTriangleArea = (sideA + sideB + sideC) / 2;

        double triangleArea =  Math.sqrt(semiTriangleArea * (semiTriangleArea - sideA) * (semiTriangleArea - sideB)
                * (semiTriangleArea - sideC));

        System.out.printf("The Square of the triangle with sides: %.2f, %.2f, %.2f is %.2f\n", sideA, sideB,
                sideC, triangleArea);
    }

    public void rectangleArea (double sideA, double sideB){

        double rectangleArea = sideA * sideB;

        System.out.printf("The Square of the rectangle with sides: %.2f, %.2f is %.2f\n", sideA, sideB, rectangleArea);
    }

    public void circleArea(double radius){

       double circleArea = Math.PI * Math.pow(radius,2);

        System.out.printf("The area of circle with radius %.2f is %.2f\n", radius, circleArea);
    }

}

