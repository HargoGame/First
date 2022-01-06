public class NewPC implements OnOff{
    Object[] objects;
    protected int price;
    protected String name;

    public NewPC(String name, int price) {
        this.name = name;
        this.price = price;
}
    public NewPC(){
        objects = new Object[3];
        objects[0] = new NewPC(" AeroCool", 5000);
        objects[1] = new Cpu("Intel",50000, "i9");
        objects[2] = new GraphicsCard("NVideo",200000, "3080");
    }

    public void print(){
        for (Object a: objects){
            System.out.println(a);
        }
    }

    @Override
    public String toString(){
        return "Корпус, производитель " + name + " , цена " + price + " ." + "Достаем из коробки и открываем.";
    }

    @Override
    public void on() {
        System.out.println("Включаем новый ПК");;
    }

    @Override
    public void off() {
        System.out.println("Выключаем новый ПК");;
    }
}

