package day58_Exceptions_RunTimeError;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {
    public static void main(String[] args) throws Exception {
//        try {
            Files.readAllLines(Paths.get("filex.txt"));
//        }catch (IOException e){
//            System.out.println("Exception happened and caught!");
//        }
        System.out.println("After try catch");
    }

}
