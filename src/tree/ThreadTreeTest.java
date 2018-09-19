package tree;

public class ThreadTreeTest {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        ThreadTree threadTree = new ThreadTree(data);
        threadTree.inList(threadTree.getRoot());
        System.out.println();

        threadTree.inThread(threadTree.getRoot());
        threadTree.inThreadList(threadTree.getRoot());
    }
}
