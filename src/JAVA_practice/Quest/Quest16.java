package JAVA_practice.Quest;

public class Quest16 {
    public static void main(String[] args){
        int score = 88;
        char grade = ' ';

        grade = (score/10 == 10 || score/10 == 9) ? 'A'
                :score/10 == 8 ? 'B'
                :score/10 == 7 ? 'C'
                :score/10 == 6 ? 'D'
                :'F';

        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}
