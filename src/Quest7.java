public class Quest7 {
    public static void main(String[] args){
        int score = 1;

        if(score*100 == 100){
            System.out.println("당신의 점수는 100이고, 상품은 자전거입니다.");
        }
        else if(score*100 == 200){
            System.out.println("당신의 점수는 200이고, 상품은 TV입니다.");
        }
        else if(score*100 == 300){
            System.out.println("당신의 점수는 300이고, 상품은 노트북입니다.");
        }
        else if(score*100 == 400){
            System.out.println("당신의 점수는 400이고, 상품은 자동차입니다.");
        }
        else{
            System.out.println("죄송하지만 당신의 점수에 해당상품이 없습니다.");
        }
    }
}
