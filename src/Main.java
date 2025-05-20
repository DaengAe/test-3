import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // 건물 수
            int K = sc.nextInt(); // 규칙 수
            int D[] = new int[N]; // 건설 시간

            for(int n=0; n<N; n++){ //건설 시간을 배열로 저장
                D[n] = sc.nextInt();
            }
            for(int n=0; n<N; n++){
                int X = sc.nextInt();
                int Y = sc.nextInt();
            }
            int W = sc.nextInt();


        }
        sc.close();
    }
}