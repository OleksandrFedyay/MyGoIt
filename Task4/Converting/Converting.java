import java.io.PrintStream;
import java.util.Scanner;

public class Converting {

    double degreeFahrenheit;
    double degreeCelsius;
    final double FIRST_CONSTANT = 32.0;
    final double SECOND_CONSTANT = 9.0;
    final double THIRD_CONSTANT = 5.0;
    Scanner input = new Scanner(System.in);

    public Converting(double degreeFahrenheit, double degreeCelsius) {

        this.degreeFahrenheit = degreeFahrenheit;
        this.degreeCelsius = degreeCelsius;
    }

    public PrintStream convertToFahrenheit (){

        System.out.println("Enter degree Celsius: ");

        degreeCelsius = input.nextDouble();

         degreeFahrenheit = (degreeCelsius * SECOND_CONSTANT /THIRD_CONSTANT) + FIRST_CONSTANT;

        return System.out.printf ("%.2f degrees Celsius is %.2f degrees Fahrenheit\n\n", degreeCelsius, degreeFahrenheit);
    }


    public PrintStream convertToCelsius(){

        System.out.println("Enter degree Fahrenheit: ");

        degreeFahrenheit = input.nextDouble();

        degreeCelsius =(degreeFahrenheit - FIRST_CONSTANT ) * THIRD_CONSTANT/SECOND_CONSTANT ;

        return System.out.printf("%.2f degree Fahrenheit is %.2f degree Celsius\n\n",degreeFahrenheit, degreeCelsius);
    }

}
