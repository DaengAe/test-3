package EXP_Mission.JavaMission2;

public class ArrayPrint {
    void ArrayPrint(int[] num){
        for(int i = 0; i<num.length; i++){
            num[i] = i+1;
        }
        for(int arr: num){
            System.out.print(arr + " ");
        }
    }
}
