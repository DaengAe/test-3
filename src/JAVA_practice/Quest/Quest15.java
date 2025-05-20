package JAVA_practice.Quest;

public class Quest15 {
    public static void main(String[] args){
        int score = 88;
        char grade = ' ';

        if(score/10 == 10 || score/10 == 9){
            grade = 'A';}
        else if(score/10 == 8){
            grade = 'B';}
        else if(score/10 == 7){
            grade = 'C';}
        else if(score/10 == 6){
            grade = 'D';}
        else{
            grade = 'F';}

        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}
