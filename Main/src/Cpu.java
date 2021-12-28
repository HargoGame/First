public class Cpu extends NewPC{
    private String series;

    public Cpu(String name, int price, String series) {
        super(name, price);
        this.series = series;
    }

    @Override
    public void assemblyPC() {
        System.out.println("Процессор, производитель " + name + " " + this.series +  " , цена " + price + " ." + "Ставим в материнскую плату и устанавливаем в новый корпус.");
    }
}
