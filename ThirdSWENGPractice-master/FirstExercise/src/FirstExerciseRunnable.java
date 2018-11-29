import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class FirstExerciseRunnable {

    public static void main(String[] args) {



        /*
        Creates a list of names
         */
        List<String> namesList = new Vector<>();

        ((Vector<String>) namesList).addElement("cica");
        ((Vector<String>) namesList).addElement("kutya");
        ((Vector<String>) namesList).addElement("majom");
        ((Vector<String>) namesList).addElement("kecske");
        ((Vector<String>) namesList).addElement("delfin");

//        for (String name : namesList
//        ) {
//            System.out.println(name);
//        }


        /*
        Writes the list in an output fle.
         */
      writeInFile("output.txt", namesList);

        /*
        Solution 1
        Reads the contents of the file in a character array
         */

        char[] text= new char[20];
        try {
            FileReader fileReader= new FileReader(new File("output.txt"));

           fileReader.read(text);
            for (char c: text
                 ) {
                System.out.println(c);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }


        /*
        Reads the contents of the file in a buffered reader that is able to read lines.
        The lines are used to create a  collection of strings
         */

        Vector<String> inputCollection= new Vector<>();
        try {
            FileReader fileReader = new FileReader(new File("output.txt"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line= bufferedReader.readLine();
            while (line != null) {
                inputCollection.add(line);
                line=bufferedReader.readLine();
            }
            for (String string : inputCollection
                 ) {
                System.out.println(string);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        /*
        Modifies the contents and updates the file
         */
//        inputCollection.addElement("Kacsa");
//        inputCollection.remove("kutya");


//      writeInFile("output.txt", inputCollection);


    }

    private static void writeInFile(String fileName,Collection<String> inputCollection){

        try {
            FileWriter output = new FileWriter(new File(fileName));

            for (String name : inputCollection
            ) {
                output.write(name + "\n");
            }
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
