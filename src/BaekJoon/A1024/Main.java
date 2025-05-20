package BaekJoon.A1024;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //수열 합
        int l = sc.nextInt(); //최소 길이
        Sequence sq = new Sequence(N,l);
    }
}
class Sequence {
    Sequence(int N, int l){
        //연속된 음이 아닌 정수 = 등차가 1인 수열
        for (int L = l; L<=100; L++){ // L 범위
            int Lx = N - (L * (L - 1)) / 2;
            if (Lx < 0){
                break;
            }
            if (Lx % L == 0) { //x가 정수인 경우
                int x = Lx / L; // 수열의 시작 수
                for (int i = 0; i<L; i++) {
                    System.out.print((x + i) + " ");
                }
                return;
            } // x가 정수가 아니면 L증가 후 반복
        }
        System.out.println("-1"); // L이 100보다 크거나 가능한 수열 없으면
    }
}
