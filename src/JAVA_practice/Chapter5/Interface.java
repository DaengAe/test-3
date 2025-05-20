package JAVA_practice.Chapter5;

interface Interface {
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo(){
        System.out.println("** 로고 출력 **");
    }
}

class Calc {
    public int calculator(int x, int y){
        return x+y;
    }
}

class SmartPhone extends Calc implements Interface {
    @Override
    public void sendCall() {
        System.out.println("전화 벨소리");
    }
    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    public void schedule(){
        System.out.println("일정 관리");
    }
}
