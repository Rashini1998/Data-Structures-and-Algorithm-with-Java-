package Array;
import java.util.Scanner;
public class ArrayImp{
    public static void main(String args[]){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Number of elements in the array: ");
            int size = scanner.nextInt(); 

            int[] arr = new int[100];

            System.out.println("Enter Elements: ");
            for(int i=0;i<size;i++){
                arr[i] = scanner.nextInt();
            }
            System.out.println("Output Array:");
            for(int i=0;i<size;i++){
                System.out.println(arr[i]);
            }

            //Insert element in the middle of the array
            System.out.println("Enter the index :");
            int index = scanner.nextInt();

            System.out.println("Enter the data element: ");
            int data = scanner.nextInt();

            size++;

            for(int i=size;i>=index;i--){
                arr[i]=arr[i-1];
            }
            arr[index] = data;

            System.out.println("New Output Array:");
            for(int i=0;i<size;i++){
                System.out.println(arr[i]);
            }

            //delete the data
            System.out.println("Enter index of the element to be deleted: ");
            int del = scanner.nextInt();

            for(int i=del;i<size;i++){
                arr[i]=arr[i+1];
            }
            size--;
            System.out.println("New Output Array:");
            for(int i=0;i<size;i++){
                System.out.println(arr[i]);
            }

            //Search data
            System.out.println("Enter search data:");
            int search=scanner.nextInt();
            for(int i=0;i<size;i++){
                if (arr[i]==search) {
                    System.out.println(i);
                    break;  
                }

            }

            //Update data in the array
            System.out.println("Enter index to be updated:");
            int update = scanner.nextInt();

            System.out.println("Enter new data");
            int newData = scanner.nextInt();

            arr[update] = newData;
            System.out.println("New Updated Array:");
            for(int i=0;i<size;i++){
                System.out.println(arr[i]);
            }
        }
    }
}