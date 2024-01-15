package Sorting;

public class BubbleSort {
    static void bubbeSort(int arr[]){
        int n =  arr.length;
        int temp = 0;
        boolean swap = true;
        while (swap) { 
            swap = false;
            for(int x=1;x<n;x++){
                if(arr[x-1]>arr[x]){
                    temp = arr[x-1];
                    arr[x-1]=arr[x];
                    arr[x]=temp;
                    swap=true;
                }
            }
        }


    }
    public static void main(String[] args) {
        int arr[] = {5,1,3,2,4,}; //Ascending order
        bubbeSort(arr);
        System.out.println("Sorted array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
