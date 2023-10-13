package h_2023_10.bj;

import java.io.*;
import java.util.StringTokenizer;

public class _1260 {
    static int N,M;
    static boolean[] visited_dfs,visited_bfs;
    static int[][] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited_dfs=new boolean[M];
        visited_bfs=new boolean[M];
        graph=new int[M][2];
        int start = Integer.parseInt(st.nextToken());
        for (int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            graph[i][0]=Integer.parseInt(st.nextToken());
            graph[i][1]=Integer.parseInt(st.nextToken());
        }
        dfs(start);
    }

    public static void dfs(int x){
        visited_dfs[x]=true;
        System.out.println(x + " ");
        for (int node:graph[x]){
            System.out.println("node:"+node);
            if (!visited_dfs[node]){
                dfs(node);
            }
        }
    }
}
