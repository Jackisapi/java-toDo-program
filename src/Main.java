import java.io.IOException;
import  java.util.Date;
import java.util.Scanner;
import java.io.FileWriter;
public class Main{
    // writes input to list
        public static void main (String[] args)throws IOException{
            while (true) {
                // creates the file and sets appending to ture
                FileWriter list = new FileWriter("list.txt",true);
                //fetches the date
                Date today = new Date();
                //prints
                System.out.println("Hello todays date is " + today);
                // calls the function on line 7 NOTE soon to be moved to a class
                listFun.listWrite(list);
                //closes file
                list.flush();
                list.close();
            }

        }
}