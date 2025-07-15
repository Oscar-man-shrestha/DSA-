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


// import java.util.Scanner;

// public class arrays {
//     public static int getLargest(int numbers[]) {
//         int currentLargestNumber = Integer.MIN_VALUE;  // - infinity
//         int currentSmallestNumber = Integer.MAX_VALUE; // + infinity
//         for(int i=0;i<numbers.length;i++){
//             if(currentLargestNumber < numbers[i]){
//                 currentLargestNumber = numbers[i];
//             }
//             if(currentSmallestNumber > numbers[i]){
//                 currentSmallestNumber = numbers[i];
//             }
//         }
//           System.out.println("Smallest number in a given array : " + currentSmallestNumber);
//          return currentLargestNumber;
        
         
//     }
//     public static void main(String[] args) {
//        int numbers [] = {1,2,6,3,5};
//        System.out.print("Largest number in a given array : " + getLargest(numbers));
//     }
// }


//================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
//                             binary Search 

// import java.util.Scanner;

// public class arrays {
//    public static int binarySearch(int numbers[], int key) {
//     int start = 0, end = numbers.length - 1;

//     // Keep searching while start index is less than or equal to end index
//     while (start <= end) {
//         int mid = (start + end) / 2;

//         if (numbers[mid] == key) {
//             return mid; // Key found, return index
//         }

//         if (numbers[mid] < key) {
//             start = mid + 1; // Key must be in the right half
//         } else {
//             end = mid - 1; // Key must be in the left half
//         }
//     }

//     return -1; // Key not found
// }

//     public static void main(String[] args) {
//        int numbers[]={2,4,6,8,10,12,14};
//        int key=10;
//        System.out.println("Index for key is : "+binarySearch(numbers, key));
//     }
// }


//================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
//                             Reverse an Array

// import java.util.Scanner;

// public class arrays {
//    public static void reverseArray(int numbers[]) {
//     int first = 0,last = numbers.length-1;
//     while(first<last){
//         int temp = numbers[last];
//         numbers[last]=numbers[first];
//         numbers[first]=temp;
//         first++;
//         last--;
//     }
// }

//     public static void main(String[] args) {
//      int numbers[]={2,4,6,8,10};
//      reverseArray(numbers);
//      for(int i=0;i<numbers.length;i++){
//         System.out.print(numbers[i]+" ");
//      }
//     }
// }
 
//================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
//                             pairs in an Array

// import java.util.Scanner;

// public class arrays {
//    public static void pairsInArray(int numbers[]) {
//     for(int i=0;i<numbers.length;i++){
//         int currentNumbers = numbers[i];
//         for(int j=i+1;j<numbers.length;j++){
//             System.out.println("("+currentNumbers+","+numbers[j]+")");
//         }
//     }
// }

//     public static void main(String[] args) {
//     int numbers[] = {2,4,6,8,10};
//     pairsInArray(numbers);
//     }
// }

 
// ================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
//                             print subarrays

// import java.util.Scanner;

// public class arrays {

//    public static void subarrays(int numbers[]) {
//     int ts=0;
//     for(int i=0;i<numbers.length;i++){
//         int start = i;
//         for(int j=i;j<numbers.length;j++){
//             int end = j;
//             for(int k=start;k<=end;k++){
//                 System.out.print(numbers[k]+" ");
//         }
//         ts++;
//         System.out.println();
//         }
//         System.out.println();
//     }
//     System.out.println("Total subarrays ="+ts);
// }
//     public static void main(String[] args) {
//     int numbers[] = {2,4,6,8,10};
//    subarrays(numbers);
//     }
// }

// ================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
//                             Max subarray sum (Brute force)

public class arrays {

   public static void maxSubArrays(int numbers[]) {
    int currentSum=0;
    int maxSum=Integer.MIN_VALUE;

    for(int i=0;i<numbers.length;i++){
        int start = i;
        for(int j=i;j<numbers.length;j++){
            int end = j;
            currentSum=0;
            for(int k=start;k<=end;k++){
               currentSum +=numbers[k];
 }
 System.out.println(currentSum);
               if(maxSum< currentSum){
                maxSum=currentSum;
               }
       
       
        
        }
       
    }
    System.out.println("Max sum = "  + maxSum);
}
    public static void main(String[] args) {
    int numbers[] = {1,-2,6,-1,3};
   maxSubArrays(numbers);
    }
}