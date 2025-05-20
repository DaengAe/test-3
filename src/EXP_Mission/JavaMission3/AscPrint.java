package EXP_Mission.JavaMission3;

import java.util.Arrays;
import java.util.Scanner;

public class AscPrint {
    void AscPrint(){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];

        for (int i = 0; i<num.length; i++){
            num[i] = sc.nextInt(); // 입력 값을 배열로 저장
        }

        Arrays.sort(num); // 배열을 오름차순으로 정렬
        for(int n : num) { // 배열 요소 출력
            System.out.print(n + " ");
        }
    }
}
