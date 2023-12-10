package generation.PolymorphismandInheritance;

public class Employee {
    protected int age;
    protected int yearsWorked;
    protected double salary;
    protected int daysWorked;
    protected int vacationDaysTaken;

    public int timeToRetirement() {
        return Math.min(60 - age, 40 - yearsWorked);
    }

    public int vacationTimeLeft() {
        return (int) ((daysWorked / 360.0) * (30 - vacationDaysTaken));
    }

    public int calculateBonus() {
        return (int) (2.2 * salary);
    }
}

