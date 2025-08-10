public class Patterns2 {

    public static void hollowRectangle(int totalRows,int totalCols) {
        for(int i=1;i<=totalRows;i++){
            for(int j=1;j<=totalCols;j++){
                if(i==1||i==totalRows||j==1||j==totalCols){
                 System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedHaldPyramid(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
              System.out.println();
        }
      
    }


      public static void halfPyramid(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

        public static void floydsTriangle(int n) {
            int count = 1;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
            System.out.print(count+" ");
            count++;
           }
           System.out.println();
        }
    }


     public static void zeroOne(int n) {
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
           if((i+j)%2==0){
            System.out.print("1");
           }
           else{
            System.out.print("0");
           }
           }
           System.out.println();
        }
    }


    public static void butterfly(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

   
    public static void hollowRhombus(int n) {
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                 System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }

    public static void diamond(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
         for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

    }


    public static void main(String[] args) {
       hollowRectangle(4, 5);
       invertedHaldPyramid(4);
       halfPyramid(5);
       floydsTriangle(5);
       zeroOne(5);
       butterfly(5);
       solidRhombus(5);
       hollowRhombus(5);
       diamond(4);
    }
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Output : 
// *****
// *   *
// *   *
// *****


//    *
//   **
//  ***
// ****


// 12345
// 1234
// 123
// 12
// 1

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 

// 1
// 01
// 101
// 0101
// 10101


// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *

//     *****
//    *****
//   *****
//  *****
// *****


//     *****
//    *   *
//   *   *
//  *   *
// *****

//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



