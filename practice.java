public class practice{

    public static void selectionSort(int arr [],int n) {
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;

        }
    }

 public static void printSelectionArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(" || <------ Selection Sort");
    }
    public static void main(String[] args) {
        int arr []={5,4,1,3,2};
        int n = arr.length;
       

        selectionSort(arr, n);
       
         printSelectionArray(arr);

    }
}


