import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Runnable {

    public static void main (String[] args){


        Vector<String> namesList= new Vector<>();
        namesList.addElement("cica");
        namesList.addElement("kutya");
        namesList.addElement("majom");
        namesList.addElement("kecske");
        namesList.addElement("delfin");
        namesList.addElement("zebra");


        System.out.println(namesList);

        writeInFile(namesList);
    //  readFromFile("output.txt");
      namesList=readFromFileBuffered("output.txt");
        System.out.println(namesList);

        namesList.addElement("eger");
        namesList.remove("kutya");
        writeInFile(namesList);
        System.out.println(namesList);



    }


    private static void writeInFile(Collection<String> namesList){

        File outputFile = new File("output.txt");
        try {
            FileWriter fileWriter= new FileWriter(outputFile);

            for (String name : namesList
                 ) {
                fileWriter.write(name+"\n");
            }
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static void readFromFile(String fileName){

    char[] text= new char[40];

        FileReader fileReader= null;
        try {
            fileReader = new FileReader(new File(fileName));
            fileReader.read(text);


            for (char c: text
                 ) {
                System.out.println(c);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }


    }


    private static Vector<String> readFromFileBuffered(String fileName){

Vector<String> inputCollection= new Vector<>();

        try {
            BufferedReader reader=new BufferedReader(new FileReader(new File(fileName)));
            String line= reader.readLine();
            while (line!=null){
                inputCollection.addElement(line);
                line=reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputCollection;

    }



}
