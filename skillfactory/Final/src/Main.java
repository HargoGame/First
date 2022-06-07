import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception  {

        InputStream ins = new FileInputStream("C:\\Users\\home\\IdeaProjects\\skillfactory\\Final\\src\\text.txt");
        Scanner obj = new Scanner(ins);
        while (obj.hasNextLine())
            System.out.println(obj.nextLine());


        ArrayList<Employee> list = new ArrayList<>();
        Employee employee = new Employee("Иванов Иван Иваныч", 1988, 2021);
        list.add(employee);

        Employee employee1 = new Manager("Иванова Ива Ивановна", 1999, 2022, "Иванов");
        list.add(employee1);




    }


}


