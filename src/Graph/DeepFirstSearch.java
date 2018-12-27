package Graph;
// 邻接矩阵深度优先遍历算法

public class DeepFirstSearch {
    private final int MAXVEX = 100;
    private final int INFINITY  = Integer.MAX_VALUE;
    Boolean[] visisted = new Boolean[100];

    private void DFS(MGragph G, int i){
        visisted[i] = Boolean.TRUE; //将i 结点标记为已访问
        System.out.println(G.getVex(i)+" %%%前序遍历%%%");// 打印顶点，也可以是其他操作
        for(int j = 0; j<G.getNumVex();j++){
            if(G.getArc(i, j)<INFINITY&&!visisted[j]){
                DFS(G, j);//对未访问的顶点递归调用
            }
        }
        System.out.println(G.getVex(i)+" %%%后序遍历%%%");// 打印顶点，也可以是其他操作
    }
//    邻接矩阵的深度遍历操作
    void DFSTraveerse(MGragph G ){
        for(int i = 0; i<G.getNumVex();i++){
            visisted[i] = Boolean.FALSE;//初始化所有顶点都是未访问的状态
        }
        for(int i = 0;i<G.getNumVex();i++){
            if(!visisted[i]){
                DFS(G,i);//对未访问的顶点调用DFS，
            }
        }
    }

    public static void main(String[] args) {
        MGragph g = new MGragph();
        g.creatMGraph();
        DeepFirstSearch m = new DeepFirstSearch();
        m.DFSTraveerse(g);
    }
}
