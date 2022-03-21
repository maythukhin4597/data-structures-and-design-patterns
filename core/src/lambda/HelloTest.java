package lambda;

interface HelloRunnable {
    void displayHello();
}

class HelloImpl implements HelloRunnable {

    @Override
    public void displayHello() {
        System.out.println("hello");
    }
}

public class HelloTest {
    public static void main(String[] args) {
        HelloRunnable helloRunnable = new HelloImpl();
        helloRunnable.displayHello();
    }
}
