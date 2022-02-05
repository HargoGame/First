import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        String str = "Изучаем Java";

            try {
                FileOutputStream fileOutputStream = new FileOutputStream("10.6.HomeWork//src//test.txt");
                try {
                    fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            String str2 = " на сайте Skillfactory";
            FileWriter fr = null;

        try {
            fr = new FileWriter("10.6.HomeWork//src//test.txt", true);
            fr.write(str2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}