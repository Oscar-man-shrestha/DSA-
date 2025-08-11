// import java.util.*;

// public class Matrices {
//     public static void main(String[] args) {
        
//         int matrix [][] =new int [3][3];
//         Scanner sc = new  Scanner(System.in);

//         int n=matrix.length;
//        int m= matrix[0].length;
//         for (int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
// matrix[i][j]=sc.nextInt();
//             }
//         }
//  for (int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
// System.out.print(matrix[i][j]+" "); 
//             } 
//             System.out.println();
//         }
//     }
// }


// import java.util.*;

// public class Matrices {

//     public static boolean search (int matrix[][],int key){
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==key){
//                     System.out.println("Found at index "+i+","+j);
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int matrix [][] =new int [3][3];
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         search(matrix, 4);
      
//     }
// }


// import java.util.*;

// public class Matrices {

//     public static boolean search (int matrix[][],int key){
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==key){
//                     System.out.println("Found at index "+i+","+j);
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int matrix [][] =new int [3][3];
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         search(matrix, 4);
      
//     }
// }


// import java.util.*;

// public class Matrices {

//     public static void spiralMatrix (int arr[][]){
//       int startRow = 0;
//       int startCol = 0;
//       int endRow = arr.length-1;
//       int endCol = arr[0].length-1;

//       while(startRow<=endRow && startCol<=endCol){
//         for(int j=startCol;j<=endCol;j++){
//            System.out.print(arr[startRow][j]+" ");
//             }
//             for(int i=startRow+1;i<=endRow;i++){
//                 System.out.print(arr[i][endCol]+" ");
//             }
//             for(int j=endCol-1;j>=startCol;j--){
//                 if(startCol==endCol){
//                     break;
//                 }
//                 System.out.print(arr[endRow][j]+" ");
//             }
//             for(int i=endRow-1;i>=startRow+1;i--){
//                 if(startRow==endRow){
//                     break;

//                 }
//                 System.out.print(arr[i][start]+" ");
//             }
//             startRow++;
//             startCol++;
//             endCol--;
//             endRow--;
//         }
//         System.out.println();
//       }


    
//     public static void main(String[] args) {
//         int arr[][] = {
//              {1,2,3,4},
//              {5,6,7,8},
//             {9,10,11,12},
//             {13,14,15,16}
//         };
//         spiralMatrix(arr);
//     }
// }


// import java.util.*;

// public class Matrices {

//     public static void spiralMatrix (int arr[][]){
//       int startRow = 0;
//       int startCol = 0;
//       int endRow = arr.length-1;
//       int endCol = arr[0].length-1;

//       {
//         for(int j=startCol;j<=endCol;j++){
//            System.out.print(arr[startRow][j]+" ");
//             }
//             for(int i=startRow+1;i<=endRow;i++){
//                 System.out.print(arr[i][endCol]+" ");
//             }
//             for(int j=endCol-1;j>=startCol;j--){
//                 if(startCol==endCol){
//                     break;
//                 }
//                 System.out.print(arr[endRow][j]+" ");
//             }
//             for(int i=endRow-1;i>=startRow+1;i--){
//                 if(startRow==endRow){
//                     break;

//                 }
//                 System.out.print(arr[i][startCol]+" "); 
//             }
//             startRow++;
//             startCol++;
//             endCol--;
//             endRow--;
//         }
//         System.out.println();
//       }


//       public static int PdiagonalMatrixsum(int arr[][]){
//         int sum=0;
//         for(int i =0;i<arr.length;i++){
//             sum+=arr[i][i];

//             if(i!=arr.length-i-1)
//             sum+=arr[i][arr.length-1-i];

        
//         }
//         return sum;
//       }
   


    
//     public static void main(String[] args) {
//         int arr[][] = {
//              {1,2,3,4},
//              {5,6,7,8},
//             {9,10,11,12},
//             {13,14,15,16}
//         };
//         // spiralMatrix(arr);
//        int sum =  PdiagonalMatrixsum(arr);
//        System.out.println(sum);
       
//     }
// }





// import java.util.*;

// public class Matrices {

//     public static boolean stairCaseSearch (int arr[][],int key){
//         int row = 0, col = arr[0].length - 1;

//         while (row < arr.length && col >= 0) {
//             if (arr[row][col] == key) {
//                 System.out.println("Found key at (" + row + "," + col + ")");
//                 return true;
//             } else if (key < arr[row][col]) {
//                 col--;
//             } else {
//                 row++;
//             }
//         }
//         System.out.println("Key not found!!");
//         return false;
//     }
     
    
      


      
      
   


    
//     public static void main(String[] args) {
//         int arr [][]={
//             {10,20,30,40},
//             {15,25,35,45},
//             {27,29,37,48},
//             {32,33,49,50}
//         };
//         int key=33;
//         stairCaseSearch(arr,key);
       
//     }
// }



//Sorted array stair case search


import java.util.*;

public class Matrices {

    public static boolean stairCaseSearch (int arr[][],int key){
        int row = arr.length - 1;
        int col = 0;

        while (row >=0 && col<arr[0].length) {
            if (arr[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            } else if (key < arr[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("Key not found!!");
        return false;
    }
     
    
      


      
      
   


    
    public static void main(String[] args) {
        int arr [][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,49,50}
        };
        int key=30;
        stairCaseSearch(arr,key);
       
    }
}

