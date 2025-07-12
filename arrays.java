// import java.util.Scanner;

// public class arrays {

   
//     public static void main(String[] args) {
        
//         // Create an Array
//         int marks[]=new int[50];
//         // int numbers[]={1,2,3};  // If you already know the data for arrays
//         // int moreNumbers[]={4,5,6};
//         // String fruits[]={"apple","mango","orange"};

//         Scanner sc=new Scanner(System.in);

//         System.out.print("Add Your marks for the subject : ");
        
//         marks[0]=sc.nextInt();
//         marks[1]=sc.nextInt();
//         marks[2]=sc.nextInt();
//         marks[3]=sc.nextInt();

//         System.out.println("phy :"+marks[0]);
//               System.out.println("chem :"+marks[1]);
//                     System.out.println("bio :"+marks[2]);
//                           System.out.println("math :"+marks[3]);





//     }
// }


// import java.util.Scanner;

// public class arrays {

//    public static void update(int marks[],int nonChangable) {
//     nonChangable=10;
//     for(int i=0;i<marks.length;i++){
//         marks[i]=marks[i]+1;
//     }
//    }
//     public static void main(String[] args) {

//         int marks[]={97,98,99};
//         int nonChangable = 5;
//         update(marks, nonChangable);

//         System.out.println(nonChangable);

//         //Print our marks
//         for(int i=0;i<marks.length;i++){
//             System.out.print(marks[i]+" ");
//         }
//         System.out.println();
//     }
// }


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//                             Linear Search
// Find the index of element in a given array


// import java.util.Scanner;

// public class arrays {

//     public static int linearSearch(int numbers[],int key) {
//        for(int i=0;i<=numbers.length;i++){
//         if(numbers[i]==key)
//         return i;
//        }
//        return -1;
//     }
//     public static void main(String[] args) {
//        int key = 4;
//        int numbers [] = {2,4,6,8,10,12,14,16};
//        int index =linearSearch(numbers, key);
//        if(index == -1){
//         System.out.print("Not Found");
//        }
//        else{
//         System.out.print("Keys is at index :"+index);
//        }
//     }
// }


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//                             Largest Number
// Find the largest number in a given array 


import java.util.Scanner;

public class arrays {
    public static int getLargest(int numbers[]) {
        int currentLargestNumber = Integer.MIN_VALUE;  // - infinity
        int currentSmallestNumber = Integer.MAX_VALUE; // + infinity
        for(int i=0;i<numbers.length;i++){
            if(currentLargestNumber < numbers[i]){
                currentLargestNumber = numbers[i];
            }
            if(currentSmallestNumber > numbers[i]){
                currentSmallestNumber = numbers[i];
            }
        }
          System.out.println("Smallest number in a given array : " + currentSmallestNumber);
         return currentLargestNumber;
        
         
    }
    public static void main(String[] args) {
       int numbers [] = {1,2,6,3,5};
       System.out.print("Largest number in a given array : " + getLargest(numbers));
    }
}