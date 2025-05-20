package JAVA_practice.Chapter5;

class Point {
    private int x, y;
    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;
    public void setColor(String color){
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint(); // 부모의 showPoint 메소드 호출
    }
}