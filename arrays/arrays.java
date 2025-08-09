package arrays;
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

// // ================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
// //                             Max subarray sum - I (Brute force)

// public class arrays{

// public static void maxSubArrays(int numbers[]) {
//     int currSum = 0;
//     int maxSum=Integer.MIN_VALUE;
//     for(int i=0;i<numbers.length;i++){
//         int start = i;
//         for(int j=i;j<numbers.length;j++){
//             int end = j;
//             currSum=0;
//             for(int k=start;k<=end;k++){
//                 currSum+=numbers[k];
//             }
//             if(currSum>maxSum){
//                 maxSum=currSum;
//             }
//         }
//     }
//    System.out.print(maxSum);
//     }    

//     public static void main(String[] args) {
//     int numbers[] = {1,-2,6,-1,3};
//    maxSubArrays(numbers);
//     }
// }


// ================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
//                             Max subarray sum - II (prefix sum)

// public class arrays{

// public static void maxSubArrays(int arr[]) {
//    int prefixSum[]=new int [arr.length];
//    prefixSum[0]=arr[0];
//    int currSum=0;
//    int maxSum=Integer.MIN_VALUE;
//    for(int i=1;i<arr.length;i++){
//     prefixSum[i]=prefixSum[i-1]+arr[i];
//    }

//    for(int i=0;i<arr.length;i++){
//     int start = i;
//     for(int j=i;j<arr.length;j++){
//         int end=j;
//         currSum = start==0?prefixSum[end] : prefixSum[end]-prefixSum[start-1];
//         if(currSum>maxSum){
//             maxSum=currSum;
//         }
//     }
//    }
//    System.out.println(maxSum);
    
//     }    
//     public static void main(String[] args) {
//     int arr[] = {1,-2,6,-1,3};
//    maxSubArrays(arr);
   
//     }
// }
//==============================================================================================================================================


//Max Subarray Sum -III (Kadane's Algorithm)

// public class arrays{
// public static void Kadanes(int arr[]) {
//     int maxSum = arr[0]; // Start with the first element
//     int currentSum = arr[0];

//     for (int i = 1; i < arr.length; i++) {
//         currentSum = Math.max(arr[i], currentSum + arr[i]);
//         maxSum = Math.max(maxSum, currentSum);
//     }

//     System.out.println("Our max subarray sum is: " + maxSum);
// }

//     public static void main(String[] args) {
//     int arr[] = {-2,-3,4,-1,-2,1,5,-3};
//    Kadanes(arr);
   
//     }
// }

 

// public class arrays {

//     public static void trappingWater(int height[]){
//         int leftMax [] = new int [height.length];
//         int rightMax [] = new int [height.length];
// int min = Integer.MAX_VALUE;
// int max = Integer.MIN_VALUE;


//         for(int i=0;i<height.length;i++){
//             if(height[i]<height[i+1] && height[i+1]>max){
//                 rightMax [i] = height[i+1 ];
//                 max=rightMax[i];

//             }else{
//                 if(max<rightMax[i]){
//                     max=rightMax[i];
//                 }
//                 else{
//                     rightMax[i]=max;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int height [] = {4,2,0,6,3,2,5};
//         trappingWater( height);
//     }
// }


// public class arrays {

//     public static int trappingWater(int height[]){
//       int leftMax []=new int [height.length];
//       int rightMax []=new int [height.length];
//       leftMax[0]=height[0];
//       for(int i=1;i<height.length;i++){
//         leftMax[i]=Math.max(height[i],leftMax[i-1]);
//       }
//       rightMax[height.length-1]= height[height.length-1];
//       for(int i=height.length-2;i>=0;i--){
//         rightMax [i]=Math.max(height[i], rightMax[i+1]);
//       }

//       //Loops

//       int trappedWater = 0;
//       for(int i=0;i<height.length;i++){
//         int waterLevel = Math.min(leftMax[i], rightMax[i]);
//         trappedWater += (waterLevel-height[i]);

         
//       }
//       return trappedWater;

//     }
//     public static void main(String[] args) {
//         int height [] = {4,2,0,6,3,2,5};
//      int result = trappingWater(height);
//      System.out.println(result);
//     }
// }


//Buy and sell stocks

// public class arrays {

//     public static int  buyAndSellStocks(int prices[]){
  
//       int maxProfit=0;
//       int buyingPrice=Integer.MAX_VALUE;
//   for(int i=0 ;i<prices.length;i++){
//     if(buyingPrice < prices[i]){
//       int  profit=prices[i]-buyingPrice;  //today's profit
//       maxProfit = Math.max(maxProfit, profit);  // max days profit
//     }else{
//       buyingPrice =prices[i];
//     }
//   }
//   return maxProfit;

//     }
//     public static void main(String[] args) {
//         int prices [] = {7,1,5,3,6,4};
       
//    System.out.println(buyAndSellStocks(prices));
//     }
// }





// class arrays {
//     public static int maximumProfit(int prices[]) {
//         // Code here
//         int buyingPrice = Integer.MAX_VALUE;
//         int maxProfit =0;
//         for(int i=0;i<prices.length;i++){
//             if(buyingPrice < prices[i]){
//                 int profit = prices[i]-buyingPrice;
//                 maxProfit = Math.max(profit,maxProfit);
//             }else{
//                 buyingPrice = prices[i];
//             }
//         }
//          return maxProfit;
//     }
    
//     public static void main(String args[]){
//         int prices[]={7,10,1,3,6,9,2};
//         System.out.print(maximumProfit(prices));
//     }
   
// }
