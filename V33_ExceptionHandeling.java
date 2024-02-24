// // // Try catch block
// // public class V33_ExceptionHandeling {
// //     public static void main(String[] args) {
// //         // int a = 6000;
// //         // int b =0;
// //         // int c = a/b;
// //         // System.out.println(c); // Throws exception
// //         int a = 6000;
// //         int b = 0;
// //         try {

// //             int c = a / b;
// //         } catch (Exception e) {
// //             System.out.println("We failed to divide");
// //             System.out.println(e);
// //         }
// //         System.out.println("end of program");
// //         /*
// //          * We failed to divide
// //          * java.lang.ArithmeticException: / by zero
// //          * end of program
// //          */
// //     }
// // }


// import java.util.Scanner;
// public class V33_ExceptionHandeling {
//     public static void main(String[] args) {
//         int [] marks = new int[3];
//         marks[0] = 7;
//         marks[1] = 56;
//         marks[2] = 6;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the array index");
//         int ind = sc.nextInt();

//         System.out.println("Enter the number you want to divide the value with");
//         int number = sc.nextInt();
//         try{
//             System.out.println("The value at array index entered is: " + marks[ind]);
//             System.out.println("The value of array-value/number is: " + marks[ind]/number);
//         }
//         catch (ArithmeticException e){
//             System.out.println("ArithmeticException occured!");
//             System.out.println(e);
//         }
//         catch (ArrayIndexOutOfBoundsException e){
//             System.out.println("ArrayIndexOutOfBoundsException occured!");
//             System.out.println(e);
//         }
//         catch (Exception e){
//             System.out.println("Some other exception occured!");
//             System.out.println(e);
//         }
//     }
// }


// Nested Try-Catch Block
// import java.util.Scanner;
// public class V33_ExceptionHandeling{
//     public static void main(String[] args){
//         int [] marks = new int[3];
//         marks[0] = 7;
//         marks[1] = 56;
//         marks[2] = 6;
//         Scanner sc = new Scanner(System.in);
//         boolean flag = true;
//         while(flag) {
//             System.out.println("Enter the value of index");
//             int ind = sc.nextInt();
//             try {
//                 System.out.println("Welcome to video no 82");
//                 try {
//                     System.out.println(marks[ind]);
//                     flag = false;
//                 } catch (ArrayIndexOutOfBoundsException e) {
//                     System.out.println("Sorry this index does not exist");
//                     System.out.println("Exception in level 2");
//                 }
//             } catch (Exception e) {
//                 System.out.println("Exception in level 1");
//             }
//         }
//         System.out.println("Thanks for using this program");
//     }
// }


// Exception class
// import java.util.Scanner;
// class MyException extends Exception{
//     @Override
//     public String toString() {
//         return "I am toString()";
//     }

//     @Override
//     public String getMessage() {
//         return "I am getMessage()";
//     }
// }
// class MaxAgeException extends Exception{
//     @Override
//     public String toString() {
//         return "Age cannot be greater than 125";
//     }

//     @Override
//     public String getMessage() {
//         return "Make sure that the value of age entered is correct";
//     }
// }
// public class V33_ExceptionHandeling {
//     public static void main(String[] args) {
//         int a;
//         Scanner sc = new Scanner(System.in);
//         a = sc.nextInt();
//         if (a<9){
//             try{
//                 // throw  new MyException();
//                 throw new ArithmeticException("This is an exception");
//             }
//             catch (Exception e){
//                 System.out.println(e.getMessage());
//                 System.out.println(e.toString());
//                 e.printStackTrace();
//                 System.out.println("Finished");
//             }
//             System.out.println("Yes Finished");
//         }
//     }
// }


