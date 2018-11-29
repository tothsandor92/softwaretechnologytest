import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecondExerciseRunnable {

    public static void main(String[] args) {


        Map<String, String> dictionaryMap=getDictionaryMap("dictionary.txt");

        System.out.println(dictionaryMap.keySet());
        System.out.println(dictionaryMap.values());

        dictionaryMap.put("Majom","Monkey");
        writeInFile("dictionary.txt",dictionaryMap );


    }

    public static Map<String, String> getDictionaryMap(String file){
        Map<String, String> dictionaryMap= new HashMap<>();
        try {
            FileReader fileReader = new FileReader(new File(file));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line= bufferedReader.readLine();

            while (line != null) {
                String[] stringArray= line.split("\\s+");
                String hunWord=stringArray[0];
                String engWord=stringArray[1];
                dictionaryMap.put(hunWord, engWord);
                line= bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return dictionaryMap;
    }

    private static void writeInFile(String fileName, Map<String, String> inputMap){

        try {
            FileWriter output = new FileWriter(new File(fileName));

            for (Map.Entry<String, String> entry: inputMap.entrySet()
                 ) {
                output.write(entry.getKey()+ " "+ entry.getValue()+"\n");
            }

            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
