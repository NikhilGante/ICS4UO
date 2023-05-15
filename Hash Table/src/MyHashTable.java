import java.util.*;


public class MyHashTable {

    // ATTRIBUTES

    // buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo
    // object holding a reference value pointing to a student.

    public ArrayList<EmployeeInfo>[] buckets;


    // CONSTRUCTOR

    public MyHashTable(int numBuckets) {
        // Construct the hash table (open hashing/closed addressing) as an array of numBuckets ArrayLists.

        // Instantiate buckets as an array to have an ArrayList as each element of the array.
        buckets = new ArrayList[numBuckets];

        // For each element in the array, instantiate its ArrayList.
        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
        }
    }


    // METHODS

    public int calcBucket(int studentNumber) {
        return(studentNumber % buckets.length);  // student number modulo number of buckets
    }


    public void addToTable(EmployeeInfo theEmp) {
        // Add the student referenced by theEmp to the hash table.

        if (theEmp == null) {
            return; // Nothing to do!
        }

        // CODE GOES HERE
        int targetBucket = calcBucket(theEmp.empNum);
        buckets[targetBucket].add(theEmp);

    }


    public EmployeeInfo removeFromTable(int studentNum) {
        // Remove that student from the hash table and return the reference value for that student.
        // Return null if that student isn't in the table.

        // CODE GOES HERE
        int targetBucket = calcBucket(studentNum);
        for(int i = 0; i < buckets[targetBucket].size(); i++){
            if(studentNum == buckets[targetBucket].get(i).empNum)  return buckets[targetBucket].remove(i);
        }
        return null;
    }


    public EmployeeInfo getFromTable(int studentNum) {
        // Return the reference value for that student, return null if student isn't in the table.

        // CODE GOES HERE

        int targetBucket = calcBucket(studentNum);
        for(int i = 0; i < buckets[targetBucket].size(); i++){
            if(studentNum == buckets[targetBucket].get(i).empNum)  return buckets[targetBucket].get(i);
        }
        return null;
    }


    public void displayTable() {
        // Walk through the buckets and display the items in each bucket's ArrayList.

        System.out.println("\n\nHERE ARE THE CONTENTS OF THE TABLE:");
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i].isEmpty())   System.out.println("Bucket " + i + " has an empty ArrayList!");
            else {
                EmployeeInfo theEmp;
                for(int j = 0; j < buckets[i].size(); j++){
                    theEmp = buckets[i].get(j);
                    System.out.println("Bucket " + i + ": " + theEmp.firstName + " " + theEmp.lastName);

                }
            }
        }

    }


}
