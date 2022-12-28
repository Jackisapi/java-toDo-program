import java.io.IOException;
import  java.util.Date;
import java.util.Scanner;
import java.io.FileWriter;
public class Main{
    // writes input to list
    static void listWrite(FileWriter doc)throws IOException {
        Scanner toDo = new Scanner(System.in);
        System.out.println("Enter what you have to do today or enter java:exit to exit java:read to read your list or anything input to write to list");
        String toDos = toDo.nextLine();

        if (toDos.equals("java:exit")) {
            System.exit(0);
        }
        else {
            doc.append(toDos + "\n");
        }
    }
        public static void main (String[] args)throws IOException{
            while (true) {
                FileWriter list = new FileWriter("list.txt",true);
                Date today = new Date();
                System.out.println("Hello todays date is " + today);
                listWrite(list);
                list.flush();
                list.close();
            }

        }
}