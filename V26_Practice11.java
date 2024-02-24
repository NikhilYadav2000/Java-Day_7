// 1 and 2
// abstract class Pen {
//     abstract void write();

//     abstract void refill();
// }

// class FountainPen extends Pen {
//     public void write() {
//         System.out.println("Write");
//     }

//     public void refill() {
//         System.out.println("Refill");
//     }

//     public void changeNib() {
//         System.out.println("Change Nib");
//     }
// }

// public class V26_Practice11 {
//     public static void main(String[] args) {
//         FountainPen pen = new FountainPen();
//         pen.write(); // Write
//         pen.refill(); // Refill
//         pen.changeNib(); // Change Nib
//     }
// }

// 3 and 5
// class Monkey {
//     public void jump() {
//         System.out.println("Jump");
//     }

//     public void bite() {
//         System.out.println("Bite");
//     }
// }

// interface BasicAnimal {
//     void eat();
//     void speak();
// }

// class Human extends Monkey implements BasicAnimal{
//     public void eat() {
//         System.out.println("Eat");
//     }
//     public void speak(){
//         System.out.println("Speak");
//     }
// }

// public class V26_Practice11 {
//     public static void main(String[] args) {
//         Human human = new Human();
//         human.eat(); // Eat
//         human.speak();  // Speak
//         human.bite();   // Bite
//         human.jump();   // Jump

//         Monkey monkey = new Monkey();
//         monkey.jump();

//          BasicAnimal ba = new BasicAnimal();
//          ba.eat();
//     }
// }

// 4
abstract class TelePhone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartPhone extends TelePhone {
    public void ring() {
        System.out.println("Ring");
    }

    public void lift() {
        System.out.println("Lift");
    }

    public void disconnect() {
        System.out.println("disconnect");
    }

    public void smartphone() {
        System.out.println("smartphoone");
    }
}

public class V26_Practice11 {
    public static void main(String[] args) {
        TelePhone tp = new SmartPhone();
        tp.ring();
        tp.lift();
        tp.disconnect();
        // tp.smartPhone(); // Not possible

        SmartPhone sp = new SmartPhone();
        sp.smartphone();
        sp.ring();
        sp.lift();
        sp.disconnect();
    }
}
/*
 * Ring
 * Lift
 * disconnect
 * smartphoone
 * Ring
 * Lift
 * disconnect
 */


// 6 and 7
// interface SmartTvRemote{
// void smartPhone();
// }
// interface TVRemote extends SmartTvRemote{
// void tvRemote();
// }
// class Tv implements TVRemote{
// public void smartPhone(){
// System.out.println("smartPhone");
// }
// public void tvRemote(){
// System.out.println("tvRemote");
// }
// }
// public class V26_Practice11{
// public static void main(String[] args) {
// Tv tv = new Tv();
// tv.smartPhone();
// tv.tvRemote();
// }
// }