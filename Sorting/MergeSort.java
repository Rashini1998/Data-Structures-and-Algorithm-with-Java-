package Sorting;

public class MergeSort {
   static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    void sort(int arr[],int l, int r){

        if (l<r) {
        //finding middle
        int mid = l + (r-l)/2;

        //sort left and right arrays
        sort(arr, l, mid);
        sort(arr, mid+1, r);

        //merge the sorted arrays
        merge(arr,l,mid,r);


        }
       
    }

    void merge(int arr[],int l, int m, int r){

        //sizes of two arrays
        int n1 = m-l+1;
        int n2 = r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        //copying the data to temp arrays
        for(int i=0;i<n1;i++){
            L[i]= arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[m+1+j];
        }

        int i=0, j=0;
        int k=l;
        while (i<n1 && j<n2) {
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        //copying remaining elements of two arrays
        while (i<n1) {
            arr[k]=L[i];
            i++;
            k++;            
        }
        while (j<n2) {
            arr[k]=R[j];
            j++;
            k++;            
        }

    }
    
    public static void main(String[] args) {
        int arr[]={12,6,7,8,10,2,9};

        System.out.println("Given array is: ");
        printArray(arr);

        MergeSort mg=new MergeSort();
        mg.sort(arr, 0, arr.length-1);

        System.out.println("\n");
        System.out.println("Sorted Array:");
        printArray(arr);


    }
}
