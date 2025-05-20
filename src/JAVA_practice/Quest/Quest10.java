package JAVA_practice.Quest;

public class Quest10 {
    public static void main(String[] args){
        int score = (int)(Math.random() * 10) + 1;
        String msg = "";
        score *= 100;
        msg = "당신의 점수는 " + score + "이고, 상품은 ";

        msg +=   score == 1000 ? "자전거, "
                :score == 900 ? "TV, "
                :score == 800 ? "노트북, "
                :score == 700 ? "자동차, "
                :"볼펜, ";

        System.out.println(msg + "입니다.");
    }
}
