// class Mythr extends Thread {
//     Mythr(String name) {
//         super(name);
//     }

//     public void run() {
//         // int i =34;
//         // System.out.println("Thanku");
//         // // while(true){
//         // // System.out.println("I m a thread");
//         // // }
//     }
// }

// public class V31_ThreadCycle {
//     public static void main(String[] args) {
//         Mythr t = new Mythr("Nikhil");
//         t.start();
//         System.out.println("id = " + t.threadId()); // tells id of the thread.
//         System.out.println("name = " + t.getName());
//     }
// }
/*
 * id = 21
 * name = Nikhil
*/

// Thread Priority
// class Mythr extends Thread {
//     Mythr(String name) {
//         super(name);
//     }

//     public void run() {
//         System.out.println("Thanku "+this.getName());
//         while(true){
//         System.out.println("I m a thread");
//         }
//     }
// }

// public class V31_ThreadCycle {
//     public static void main(String[] args) {
//         Mythr t1 = new Mythr("Ni");
//         Mythr t2 = new Mythr("Nkh"); 
//         Mythr t3 = new Mythr("il");
//         t2.setPriority(Thread.MAX_PRIORITY); // it will be printed most number of time
//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }

class Mythr extends Thread {
    Mythr(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thanku "+this.getName());
        while(true){
        System.out.println("I m a thread");
        }
    }
}

public class V31_ThreadCycle {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("Ni");
        Mythr t2 = new Mythr("Nkh"); 
        // if u want t2 to start after t1 ends then
        t1.start();
        try{
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
        // t2 will end first thn t1 will start
    }
}