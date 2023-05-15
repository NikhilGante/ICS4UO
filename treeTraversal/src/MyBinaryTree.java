public class MyBinaryTree {
    public StudentInfo root;
    public int numInTree;
    public MyBinaryTree() {
        root = null;
        numInTree = 0;
    }
    public void addToTree(StudentInfo currentNode, StudentInfo studentToAdd){
//        if(currentNode == null){
//            System.out.printf("CURRENT NODE IS NULL, RETURNED\n");
//            return;
//        }
        if(studentToAdd == null){
            System.out.printf("STUDENT NODE IS NULL, RETURNED\n");
            return;
        }
        if(root == null){
            root = studentToAdd;
            numInTree = 1;
            return;
        }
        if(studentToAdd.studentNumber < currentNode.studentNumber){
            if(currentNode.left == null){
                currentNode.left = studentToAdd;
                numInTree++;
            }
            else    addToTree(currentNode.left, studentToAdd);
        }
        else{
            if(currentNode.right == null){
                currentNode.right = studentToAdd;
                numInTree++;
            }
            else    addToTree(currentNode.right, studentToAdd);
        }
    }

    public void preorder(StudentInfo currentNode){
        if(currentNode == null) return;
        System.out.printf("%d %s %s\n", currentNode.studentNumber, currentNode.firstName, currentNode.lastName);
        preorder(currentNode.left);
        preorder(currentNode.right);
    }
    public void inorder(StudentInfo currentNode){
        if(currentNode == null) return;
        inorder(currentNode.left);
        System.out.printf("%d %s %s\n", currentNode.studentNumber, currentNode.firstName, currentNode.lastName);
        inorder(currentNode.right);
    }
    public void postorder(StudentInfo currentNode){
        if(currentNode == null) return;
        postorder(currentNode.left);
        postorder(currentNode.right);
        System.out.printf("%d %s %s\n", currentNode.studentNumber, currentNode.firstName, currentNode.lastName);
    }
}
