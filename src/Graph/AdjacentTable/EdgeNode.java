package Graph.AdjacentTable;
//边表结点
public class EdgeNode {
//    邻接点域，储存该顶点对应的下标
    int adjvex;
//    用于储存权值，对于非网图不需要，应由用户定义其类型
    int weight;
//    链域，指向下一个邻接点
    EdgeNode next;
}
