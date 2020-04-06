package tree;

public class Node {
    private int data;
    private Node left;
    private boolean leftIsThread;
    private Node right;
    private boolean rightIsThread;
// 我爱喵喵
    public Node(int data){
      this.data = data;
      this.left = null;
      this.leftIsThread =false;
      this.right = null;
      this.rightIsThread = false;
    }
    public int getData()
    {
        return data;
    }

//    假装bug修好了
    // 按照意见修改
    public void setData(int data)
    {
        this.data = data;
    }

    public Node getLeft()
    {
        return left;
    }

    public void setLeft(Node left)
    {
        this.left = left;
    }

    public boolean isLeftIsThread()
    {
        return leftIsThread;
    }

    public void setLeftIsThread(boolean leftIsThread)
    {
        this.leftIsThread = leftIsThread;
    }

    public Node getRight()
    {
        return right;
    }

    public void setRight(Node right)
    {
        this.right = right;
    }

    public boolean isRightIsThread()
    {
        return rightIsThread;
    }

    public void setRightIsThread(boolean rightIsThread)
    {
        this.rightIsThread = rightIsThread;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Node)
        {
            Node temp = (Node) obj;
            if (temp.getData() == this.data)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return super.hashCode() + this.data;
    }
}
