public class Manager extends Employee{

    private String listOfEmployees;


    public Manager(String fullName, int birthday, int startDate, String listOfEmployees) {
        super(fullName, birthday, startDate);
        this.listOfEmployees = listOfEmployees;
    }
}
