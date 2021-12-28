import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        NewPC mynewPC = new NewPC(" AeroCool", 5000);
        Cpu newCPU = new Cpu("Intel",50000, "i9");
        GraphicsCard newGraphicsCard = new GraphicsCard("NVideo",200000, "3080");

        List<NewPC> assemblyPC = Arrays.asList(mynewPC, newCPU,newGraphicsCard);
        for (NewPC h : assemblyPC) {
            h.assemblyPC();
        }


}


}







