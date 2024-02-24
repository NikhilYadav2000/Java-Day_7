class myThread1 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i < 100) {
            System.out.println("Good Morning");
        }
    }
}

class myThread2 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i < 100) {
            System.out.println("Welcome");
        }
    }
}

public class V32_Practice13 {
    public static void main(String[] args) {
        myThread1 mt1 = new myThread1();
        myThread2 mt2 = new myThread2();
        mt1.start();
        mt2.start();
    }
}
