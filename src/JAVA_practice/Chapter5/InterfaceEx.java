package JAVA_practice.Chapter5;

public class InterfaceEx {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        System.out.println("3과 5를 더하면 " + phone.calculator(3, 5));
        phone.schedule();
    }
}
