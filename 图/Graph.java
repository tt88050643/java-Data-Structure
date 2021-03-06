public class Graph{
	//顶点数组
	private Vertex[] vertexList;
	//邻接矩阵
	private int[][] adjMat;
	//顶点的最大数目
	private int maxSize;
	//当前顶点个数
	private int nVertex;
	
	public Graph(int maxSize){
		vertexList = new Vertex[maxSize];
		adjMat = new int[maxSize][maxSize];
		for(int i=0; i<maxSize; i++){
			for(int j=0; j<maxSize; j++){
				adjMat[i][j] = 0;
			}
		}
		nVertex = 0;
	}
		//添加顶点
	public void addVertex(char label){
		vertexList[nVertex++] = new Vertex(label);
	}
	//添加边,临接矩阵的生成
	public void addEdge(int start, int end){
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	public int getadjUnvisitedVertex(int v){
		for(int i=0; i<nVertex; i++){
			if(adjMat[v][i] == 1 && vertexList.[i].wasVisited == false){
				return i;
			}
		}
		return -1;
	}
	
}