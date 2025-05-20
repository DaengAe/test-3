package EXP_Mission.JavaMission4;

import java.util.Scanner;

public class TestCal {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        Cal c = new Cal();

        System.out.println("덧셈: "+c.Sum(n1, n2));
        System.out.println("뺄셈: "+c.Sub(n1, n2));
    }
}
