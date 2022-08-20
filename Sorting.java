public class Sorting {
    // bubble short
    public static void sorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp; 
                }
            }
            
           
        }
        
    }
    

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //Selection Sorting
    public static void selctionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1;j<arr.length; j++){
                if(arr[minPos]> arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sorting
public static void insertionSort(int arr[]){
    for(int i=1; i<arr.length; i++){
        int temp = arr[i];
         int prev = i-1; // prev yani pahle wala element
         while(prev>=0 && arr[prev] > temp){
            arr[prev+1] = arr[prev];
            prev--;
         }
         arr[prev+1] = temp;// kyuki prev ki value -1 hogi tab temp ka value assign
    }
}

    public static void main(String args[]) {
        int arr[] = {5,4,1,3,2,6};
       insertionSort(arr);
        print(arr);
    }
}
