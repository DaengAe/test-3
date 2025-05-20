package BaekJoon.A1038;

import java.util.*;

public class Main {
    static ArrayList<Long> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1자리 수 (0~9)를 시작으로 DFS 시작 (깊이 우선 탐색)
        for (int i = 0; i <= 9; i++) {
            dfs(i, 1); // 시작 숫자, 현재 자리 수
        }
        // result 리스트를 오름차순으로 정렬
        Collections.sort(result);

        // 결과 출력
        if (N < result.size()) {
            System.out.println(result.get(N));
        } else {
            System.out.println(-1);
        }
    }

    // num: 현재 숫자, depth: 현재 자리 수
    static void dfs(long num, int depth) {
        result.add(num); // 현재 숫자 저장

        // 마지막 자릿수가 0이면 더 이상 작아질 수 없으므로 종료
        if (num % 10 == 0) return;

        // 다음 자리 숫자는 현재 자리보다 더 작은 숫자만 가능
        for (int i = 0; i < num % 10; i++) {
            dfs(num * 10 + i, depth + 1);
        }
    }
}