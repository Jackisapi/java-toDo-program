import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class listFun {
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
}
