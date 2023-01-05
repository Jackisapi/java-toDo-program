import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class listFun {
    static void listWrite(FileWriter doc, String toDos)throws IOException {
        doc.append(toDos + "\n");
        }
        static void listRead(String fileName)throws IOException{
            FileReader readDoc = new FileReader(fileName);
            Scanner scanDoc = new Scanner(readDoc);
            while (scanDoc.hasNextLine()){
                String listItem = scanDoc.nextLine();
                System.out.println(listItem);
            }

        }
        static void fileWipe(String docWip)throws IOException{
            new FileWriter(docWip, false).close();
        }
    }

