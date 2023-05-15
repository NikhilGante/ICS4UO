public class FTE extends EmployeeInfo{
    public double yearlySalary;
    public FTE(int empNum, String firstName, String lastName){
        super(empNum, firstName, lastName);
    }
    public FTE(int empNum, String firstName, String lastName, int gender, int workLoc, double deductRate){
        super(empNum, firstName, lastName, gender, workLoc, deductRate);
    }
}
