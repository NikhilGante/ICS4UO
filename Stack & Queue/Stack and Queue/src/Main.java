public class Main {
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(new StudentInfo(685595, "Nikhil", "Gante"));
        q.enqueue(new StudentInfo(680211, "Grant", "Ren"));
        q.enqueue(new StudentInfo(694200, "Ernest", "James"));

//        StudentInfo s = q.peek();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.display();
//        System.out.println(s.firstName);
//        System.out.println(s.lastName);
//        System.out.println(s.studentNumber);

    }
}