package LinkedLists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListImpl {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList(List.of(1,2,3));
        arr.add(12);
        System.out.println(arr);
        arr.addFirst(60);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);

        arr.forEach(n->System.out.println(n*10));
    }
    
}
