package Graph.AdjacentTable;
//顶点表结点
public class VertexNode {
//    顶点域，储存顶点信息，应由用户定义其类型
    double data;
//    边表头指针，指向下一个结点
    EdgeNode firstedge;

    public double getData(){
        return data;
    }
}
