package JAVA_practice.Chapter5;

interface Shape {
    void draw();
}

class Line implements Shape {
    public void draw(){
        System.out.println("선");
    }
}
class Rect implements Shape {
    public void draw(){
        System.out.println("직사각형");
    }
}
class Circle implements Shape {
    public void draw(){
        System.out.println("원");
    }
}
