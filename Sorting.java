                                //   Bubble sort

public class Sorting {
    public static void bubbleSort(int n,int arr[]) {
        for(int i=0;i<n-1;i++){  //This for loop is for passes
            for(int j=0;j<n-1-i;j++){ //This loop is for current and one step more element in array
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printBubbleArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" <------ Bubble sort");
    }




    // Selection Sort


     public static void selectionSort(int n,int arr[]) {
    //    for(int i=0;i<n-1;i++){
    //     int minPos = i;
    //     for(int j=i+1;j<n;j++){
    //         if(arr[j]<arr[minPos]){
    //             minPos=j;
    //         }
    //     }
    //     //swap
    //     int temp = arr[minPos];
    //     arr[minPos] = arr[i];
    //     arr[i] = temp;
    //    }


    // for (int i=0;i<n-1;i++){
    //     int minPos = i;
    //     for(int j=i+1;j<n;j++){
    //         if(arr[minPos]>arr[j]){
    //             minPos=j;
    //         }
    //     }
    //     int temp = arr[minPos];
    //     arr[minPos]=arr[i];
    //     arr[i]=temp;
    // }

    for(int i=0;i<n-1;i++){
        int minPos=i;
        for(int j=i+2;j<n;j++){
            if(arr[minPos]>arr[j]){
                minPos=j;
            }
        }
        //swap
        int temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
    }


    }
        public static void printSelectionArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(" <------ Selection Sort");
    }


    
    public static void main(String[] args) {
        int arr []={5,4,1,3,2};
        int n = arr.length;
        bubbleSort(n,arr);
        printBubbleArr(arr);

          selectionSort(n, arr);
       
         printSelectionArray(arr);

    }
}






