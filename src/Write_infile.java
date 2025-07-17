import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Write_infile {
    public static void main(String[] args) {


        try {
            FileWriter myWriter = new FileWriter("FileName01new.txt");
            myWriter.write("File in java added");
            myWriter.close();
            System.out.println("successfully written");
        } catch (IOException e) {
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
