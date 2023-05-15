public class Main {
    public static void main(String[] args) {

        MyLL theLL = new MyLL();
        StudentInfo theStudent = new StudentInfo(1111, "Daffy", "Duck");

        theLL.addToFront(theStudent);

        theLL.addToFront(new StudentInfo(69420, "Moo", "Yen"));
        theLL.addToRear(new StudentInfo(78790, "ernest james", "ramas"));

        theLL.addToFront(new StudentInfo(05406, "sean", "mootrey"));
        theLL.insert(new StudentInfo(05406, "dense", "sonaghey"), 5);

        theLL.display();

        StudentInfo temp = theLL.remove(1);
        temp = theLL.remove(2);
        theLL.remove(0);
        theLL.remove(0);


//        theLL.removeFromRear();
//        theLL.removeFromRear();
//        theLL.removeFromRear();

//        StudentInfo temp = theLL.removeFromRear();

        System.out.println("Removed");

        theLL.display();

        System.out.printf("%s %d\n", temp.firstName, temp.studentNumber);

    }
}