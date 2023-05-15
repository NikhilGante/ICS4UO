public class StudentInfo {

    public int studentNumber;
    public String firstName, lastName;
    public StudentInfo left, right;
    public StudentInfo(int sN, String fN, String lN){
        studentNumber = sN;
        firstName = fN;
        lastName = lN;

        left = null;
        right = null;
    }
}