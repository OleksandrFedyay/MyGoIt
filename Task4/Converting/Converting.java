import java.io.PrintStream;

public class Converting {
    double degreeFahrenheit;
    double degreeCelsius;
    final double firstConstant = 32.0;
    final double secondConstant = 9.0;
    final double thirdConstant= 5.0;

    public Converting(double degreeFahrenheit, double degreeCelsius) {
        this.degreeFahrenheit = degreeFahrenheit;
        this.degreeCelsius = degreeCelsius;
    }

    public PrintStream convertToFahrenheit (double degreeCelsius){

         degreeFahrenheit = (degreeCelsius * secondConstant /thirdConstant) + firstConstant;

        return System.out.printf ("%.2f degrees Celsius is %.2f degrees Fahrenheit\n", degreeCelsius, degreeFahrenheit);
    }


    public PrintStream convertToCelsius(double degreeFahrenheit){

        degreeCelsius =(degreeFahrenheit - firstConstant ) * thirdConstant/secondConstant;

        return System.out.printf("%.2f degree Fahrenheit is %.2f degree Celsius\n",degreeFahrenheit, degreeCelsius);
    }

}
