package Strings;
public class StringDemo {
    public static void printLetters(String str) {
        for(int i=0;i<str.length();i++){
            System.out.println("Index "+i+" -> "+str.charAt(i));
        }
        
    }

    public static boolean checkPalindrome (String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                
                return true;
            }
        }
        return false;

    }

    public static void shortestDistance(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W'){
                x--;
            }
            if(str.charAt(i)=='N'){
                y++;
            }
            if(str.charAt(i)=='S'){
                y--;
            }
            if(str.charAt(i)=='E'){
                x++;
            }
        }
        System.out.println("The shortest path will be "+Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
    }

    public static void largestString(String[] arr) {
        String largest = arr[0];
        for(int i=1;i<arr.length;i++){
             if(largest.compareTo(arr[i])<0){
                largest=arr[i];
             }

       
        }
        System.out.println(largest);
       
    }

    public static void main(String[] args) {

        String str ="racecar";
        String str1 = "WNEENESENNN";
        // printLetters(str);
       boolean check= checkPalindrome(str);
       System.out.println(check);

       
       shortestDistance(str1);



       String arr[] = {"apple", "mango", "banana "};
       largestString(arr);
    }
}
