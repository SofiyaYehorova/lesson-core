package lesson5.demo3_nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       readFromFile();
       writeToFile(" hello from me!\n");
       readFromFile();
    }
    public static void writeToFile(String text){
        String userHome = System.getProperty("user.home");
        Path path = Paths.get(userHome + File.separator + "test" + File.separator + "text1.txt");

        try {
            Files.write(path, Collections.singletonList(text + "\n"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("write to file");
    }

    public static void readFromFile(){
        String userHome = System.getProperty("user.home");
        Path path = Paths.get(userHome + File.separator + "test" + File.separator + "text1.txt");

        try {
            List<String> lines = Files.readAllLines(path);
//            System.out.println(lines); /*[lorem input]*/
            System.out.println(String.join("\n", lines)); /*lorem input*/
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Read from file");
    }
}
