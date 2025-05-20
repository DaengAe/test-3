package BaekJoon.A2003_1;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[] S = new int[N]; //누적 합 배열
        S[0] = A[0];
        for (int i=1; i<N; i++){
            S[i] = S[i-1] + A[i];
        }

        int count = 0;
        for (int i=0; i<N; i++) {
            for (int j=i; j<N; j++) {
                int sum = S[j] - (i>0 ? S[i-1] : 0);
                if(sum == M) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}