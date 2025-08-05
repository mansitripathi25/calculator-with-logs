package util;
import java.io.FileWriter;
import java.io.IOException;

public class fileLogger {
    private static final String FILE_NAME = "data.txt";
    public static void write(String data){
        try(FileWriter writer = new FileWriter(FILE_NAME,true)){
            writer.write(data + "\n");
        } catch (IOException e){
            System.out.println("File Error:" + e.getMessage());
        }
    }
}