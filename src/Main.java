import java.io.IOException;
import  java.util.Date;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    // writes input to list
    public static void main(String[] args) throws IOException {
        while (true) {
            // creates the file and sets appending to ture
            FileWriter list = new FileWriter("list.txt", true);
            Date today = new Date();
            System.out.println("Hello todays date is " + today);
            Scanner usrInput = new Scanner(System.in);
            String strInput = usrInput.nextLine();
            if (strInput.equals("java:exit")) {
                System.exit(1);
            } else if (strInput.equals("java:read")) {
                listFun.listRead("list.txt");
            } else {
                // calls the function on line 7 NOTE soon to be moved to a class
                listFun.listWrite(list,strInput);
                //closes file
                list.flush();
                list.close();
            }

        }
    }
}