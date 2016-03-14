
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

    static int[] array;
    static final int NUMBER_OF_ELEMENTS = 10;

    public static void main(String[] args) {

        array = new int[NUMBER_OF_ELEMENTS];
        Scanner input = new Scanner(System.in);

        for (int count = 0; count < array.length; count++) {
            System.out.println("Enter the value of element: ");
            array[count] = input.nextInt();
        }

        Arrays.sort(array);
        System.out.printf("\nThe array is sorted now\n");
        for (int value : array){
            System.out.println( value );
        }

        System.out.printf("\nThe minimum value is: %d\n\n", getMinimum());

        System.out.printf("The maximum value is: %d\n\n", getMaximum());
    }

    public static int getMinimum() {

        int lowerValue = array[0];

        for (int value : array)

            if (value < lowerValue)
                lowerValue = value;

        return lowerValue;
    }


    public static int getMaximum() {

        int highestValue = array[0];

        for (int value : array)

            if (value > highestValue)
                highestValue = value;

        return highestValue;
    }
}
