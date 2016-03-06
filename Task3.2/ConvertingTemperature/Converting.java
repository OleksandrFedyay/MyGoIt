import java.io.PrintStream;

/**
 * Created by FedYAY on 06.03.2016.
 */
public class Converting {

    public void convertToFahrenheit (int degreeCelsius){

        int degreeFahrenheit = (degreeCelsius * 9 / 5) + 32;

        System.out.printf ("%d degrees Celsius is %d degrees Fahrenheit\n", degreeCelsius, degreeFahrenheit);
    }

    public void convertToCelsius (int degreeFahrenheit){

        int degreeCelsius =(degreeFahrenheit - 32) * 5 /9;

        System.out.printf("%d degree Fahrenheit is %d degree Celsius\n", degreeFahrenheit, degreeCelsius);
    }
}
