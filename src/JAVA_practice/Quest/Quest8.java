package JAVA_practice.Quest;

public class Quest8 {
    public static void main(String [] args){
        int score = 1;
        String reword = "";

        reword = score*100 == 100 ? "자전거"
                :score*100 == 200 ? "TV"
                :score*100 == 300 ? "노트북"
                :score*100 == 400 ? "자동차"
                :"";

        System.out.println(
                reword.equals("")
                ? "죄송하지만 당신의 점수에 해당상품이 없습니다."
                : "당신의 점수는 "+ score*100 +"이고, 상품은 "+ reword +"입니다."
        );
    }
}
