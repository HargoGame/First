import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception  {

        InputStream ins = new FileInputStream("C:\\Users\\home\\IdeaProjects\\skillfactory\\Final\\src\\text.txt");
        Scanner obj = new Scanner(ins);
        while (obj.hasNextLine())
            System.out.println(obj.nextLine());





    }


}


