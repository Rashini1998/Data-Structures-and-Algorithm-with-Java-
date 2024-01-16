package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;
        quicksort(arr);
        System.out.println("Sorted Array:");
        printarray(arr);
    }

    public static void quicksort(int arr[]){
        quicksort(arr,0,arr.length-1);
    }

    public static void quicksort(int arr[],int left, int right){
        if(left>=right){
            return;
        }

        int pivot = arr[(left+right)/2];
        int index = partition(arr,left,right,pivot);
        quicksort(arr, left, index-1);
        quicksort(arr, index, right);

    }

    public static int partition(int arr[],int left, int right, int pivot){
       while (left<=right) {
        while (arr[left]<pivot) {
            left++;
        }
        while (arr[right]>pivot) {
            swap(arr,left,right);
            left++;
            right--;
        }
       }
        return left;

    }

    public static void swap(int arr[], int left, int right){
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
