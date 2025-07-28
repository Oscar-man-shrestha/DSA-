public class RecursiveSorts {



    // ===== Recursive Bubble Sort =====
    // static void bubbleSort(int[] arr, int n) {
    //     if (n == 1) return;

    //     for (int i = 0; i < n - 1; i++) {
    //         if (arr[i] > arr[i + 1]) {
    //             // Swap
    //             int temp = arr[i];
    //             arr[i] = arr[i + 1];
    //             arr[i + 1] = temp;
    //         }
    //     }

    //     bubbleSort(arr, n - 1);
    // }


    public static void bubbleSort (int arr[],int n){
        if(n==0) return;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                //swap

                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=arr[i];
            }
        }
        bubbleSort(arr, n-1);
    }












    // ===== Recursive Selection Sort =====
    static void selectionSort(int[] arr, int start) {
        int n = arr.length;
        if (start >= n - 1) return;

        int minIndex = start;
        for (int i = start + 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Swap min with start
        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;

        selectionSort(arr, start + 1);
    }




    

    // ===== Utility: Print Array =====
    static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }









    // ===== Main Method =====
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 1, 4, 2};
        int[] arr2 = {64, 25, 12, 22, 11};

        System.out.println("Original Bubble Sort Array:");
        printArray(arr1);
        bubbleSort(arr1, arr1.length);
        System.out.println("After Recursive Bubble Sort:");
        printArray(arr1);

        System.out.println("\nOriginal Selection Sort Array:");
        printArray(arr2);
        selectionSort(arr2, 0);
        System.out.println("After Recursive Selection Sort:");
        printArray(arr2);
    }
}
 
    

