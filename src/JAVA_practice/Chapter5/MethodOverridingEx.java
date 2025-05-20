package JAVA_practice.Chapter5;

public class MethodOverridingEx {
    static void paintShape(Shape p) { //Shape를 상속받은 객체들이 매개변수로 넘어올 수 있음
        p.draw(); // p가 가리키는 객체에 오버라이딩 된 draw() 호출. 동적바인딩
    }
    public static void main(String [] args){
        Line line = new Line();
        paintShape(line);

        paintShape (new Shape() {
            @Override
            public void draw() {
                System.out.println("도형");
            }
        });
        paintShape(new Line());
        paintShape(new Rect());
        paintShape(new Circle());
    }
}
