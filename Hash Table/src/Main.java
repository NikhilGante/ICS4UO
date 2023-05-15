
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        EmployeeInfo someEmp = new FTE(685595, "Grant", "Ren");

        EmployeeInfo removedStudent;

        MyHashTable theHT = new MyHashTable(10);  // Open hash table with 10 buckets

        theHT.displayTable();

        someEmp = new FTE(123456, "Bugs", "Bunny");
        theHT.addToTable(someEmp);

        someEmp = new FTE(987654, "Lola", "Bunny");
        theHT.addToTable(someEmp);

        someEmp = new FTE(464646, "Daffy", "Duck");
        theHT.addToTable(someEmp);

        theHT.displayTable();

        removedStudent = (FTE)theHT.removeFromTable(777777);
        if (removedStudent == null) {
            System.out.println("\nRemove failed!  No student with that student number in the table!");
        }
        else {
            System.out.println("\nRemoved " + removedStudent.firstName);
        }

        theHT.displayTable();

        removedStudent = theHT.removeFromTable(123456);

        if (removedStudent == null) {
            System.out.println("\nRemove failed!  No student with that student number in the table!");
        }
        else if(removedStudent instanceof FTE){
            System.out.println("\nRemoved " + removedStudent.firstName);
        }
        else {
            System.out.println("WRONG TYPE");
        }

        theHT.displayTable();
		
		
		/*
		// Let's have some fun!
		for (int i = 0; i < 100; i++) {
			someEmp = new FTE(i, "John", "Doe");
			theHT.addToTable(someEmp);
		}
		theHT.displayTable();
		*/

    }

}
