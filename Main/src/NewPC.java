public class NewPC {

    protected int price;
    protected String name;

    public NewPC(String name, int price) {
        this.name = name;
        this.price = price;
}
    public void assemblyPC() {
        System.out.println(toString() + "Достаем из коробки и открываем.");
    }

    public String toString(){
        return "Корпус, производитель " + name + " , цена " + price + " ." ;
    }

    public void homePC() {
    }
}

