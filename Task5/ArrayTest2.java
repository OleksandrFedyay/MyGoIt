import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest2 {

    static int[] array;
    static final int NUMBER_OF_ELEMENTS = 3;
    static final int SHIFTING_VALUE_OF_COUNTER = 1;

    public static void main(String[] args) {

        array = new int[NUMBER_OF_ELEMENTS];
        Scanner input = new Scanner(System.in);
        int lowerValue = 0;
        int highestValue = 0;

        for (int count = 0; count < array.length; count++) {

            System.out.println("Enter the value of element: ");
            array[count] = input.nextInt();

            if (NUMBER_OF_ELEMENTS == count+ SHIFTING_VALUE_OF_COUNTER) {

                Arrays.sort(array);

                lowerValue = array[0];

                highestValue = array[0];

                for (int value : array) {

                    System.out.printf("\n%d", value);

                    if (value < lowerValue) {

                        lowerValue = value;
                    }
                    if (value > highestValue) {

                        highestValue = value;
                    }
                }
            }
        }
        System.out.printf("\n\n%d is max, %d is min", highestValue, lowerValue);
    }
}