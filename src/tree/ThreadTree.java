package tree;

public class ThreadTree {
    private Node root;
    private int size;
    private Node pre = null;

    public ThreadTree(){
        this.root = null;
        this.size = 0;
        this.pre = null;
    }

    public ThreadTree(int[] data){
        this.pre = null;
        this.size = data.length;
        this.root = createTree(data,1);
    }

    /*
    * 创建二叉树
    */
    public Node createTree(int[] data, int index){
        if(index>data.length)
            return null;
        Node node = new Node(data[index-1]);
        Node left = createTree(data,2*index);
        Node right = createTree(data, 2*index+1);
        node.setLeft(left);
        node.setRight(right);
        return node;
    }

    /*将以root为根节点，用中序遍历的方法将二叉树线索化*/
    public void inThread(Node root){
        if(root!=null){
            inThread(root.getLeft());
            if(null==root.getLeft()){
                root.setLeftIsThread(true);
                root.setLeft(pre);
            }
            if(pre!=null&&null==pre.getRight()){
                pre.setRightIsThread(true);
                pre.setRight(root);
            }
            pre = root;
            inThread(root.getRight());
        }
    }

    /*
    * 中序遍历线索化的二叉树*/
    public void inThreadList(Node root){
        if(root != null){
            while(root != null && !root.isLeftIsThread())
                root = root.getLeft();
            do{
                System.out.println(root.getData()+",");
                if(root.isRightIsThread())
                    root = root.getRight();
                else{
                    root = root.getRight();
                    while(root !=null&&!root.isLeftIsThread())
                        root =root.getLeft();
                }
            }while(root!=null);
        }
    }

    /* 前序遍历递归算法
	*/
    public void preList(Node root)
    {
        if (root != null)
        {
            System.out.print(root.getData() + ",");
            preList(root.getLeft());
            preList(root.getRight());
        }
    }

    /**
     * 中序遍历
     *
     */
    public void inList(Node root)
    {
        if (root != null)
        {
            inList(root.getLeft());
            System.out.print(root.getData() + ",");
            inList(root.getRight());
        }
    }

    public Node getRoot()
    {
        return root;
    }

    public void setRoot(Node root)
    {
        this.root = root;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }
}
