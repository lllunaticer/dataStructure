package Graph.AdjacentTable;

import java.util.Scanner;

public class GraphAdjList {
    private final int MAXVEX = 100;
    private final int INFINITY = Integer.MAX_VALUE;
//  声明一个顶点数组
    VertexNode[] adjlist = new VertexNode[MAXVEX];
//  图中当前的顶点数和边数
    private int numVertexes, numEdges;

    void createAdjacentTable(){
        System.out.println("请输入顶点数和边数，以空格分开");
        Scanner in = new Scanner(System.in);
        this.numVertexes = in.nextInt();
        this.numEdges = in.nextInt();
        System.out.println("顶点数目为："+this.numVertexes + " 边数目为："+ this.numEdges);

        int i, j, k;
        EdgeNode e = new EdgeNode();
//        输入顶点表信息
        for(i = 0; i<numVertexes; i++){
            adjlist[i] = new VertexNode();
            System.out.println("输入下一个顶点信息");
//            输入顶点信息
            adjlist[i].data = in.nextDouble();
//            将以该顶点为头的边表初始化为空表
            adjlist[i].firstedge = null;
        }

//        输入边表信息
        for(i = 0; i<numEdges; i++){
            System.out.println("请输入边（vj,vk）上的顶点序号");
            j = in.nextInt();
            k = in.nextInt();

//            头插法将边表插入
            e.adjvex = k;  //要操作的邻接序号为k，e作为要插入的结点和边表之间的临时存放点，类似于两个变量交换值所需要接用的第三个临时变量
            e.next = adjlist[j].firstedge; //将e指向当前顶点指向的结点
            adjlist[j].firstedge = e;  //将当前顶点的指针指向e

//            对于无向图，一条边对应两个顶点，需要两次插入边表的操作
            e.adjvex = j;
            e.next = adjlist[k].firstedge;
            adjlist[k].firstedge = e;

        }
    }

    void getVertex(){
        for (int i=0;i<numVertexes;i++){
            System.out.println(adjlist[i].getData());
        }
    }
    public static void main(String[] args) {
        GraphAdjList a = new GraphAdjList();
        a.createAdjacentTable();
        a.getVertex();
    }
}
