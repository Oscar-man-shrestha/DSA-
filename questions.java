//Concept

// public class questions {
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

 public class questions{
    public static void main(String[] args) {
        int n = 10899;
        int rev=0;
        while (n>0) {
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n=n/10;
            
        }
        System.out.println(rev);
    }
 }
 //rev is worked as save for a while  file.