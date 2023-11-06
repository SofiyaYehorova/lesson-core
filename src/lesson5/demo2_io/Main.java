package lesson5.demo2_io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
//    @SneakyThrows
    public static void main(String[] args) {
//        InputStream
//        OutputStream
        String userHome = System.getProperty("user.home");
//        System.out.println(userHome);
        File textTxt = new File(userHome + File.separator + "test" + File.separator + "text.txt");
        File textTxt1 = new File(userHome + File.separator + "test",  "text.txt");
        try
//                (FileOutputStream fos = new FileOutputStream(textTxt)) /*перепише дані*/
                (FileOutputStream fos = new FileOutputStream(textTxt, true)) /*допише дані*/{
           fos.write("test string from our app\n".getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        readFromFile();
    }

    private static void readFromFile(){
        String userHome = System.getProperty("user.home");
        File textTxt1 = new File(userHome + File.separator + "test",  "text.txt");
        try (FileInputStream fis=new FileInputStream(textTxt1)){
            byte[] data = new byte[fis.available()];
            fis.read(data);
            String dataString = new String(data, StandardCharsets.UTF_8);
            System.out.println(dataString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
