public class Quest9 {
    public static void main(String[] args){
        int score = (int)(Math.random() * 10) + 1;
        String msg = "";
        score *= 100;
        msg = "당신의 점수는 " + score + "이고, 상품은 ";

        if(score == 1000){msg += "자전거, ";}
        else if(score == 900){msg += "TV, ";}
        else if(score == 800){msg += "노트북, ";}
        else if(score == 700){msg += "자전거, ";}
        else{msg += "볼펜, ";}

        System.out.println(msg + "입니다.");
    }
}
