// public class function {

//     public static int multiply (int a ,int b){
// int product=a*b;
// return product;
//     }
//     public static void main(String[] args) {
//         int a =3;
//         int b=5;
//        int product= multiply(a, b);
//        System.out.println(product);
//     }
// }




// public class function {

//    public static int factorial (int a) {
//     int fact=1;
//     for(int i=1;i<=a;i++){
//      fact = fact*i;
       
//     }
//      return fact;
//    }
//     public static void main(String[] args) {
//         int a =4;
    
//        int fact= factorial(a);
//        System.out.println(fact);
//     }
// }


// public class function {

//    public static boolean primeNumbers (int n) {
//     boolean isPrime=true;
//     // for(int i=2;i<=n-1;i++){
//     //     if(n%i==0) //completely dividing
//     //     isPrime=false;
//     // } //Not optimised way

//     for(int i=2;i<=Math.sqrt(n);i++){
//         if(n%i==0) //completely dividing
//         isPrime=false;
//     }
//      return isPrime;
//    }
//     public static void main(String[] args) {
//         int n =3;
    
//        boolean prime= primeNumbers(n);
//       if(prime){
//         System.out.println("YES,Its prime");
//       }
//       else{
//         System.out.println("Its not prime");
//       }
//     }
// }


// public class function {

//    public static boolean isPrime (int n) {

//     for(int i=2;i<=Math.sqrt(n);i++){
//         if(n%i==0) //completely dividing
//         return false;
//     }
//      return true;
//    }

//    public static void primeInRange(int n) {
//     for(int i=2;i<=n;i++){
//         if(isPrime(i)){
// System.out.println(i+ " ");
//         }
//     }
//    }
//     public static void main(String[] args) {
//        primeInRange(20);
//     }
// }


// Decimal To Binary

// public class function {

//  public static int binaryToDecimal(int binNum) {
//     int dec = 0;
//     int pow = 0;
   
//     while(binNum>0){
//         int lastDigit =binNum%10;
//         decNum=decNum+(lastDigit * (int)Math.pow(2,pow));
// pow++;
// binNum=binNum/10;
//     }
//  }
//     public static void main(String[] args) {
//       int biNum=10101;
//       binaryToDecimal(biNum);
//     }
// }


//Decimal To Binary

public class function {

 public static void binaryToDecimal(int binNum) {
   int myNum = binNum;
    int pow = 0;
    int decNum = 0;
   
    while(binNum>0){
        int lastDigit =binNum%10;
        decNum=decNum+(lastDigit * (int)Math.pow(2,pow));
pow++;
binNum=binNum/10;
    }
    System.out.println("decimal of "+myNum+" = "+decNum);
 }


 public static void decimalToBinary(int n) {
  int myNum = n;
  int pow = 0;
  int binNum = 0;
  while(n>0){
    int rem = n%2;
    binNum = binNum + (rem*(int)Math.pow(10, pow));
    pow++;
    n=n/2;  

  }
  System.out.println("Binary form of "+myNum+" = "+binNum);
 }
    public static void main(String[] args) {
     binaryToDecimal(111);
      decimalToBinary(7);
    }
}

