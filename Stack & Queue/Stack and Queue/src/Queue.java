//public class Queue {
//    public StudentInfo front;
//    public int num;
//
//    public Queue(){
//        front = null;
//        num = 0;
//    }
//
//    public void enqueue(StudentInfo itemToAdd){
//        if(itemToAdd == null){
//            System.out.printf("Item null, not enqueued\n");
//            return;
//        }
//        if(front == null){
//            front = itemToAdd;
//            num = 1;
//            return;
//        }
//
//        StudentInfo cur = front;
//        while(cur.next != null) cur = cur.next;
//
//        cur.next = itemToAdd;
//
//        num++;
//    }
//
//    public StudentInfo dequeue() {
//
//        if (front == null) {
//            System.out.printf("Queue empty, dequeue operation failed.\n");
//            return null;
//        }
//        StudentInfo temp = front;
//        front = front.next;
//        temp.next = null;
//        num--;
//        return temp;
//    }
//
//    public void display(){
//        if(front == null){
//            System.out.printf("Queue empty, display operation failed.\n");
//            return;
//        }
//        StudentInfo cur_item = front;
//        while(cur_item != null){
//            System.out.printf("Display | Name: %s %s, Student Num: %d %n", cur_item.firstName, cur_item.lastName, cur_item.studentNumber);
//            cur_item = cur_item.next;
//        }
//    }
//
//}
public class Queue {
    public StudentInfo front;
    public int num;

    public Queue () {
        front = null;
        num = 0;
    }

    public void enqueue (StudentInfo studentToAdd) {
        if (num == 0) {
            front = studentToAdd;
            num++;
            return;
        }
        StudentInfo currStudent = front;
        for (int i = 0; i < num; i++) {
            if (currStudent.next == null) {
                currStudent.next = studentToAdd;
                num++;
                return;
            }
            else {
                currStudent = currStudent.next;
            }
        }

    }

    public StudentInfo dequeue() {
        if (num == 0) {
            return (null);
        }
        StudentInfo removed = front;
        front = front.next;
        num--;
        return (removed);

    }

    public void display() {
        if (num == 0) {
            System.out.println("\n The Queue is Empty. :(");
            return;
        }
        System.out.println("\n The Queue:");
        StudentInfo currStudent = front;
        for (int i = 0; i < num; i++) {
            System.out.println("  " + currStudent.firstName + " " + currStudent.lastName + " " + currStudent.studentNumber);
            currStudent = currStudent.next;
        }
    }

}