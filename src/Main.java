import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i < T; i++){
            int R = sc.nextInt();
            String S = sc.next();

            String result = "";

            for (int l = 0; l < S.length(); l++) {
                char c = S.charAt(l);
                for (int j = 0; j < R; j++) {
                    result += c;
                }
            }
            System.out.println(result);
        }
    }
}