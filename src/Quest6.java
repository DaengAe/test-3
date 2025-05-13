public class Quest6 {
    public static void main(String[] args){
        char ch = (char)(Math.random() * 4 + 'A');
        int score = 0;

        if(ch == 'A'){score = 90;}
        else if(ch == 'B'){score = 80;}
        else if(ch == 'C'){score = 70;}
        else if(ch == 'D'){score = 60;}

        System.out.println("당신의 점수는 " + score + "점 이상 입니다.");
    }
}
