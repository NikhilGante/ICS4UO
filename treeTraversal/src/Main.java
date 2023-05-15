public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        StudentInfo[] arr = {
                new StudentInfo(2, "E", "Z"),
                new StudentInfo(3, "M", "C"),
                new StudentInfo(4, "Abhilash", "Bhaskaran"),
                new StudentInfo(1, "Daffy", "Duck"),
                new StudentInfo(5, "Grant", "Ren")
//                new StudentInfo(5, "ernest", "Ramas"),
//                new StudentInfo(8, "Bloody", "Wanker"),
        };
        MyBinaryTree theTree = new MyBinaryTree();
//        for(int i = 0; i < 5; i++)  theTree.addToTree(theTree.root, arr[i]);

        theTree.addToTree(theTree.root, new StudentInfo(14, "E", "Z"));
        theTree.addToTree(theTree.root, new StudentInfo(21, "E", "Z"));
        theTree.addToTree(theTree.root, new StudentInfo(17, "E", "Z"));
        theTree.addToTree(theTree.root, new StudentInfo(9, "E", "Z"));
        theTree.addToTree(theTree.root, new StudentInfo(11, "E", "Z"));
        theTree.addToTree(theTree.root, new StudentInfo(2, "E", "Z"));
        theTree.addToTree(theTree.root, new StudentInfo(5, "E", "Z"));
        theTree.addToTree(theTree.root, new StudentInfo(25, "E", "Z"));
        theTree.addToTree(theTree.root, new StudentInfo(15, "E", "Z"));
        theTree.addToTree(theTree.root, new StudentInfo(7, "E", "Z"));

//        theTree.addToTree(theTree.root, null);

        theTree.postorder(theTree.root);
    }
}
// 14, 9, 2, 5, 7, 11, 21, 17, 15, 25
// 7, 5,2, 11,9, 15, 17, 25, 21, 14
