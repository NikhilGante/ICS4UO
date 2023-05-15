public class EmployeeInfo {
    public int empNum;
    public String firstName;
    public String lastName;
    public int gender;
    public int workLoc;
    public double deductRate;

    public EmployeeInfo(int empNum, String firstName, String lastName){
        this.empNum = empNum;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    EmployeeInfo(int empNum, String firstName, String lastName, int gender, int workLoc, double deductRate){
        this.empNum = empNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.workLoc = workLoc;
        this.deductRate = deductRate;
    }
    
}
