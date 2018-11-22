package Graph;

import java.util.Scanner;

public class MGragph {
    public final int MAXVEX = 100;
    public final int INFINIFY = Integer.MAX_VALUE;

    //the type of vexs and arcs should be defined by the user
    //here we set double as default
    private double[] vexs = new double[MAXVEX]; //the table of vertexes
    private double[][] arcs = new double[MAXVEX][MAXVEX]; // the table of arcs

    //the number of vertexes and edges of the current graph
    private int numVertexes, numEdges;

    public void creatMGraph(){
        System.out.println("请输入顶点数和边数, 以空格隔开");
        Scanner in  = new Scanner(System.in);
        //in.useDelimiter("\\x20");
        this.numVertexes = in.nextInt();
        this.numEdges  = in.nextInt();
        System.out.println("顶点数为："+this.numVertexes + "边数为："+ this.numEdges);

        for(int i=0; i<this.numVertexes;i++){
            System.out.println("请输入下一个顶点的值：");
            vexs[i] = in.nextDouble();
        }
        System.out.println("顶点输入完毕");

        for(int i=0;i<this.numVertexes;i++){
            for(int j=0;j<this.numVertexes;j++){
                arcs[i][j] = INFINIFY;
            }
        }

        for(int k=0; k<this.numEdges; k++){
            System.out.println("请输入边（i, j）的上下标及其权重w:");
            arcs[in.nextInt()][in.nextInt()] = in.nextDouble();
        }
        in.close();
        System.out.println("图构建完成！");

    }

    public static void main(String[] args) {
        MGragph a = new MGragph();
        a.creatMGraph();
    }
}
