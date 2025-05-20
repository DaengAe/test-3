package EXP_Mission.JavaMission1;

import java.util.Scanner;

public class TestOddEven {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        OddEven oe = new OddEven();
        oe.OddEven(n);
    }
}
