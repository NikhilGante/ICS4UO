public class MyLL {
    public StudentInfo frontOfList;
    public int length;

    public MyLL(){
        frontOfList = null;
        length = 0;
    }

    public void addToFront(StudentInfo itemToAdd){
        if(itemToAdd == null) return;
        if(frontOfList == null){
            frontOfList = itemToAdd;
            length = 1;
            return;
        }
        itemToAdd.next = frontOfList;
        frontOfList = itemToAdd;
        length++;
        System.out.printf("Name: %s %s | num: %d %n", frontOfList.firstName, frontOfList.lastName, length);
    }

    public void addToRear(StudentInfo itemToAdd){
        if(itemToAdd == null){
            System.out.printf("item null\n\n\n");
            return;
        }
        if(frontOfList == null){
            System.out.printf("front null\n\n\n");

            frontOfList = itemToAdd;
            length = 1;
            return;
        }

        StudentInfo cur = frontOfList;
        while(cur.next != null) cur = cur.next;

        cur.next = itemToAdd;

        length++;
        System.out.printf("Name: %s %s | num: %d %n", cur.next.firstName, cur.next.lastName, length);
    }

    public void insert(StudentInfo itemToAdd, int index){
        if(itemToAdd == null){
            System.out.printf("item null\n");
            return;
        }
        if(frontOfList == null){
            System.out.printf("front null\n");

            frontOfList = itemToAdd;
            length = 1;
            return;
        }
        if(index > length){
            System.out.printf("Index beyond end of list\n");
            return;
        }
        if(index == 0){
            addToFront(itemToAdd);
            return;
        }
        StudentInfo cur = frontOfList;
        int i = 0;
        while(i < index - 1){
            cur = cur.next;
            i++;
        }
        itemToAdd.next = cur.next;
        cur.next = itemToAdd;

        length++;
//        System.out.printf("Name: %s %s | num: %d %n", cur.next.firstName, cur.next.lastName, length);
    }

    public StudentInfo removeFromFront(){

        if(frontOfList == null){
            System.out.printf("front null\n");
            return null;
        }
        StudentInfo temp = frontOfList;
        frontOfList = frontOfList.next;
        temp.next = null;
        length--;
        return temp;
    }
    public StudentInfo removeFromRear() {
        if(frontOfList == null){
            System.out.printf("front null\n");
            return null;
        }
        StudentInfo temp;
        if(length == 1){
            temp = frontOfList;
            frontOfList = null;
            length = 0;
            return temp;
        }

        StudentInfo prev = null;
        StudentInfo cur = frontOfList;

        while(cur.next != null){
            prev = cur;
            cur = cur.next;
        }
        temp = cur;
        prev.next = null;
        length--;
        return temp;

    }


    public StudentInfo remove(int index) {
        if(index > length - 1){
            System.out.println("Invalid index");
            return null;
        }
        if(index == 0)  return removeFromFront();
        if(index == length - 1)    return removeFromRear();

        int i = 0;
        StudentInfo cur = frontOfList;
        while(i < index - 1){
            cur = cur.next;
            i++;
        }
        StudentInfo temp = cur.next;
        cur.next = cur.next.next;
        length--;
        return temp;
    }

    public void display(){
        StudentInfo cur_item = frontOfList;
        while(cur_item != null){
            System.out.printf("Display | Name: %s %s | Student Num: %d %n", cur_item.firstName, cur_item.lastName, cur_item.studentNumber);
            cur_item = cur_item.next;
        }
    }

}
