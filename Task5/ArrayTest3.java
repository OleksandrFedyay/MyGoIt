import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest3 {

    static int[] array;
    static final int NUMBER_OF_ELEMENTS = 3;
    static final int SHIFTING_VALUE_OF_COUNTER = 1;

    public static void main(String[] args) {

        array = new int[NUMBER_OF_ELEMENTS];
        final int LAST_INDEX = array.length - 1;
        int lowerValue;
        int highestValue;
        Scanner input = new Scanner(System.in);

        for (int count = 0; count < array.length; count++) {

            System.out.println("Enter the value of element: ");
            array[count] = input.nextInt();

            if (NUMBER_OF_ELEMENTS == count+ SHIFTING_VALUE_OF_COUNTER) {

                Arrays.sort(array);
                for (int value : array)
                    System.out.printf("\n%d", value);

                lowerValue = array[0];
                highestValue = array[LAST_INDEX];
                System.out.printf("\n\n%d is max, %d is min", highestValue, lowerValue);
            }
        }
    }
}
