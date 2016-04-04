import java.io.*;

public class ReadWrite {

    public static void main(String[] args){

        File original = new File("Summer.txt");
        char [] buffer = new char[(int)original.length()];

        try {
            FileReader reader = new FileReader(original);
            reader.read(buffer);
            reader.close();

            String codedText = CesarCrypt.toCodeString(buffer);

            FileWriter writer = new FileWriter("Summer2.txt");
            writer.write(codedText);
            writer.close();
            }
        catch (EOFException e) {
            System.out.println("Reached end of file.");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            }


        try {
            FileReader reader = new FileReader("Summer2.txt");
            reader.read(buffer);
            reader.close();

            String uncodedText = CesarCrypt.toUncodeString(buffer);

            FileWriter writer = new FileWriter("Summer3.txt");
            writer.write(uncodedText);
            writer.close();
        }
        catch (EOFException e) {
            System.out.println("Reached end of file.");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

