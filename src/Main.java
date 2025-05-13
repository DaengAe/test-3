import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int n = sc.nextInt();
            int count = 0;

            for (int i = 0; i < n; i++) {
                int cx = sc.nextInt();
                int cy = sc.nextInt();
                int r = sc.nextInt();

                int distStart = (x1 - cx) * (x1 - cx) + (y1 - cy) * (y1 - cy);

                int distEnd = (x2 - cx) * (x2 - cx) + (y2 - cy) * (y2 - cy);
                int rSquared = r * r;

                if ((distStart < rSquared && distEnd >= rSquared) ||
                        (distStart >= rSquared && distEnd < rSquared)) {
                    count++;
                }
            }
            System.out.println(count);
        }

        sc.close();
    }
}
