abstract class Phone {
    abstract void on();

    abstract void off();
}

class SmartPhone extends Phone {
    public void on() {
        System.out.println("Turning on....");
    }

    public void off() {
        System.out.println("Turning off....");
    }
}

public class first {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.on();
        sp.off();
    }

}
