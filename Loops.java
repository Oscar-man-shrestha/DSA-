// public class Loops{
//     public static void main(String[] args) {
//         // for(int i=1;i<=4;i++){
//         //     System.out.println("****");
//         // }

//         int i=1;
//         while(i<=4){
//             System.out.println("****");
//             i++;
//         }
//     }
// }

//Concept

// public class Loops {
//     public static void main(String[] args) {
//         int n=10899;
//         int removeLastDigit = n/10;
//         System.out.println(removeLastDigit);
//         int wantLastDigit = n%10;
//         System.out.println(wantLastDigit);
//     }
// }

//If you want to remove last digit just / (divide it) if want last digit then just % (remainder ) it ..

//Print reverse of a number

//  public class Loops{
//     public static void main(String[] args) {
//         int n = 10899;
//         int rev=0;
//         while (n>0) {
//             int lastDigit = n%10;
//             rev = (rev*10)+lastDigit;
//             n=n/10;
            
//         }
//         System.out.println(rev);
//     }
//  }
 //rev is worked as save for a while  file.




 // Do while Loop 

//  public class Loops{
//     public static void main(String[] args) {
//         int counter = 1 ;
//         do{
//             System.out.println("Hello World!");
//             counter++;
//         }while(counter<=10);
//     }
//  }

// Break Statement

// public class Loops{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             if(i==3){
//                 // continue; //output : 1245I am out From Loop
//                 break; //12I am out From Loop
//             }
//             System.out.print(i);
//         }
//         System.out.println("I am out From Loop");
//     }
// }


// Check if a number is prime or not 

// prime : 2,3,5,7,11
// import java.util.*;
// public class Loops{
//     public static void main(String[] args) {

//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter value for n");
//      int n = sc.nextInt();
//      boolean isPrime = true;
//      if(n==2){
//         System.out.println("n is prime");
//      }
//      else{
// // for(int i=2;i<=n-1;i++)
// for(int i=2;i<=Math.sqrt(n);i++){
//         if(n%i==0)
//         {
//            isPrime=false;
//         }
    
//      }

//      if(isPrime){
//         System.out.println("Yes Its Prime");
//      }
//      else{
//         System.out.println("No,Its not prime");
//      }
//     }} 
//      }
     