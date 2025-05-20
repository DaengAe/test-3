package JAVA_practice.Chapter5;

interface PhoneInterface {
    final int TIMEOUT = 10000; //상수필드 선언
    void sendCall();
    void receiveCall();
    default void printLogo(){
        System.out.println("** 대충 로고 **");
    }
}

class SamsungPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("전화 벨소리");
    }
    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    public void flash(){
        System.out.println("플래시 ON");
    }
}
