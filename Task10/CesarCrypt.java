
public class CesarCrypt {

    private final static int CHARS_IN_ALPHABET = 26;
    private final static int KEY = 4;
    private final static int ASCII_STARTING_INDEX_OF_UPPERCASE = 65;
    private final static int ASCII_STARTING_INDEX_OF_LOWERCASE = 97;
    private final static int ASCII_ENDING_INDEX_OF_UPPERCASE = 90;
    private final static int ASCII_ENDING_INDEX_OF_LOWERCASE = 122;
    private static char[] ascii = new char[256];

    private static void initializeASCII (){
        for (int count = 0; count < ascii.length; count++) {
            ascii[count] = (char) count;
        }
    }

    public static String toCodeString(char [] buffer) {

        initializeASCII();
        char[] originalChars = buffer;
        char[] codedChars = new char[originalChars.length];
        StringBuilder cipher = new StringBuilder();

        for (int count = 0; count < originalChars.length; count++) {

            for (int i = 0; i < CHARS_IN_ALPHABET; i++) {

                int cesarCryptAlgorithm = (i + KEY) % CHARS_IN_ALPHABET;

                if (originalChars[count] == ascii[ASCII_STARTING_INDEX_OF_UPPERCASE + i])
                    codedChars[count] = ascii[ASCII_STARTING_INDEX_OF_UPPERCASE + cesarCryptAlgorithm];

                if (originalChars[count] == ascii[ASCII_STARTING_INDEX_OF_LOWERCASE + i])
                    codedChars[count] = ascii[ASCII_STARTING_INDEX_OF_LOWERCASE + cesarCryptAlgorithm];
            }
        }

        for (int count = 0; count < originalChars.length; count++) {

            for(int i = 0; i < ascii.length; i++) {

                if ((originalChars[count] == ascii[i] && ascii[i] < ascii[ASCII_STARTING_INDEX_OF_UPPERCASE])
                        || (originalChars[count] == ascii[i] && ascii[i] > ascii[ASCII_ENDING_INDEX_OF_UPPERCASE] && ascii[i] < ascii[ASCII_STARTING_INDEX_OF_LOWERCASE])
                        || (originalChars[count] == ascii[i] && ascii[i] > ascii[ASCII_ENDING_INDEX_OF_LOWERCASE]))
                    codedChars[count] = ascii[i];
            }
        }

        for (char c : codedChars) {
            cipher.append(c);
        }
        String codedString = cipher.toString()
                .replace("[", "")
                .replace("]", "")
                .trim();
        return codedString;
    }


    public static String toUncodeString (char [] buffer){

        char[] codedChars = buffer;
        char[] uncodedChars = new char[codedChars.length];
        StringBuilder unCipher = new StringBuilder();

        for (int count = 0; count < codedChars.length; count++) {

            for (int i = 0; i < CHARS_IN_ALPHABET; i++) {

                int cesarDecryptAlgorithm = (i - KEY + CHARS_IN_ALPHABET) % CHARS_IN_ALPHABET;

                if (codedChars[count] == ascii[ASCII_STARTING_INDEX_OF_UPPERCASE + i])
                    uncodedChars[count] = ascii[ASCII_STARTING_INDEX_OF_UPPERCASE + cesarDecryptAlgorithm];

                if (codedChars[count] == ascii[ASCII_STARTING_INDEX_OF_LOWERCASE + i])
                    uncodedChars[count] = ascii[ASCII_STARTING_INDEX_OF_LOWERCASE + cesarDecryptAlgorithm];
            }
        }

        for (int count = 0; count < codedChars.length; count++) {

            for(int i = 0; i < ascii.length; i++) {

                if ((codedChars[count] == ascii[i] && ascii[i] < ascii[ASCII_STARTING_INDEX_OF_UPPERCASE])
                        || (codedChars[count] == ascii[i] && ascii[i] > ascii[ASCII_ENDING_INDEX_OF_UPPERCASE] && ascii[i] < ascii[ASCII_STARTING_INDEX_OF_LOWERCASE])
                        || (codedChars[count] == ascii[i] && ascii[i] > ascii[ASCII_ENDING_INDEX_OF_LOWERCASE]))
                    uncodedChars[count] = ascii[i];
            }
        }
        for (char c : uncodedChars) {
            unCipher.append(c);
        }
        String uncodedString = unCipher.toString()
                .replace("[", "")
                .replace("]", "")
                .trim();
        return uncodedString;
    }
}

