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
        // exit command soon to be writen in different class
        if (toDos.equals("java:exit")) {
            System.exit(0);
        }
        else {
            doc.append(toDos + "\n");
        }
    }
        public static void main (String[] args)throws IOException{
            while (true) {
                // creates the file and sets appending to ture
                FileWriter list = new FileWriter("list.txt",true);
                //fetches the date
                Date today = new Date();
                //prints
                System.out.println("Hello todays date is " + today);
                // calls the function on line 7 NOTE soon to be moved to a class
                listWrite(list);
                //closes file
                list.flush();
                list.close();
            }

        }
}