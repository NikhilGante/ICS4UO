public class PTE extends EmployeeInfo{
    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;

    public PTE(int empNum, String firstName, String lastName){
        super(empNum, firstName, lastName);
    }

    public PTE(int empNum, String firstName, String lastName, int gender, int workLoc, double deductRate){
        super(empNum, firstName, lastName, gender, workLoc, deductRate);
    }
}
