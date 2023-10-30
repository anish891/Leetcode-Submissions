public class IsGraphBipartite {
        public boolean isBipartite(int[][] graph) {
            int V = graph.length;
            int [] color = new int[V];
            for(int i=0; i<V; i++){
                color[i] = -1;
            }
            for(int i=0; i<V; i++){
                if(color[i] == -1){
                    if(dfsColor(i, graph, color, 0) == false) return false;
                }
            }
            return true;
        }
        public boolean dfsColor(int node, int[][] graph, int[] color, int col){
            color[node] = col;
            for(int it: graph[node]){
                if(color[it] == -1){
                    if(dfsColor(it, graph, color, 1 - col) == false) return false;
                }
                else if(color[it] == col){
                    return false;
                }
            }
            return true;
        }
}
