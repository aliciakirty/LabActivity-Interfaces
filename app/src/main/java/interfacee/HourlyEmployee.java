package interfacee;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String name, String id, double hours, double rate) {
        super(name, id);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    @Override
    public double getPaymentAmount() {
        return hoursWorked * hourlyRate;
    }
}