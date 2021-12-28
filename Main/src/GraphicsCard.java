public class GraphicsCard extends NewPC{
    private String series;

    public GraphicsCard(String name, int price, String series) {
        super(name, price);
        this.series = series;
    }

    @Override
    public void assemblyPC() {
        System.out.println("Видеокарта, производитель " + name + " " + this.series +  " , цена " + price + " ." + "Устанавливаем видеокарту в материнкую плату и закрываем корпус.");
    }
}
