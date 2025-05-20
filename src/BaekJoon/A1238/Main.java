package BaekJoon.A1238;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<int[]>[] Way; // 도로 정보
    static int N, M, X; // 마을 수, 도로 수, 목표 마을
    static final int INF = 100*1000; // 최단거리 초기값(무한대 역할)

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        N =  Integer.parseInt(tk.nextToken());
        M = Integer.parseInt(tk.nextToken());
        X = Integer.parseInt(tk.nextToken());

        Way = new ArrayList[N+1];
        for (int i = 1; i<=N; i++) {
            Way[i] = new ArrayList<>();
        }

        for (int i = 0; i<M; i++) {
            tk = new StringTokenizer(br.readLine());
            int Start = Integer.parseInt(tk.nextToken());
            int End = Integer.parseInt(tk.nextToken());
            int Time = Integer.parseInt(tk.nextToken());

            Way[Start].add(new int[]{End, Time});
        }

        System.out.println(MaxTime());
    }

    static int MaxTime() {
        int max = 0;

        int[] XtoV = dijkstra(X);

        for (int v = 1; v<=N; v++){
            if(v != X){
                int[] VtoX = dijkstra(v);

                int xDis = VtoX[X] + XtoV[v];

                max = Math.max(max, xDis);
            }
        }
        return max;
    }

    static int[] dijkstra(int Start) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(x -> x[1]));
        int[] Dis = new int[N+1];
        Arrays.fill(Dis, INF);

        Dis[Start] = 0;
        priorityQueue.add(new int[]{Start, 0});

        while (!priorityQueue.isEmpty()){
            int[] now = priorityQueue.poll();
            int now_v = now[0];
            int now_dis = now[1];

            if (Dis[now_v] < now_dis) continue;

            for (int i = 0; i<Way[now_v].size(); i++){
                int next_v = Way[now_v].get(i)[0];
                int v_dis = Way[now_v].get(i)[1];

                int next_dis = now_dis + v_dis;

                if (Dis[next_v] > next_dis) {
                    Dis[next_v] = next_dis;
                    priorityQueue.add(new int[]{next_v, next_dis});
                }
            }
        }
        return Dis;
    }
}

