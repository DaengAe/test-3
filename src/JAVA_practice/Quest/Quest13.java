package JAVA_practice.Quest;

public class Quest13 {
    public static void main(String [] args){
        char ch = (char)(Math.random() * 4 + 'A');
        int score = 0;

        score = ch=='A' ? 90
                :ch=='B' ? 80
                :ch=='C' ? 70
                :ch=='D' ? 60
                : 0;

        System.out.println("당신의 점수는 " + score + "점 이상 입니다.");
    }
}
