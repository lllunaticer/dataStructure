package Graph;

import java.util.PriorityQueue;
import java.util.Queue;

// 邻接矩阵的广度优先遍历
public class BreadthFirstSearch {
    private final int MAXVEX = 100;
    private final int INFINITY = Integer.MAX_VALUE;
    Boolean[] visited = new Boolean[100];

    void BFSTraverse(MGragph G){
        Queue Q;
        for(int i = 0; i<G.getNumVex();i++){
            visited[i] = Boolean.FALSE;
        }

        Q = new PriorityQueue();
        for(int i = 0; i<G.getNumVex();i++){   //对每一个顶点做循环
            if(!visited[i]){   //若是未访问顶点
                visited[i] = Boolean.TRUE;   //顶点标记为已访问
                System.out.println("打印当前顶点"+G.getVex(i)); //打印当前顶点，也可以是其他操作
                Q.add(i);   //将此顶点加入队列

                while(!Q.isEmpty()){
                    i = (Integer) Q.poll();
                    for(int j = 0; j<G.getNumVex();j++){
                        if(G.getArc(i, j)<INFINITY&&!visited[j]){
                            visited[j]=Boolean.TRUE;
                            System.out.println("打印顶点："+G.getVex(j));
                            Q.add(j);
                        }
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        MGragph g = new MGragph();
        g.creatMGraph();
        BreadthFirstSearch b = new BreadthFirstSearch();
        b.BFSTraverse(g);
    }
}
