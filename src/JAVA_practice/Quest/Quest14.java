package JAVA_practice.Quest;

public class Quest14 {
    public static void main(String [] args){
        int score = 88;
        char grade =' ';

        grade = (score >= 90 && score <= 100) ? 'A'
                :(score >= 80 && score < 90) ? 'B'
                :(score >= 70 && score < 80) ? 'C'
                :(score >= 60 && score < 70) ? 'D'
                :'F';

        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}
