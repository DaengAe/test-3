package JAVA_practice.Chapter5;

public class TestInterface {
    public static void main(String[] args){
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}
