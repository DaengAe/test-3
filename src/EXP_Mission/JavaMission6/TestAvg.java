package EXP_Mission.JavaMission6;

public class TestAvg {
    public static void main(String [] args){
        Avg a = new Avg();

        int[] num = {1, 21, 37, 42, 59};
        double avg = a.Avg(num);
        System.out.println("평균: "+avg);

        num = a.Arr();
        avg = a.Avg(num);
        System.out.println("평균: "+avg);
    }
}
