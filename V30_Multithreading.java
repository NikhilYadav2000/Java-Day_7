// Multithreading and Multiprocessing are used to achieve multitasking.
// Threads share the memory of a process. Ex - chrome can be used to play video and used to show PDF. 
// Ex - in MS Word , one thread is used when we r typing and one thread is used in auto saving.

// Two ways to create thread
//  1.By extending thread class.
//  2. By implementing Runnable interface

//  1.By extending thread class.
// class MyThread1 extends Thread{
//     @Override
//     public void run() {
//         while(true){
//             System.out.println("Thread1");
//             System.out.println("Happy");
//         }
//     }
// }
// class MyThread2 extends Thread{
//     @Override
//     public void run() {
//         while(true){
//             System.out.println("Thread2");
//             System.out.println("Sad");
//         }
//     }
// }

// public class V30_Multithreading {
//     public static void main(String[] args) {
//         MyThread1 mt1 = new MyThread1();
//         MyThread2 mt2 = new MyThread2();
//         mt1.start();
//         mt2.start(); // to run Thread
//     }
// }
// If threading was not there MyThread1 would have run first and after its completion MyThread2 would have run.

// It will give some amount of time and print run() of MyThread1 and sometimes it will print run() of MyThread2
// Thread1
// Happy
// Thread1
// Happy
// Thread1
// Happy
// Thread2
// Sad
// Thread2
// Sad
// Thread2
// Sad
// Thread2
// Sad
// Thread1
// Happy
// Thread1
// Happy

//  2. By implementing Runnable interface

class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread1");
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread2");
        }
    }
}

public class V30_Multithreading {
    public static void main(String[] args) {
        // Analogy - u need both guna nd bullet to shoot
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
// Thread1
// Thread1
// Thread2
// Thread1
// Thread2
// Thread1
// Thread2
// Thread1