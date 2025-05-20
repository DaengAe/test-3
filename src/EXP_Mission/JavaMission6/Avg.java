package EXP_Mission.JavaMission6;

import java.util.Scanner;

public class Avg {
    Scanner sc = new Scanner(System.in);

    int[] Arr(){
        int[] arr = new int[5];
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    double Avg(int[] arr){
        int sum=0;
        for(int a : arr){
            sum += a;
        }
        double avg = (double)sum/arr.length;
        return avg;
    }
}
