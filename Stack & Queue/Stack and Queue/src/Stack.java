public class Stack {
    public StudentInfo top;
    public int num;

    public Stack(){
        top = null;
        num = 0;
    }

    public void push(StudentInfo itemToAdd){
        if(itemToAdd == null) return;
        if(top == null){
            top = itemToAdd;
            num = 1;
            return;
        }
        itemToAdd.next = top;
        top = itemToAdd;
        num++;
    }

    public StudentInfo pop(){

        if(top == null){
            System.out.printf("Stack empty, pop operation failed.\n");
            return null;
        }
        StudentInfo temp = top;
        top = top.next;
        temp.next = null;
        num--;
        return temp;
    }

    public StudentInfo peek(){
        if(top == null){
            System.out.printf("Stack empty, peek operation failed.\n");
            return null;
        }
        return top;
    }

    public void display(){
        if(top == null){
            System.out.printf("Stack empty, display operation failed.\n");
            return;
        }
        StudentInfo cur_item = top;
        while(cur_item != null){
            System.out.printf("Display | Name: %s %s, Student Num: %d %n", cur_item.firstName, cur_item.lastName, cur_item.studentNumber);
            cur_item = cur_item.next;
        }
    }

}