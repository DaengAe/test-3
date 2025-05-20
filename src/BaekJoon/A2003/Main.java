package BaekJoon.A2003;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 수열 길이
        int M = Integer.parseInt(st.nextToken()); // 수열의 합

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        Prefix pf = new Prefix(N, M, A);
    }
}

class Prefix{
    Prefix(int N, int M, int[] A){
        int count=0, sum=0, i=0, j=0;

        while (true) {
            if (sum >= M) {
                sum -= A[i];
                i++;
            }
            else if (j == N) {
                break;
            }
            else {
                sum += A[j];
                j++;
            }
            // 목표 합계하면 count++
            if (sum == M) {
                count++;
            }
        }

        System.out.println(count);
    }
}
