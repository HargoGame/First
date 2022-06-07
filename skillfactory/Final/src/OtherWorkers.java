public class OtherWorkers extends Employee{

    private String textDescription;

    public OtherWorkers(String fullName, int birthday, int startDate, String textDescription) {
        super(fullName, birthday, startDate);
        this.textDescription = textDescription;
    }
}
