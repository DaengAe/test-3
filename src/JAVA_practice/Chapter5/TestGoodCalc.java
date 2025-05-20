package JAVA_practice.Chapter5;

public class TestGoodCalc {
    public static void main(String[] args){
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(2, 4));
        System.out.println(c.sub(4, 7));
        System.out.println(c.avg(new int [] {2, 3, 6}));
    }
}
