
public class StudentInfo {
    public int studentNumber;
    public String firstName;
    public String lastName;
    public StudentInfo next;

    public StudentInfo(int studentNumber, String fN, String lastName) {
        this.studentNumber = studentNumber;
        firstName = fN;
        this.lastName = lastName;
        next = null;
    }

    public StudentInfo() {
        studentNumber = -1;
        firstName = "first name";
        lastName = "last name";
        next = null;
    }

}
