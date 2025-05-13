public class Quest3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 16; i++) {
            String s =  (i % 3 == 0 ? " foo" : "") +
                        (i % 5 == 0 ? " bar" : "") +
                        (i % 7 == 0 ? " baz" : "");
            System.out.println(i + s);
        }
    }
}
