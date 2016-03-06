import java.io.PrintStream;

/**
 * Created by FedYAY on 06.03.2016.
 */
public class Converting {
    int degreeFahrenheit;
    int degreeCelsius;
    final int a = 32;
    final int b = 9;
    final int c = 5;

    public void convertToFahrenheit (int degreeCelsius){
        this.degreeCelsius = degreeCelsius;
        int degreeFahrenheit = (degreeCelsius * b/c) + a;

        System.out.printf ("%d degrees Celsius is %d degrees Fahrenheit\n", degreeCelsius, degreeFahrenheit);
    }

    public void convertToCelsius (int degreeFahrenheit){
        this.degreeFahrenheit = degreeFahrenheit;
        int degreeCelsius =(degreeFahrenheit - a) * c/b;

        System.out.printf("%d degree Fahrenheit is %d degree Celsius\n", degreeFahrenheit, degreeCelsius);
    }
}
