package JAVA_practice.Quest;

public class Quest4 {
    public static void main(String[] args){
        int score = 80;
        String grade = "";

        System.out.println("당신의 점수는 " + score + "입니다.");

        grade = (score >= 90 ? "A" + ((score >= 98 ? "+" : (score < 94 ? "-" : ""))) :
                (score >= 80 ? "B" + ((score >= 88 ? "+" : (score < 84 ? "-" : ""))) : "C"));

        System.out.println("당신의 학점은 " +grade+ "입니다.");
    }
}
