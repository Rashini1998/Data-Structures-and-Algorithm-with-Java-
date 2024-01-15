package Stack;
public class StackImpl {
        int arr[];
        int top; //top element
        int capacity; //size
        
        //Constructor method -> to create stack
        StackImpl(int size){
            arr = new int[size];
            capacity = size;
            top = -1;
        }

       //Check if the stack is full 
       Boolean isFull(){
        return top +1 == capacity;
       }

       void push(int x){
        if (isFull()) {
            System.out.println("Stack is full. - Over flow!");
        }else{
            //insert data
            top++;
            arr[top] = x;
            System.out.println("Inserting : "+ x); 
        }

       }

       //Check if the Stack is empty
       Boolean isEmpty(){
        return top == -1;
       }

       void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
        }else{
            System.out.println("Removing : "+ top+ " --> "+ arr[top]);
            top--;
        }

       }

       //Print stack data
       void printStack(){
        System.out.println("Elements in the stack: ");
        for (int i=0; i<=top;i++) {
            System.out.println(arr[i]);
        }
       }

        public static void main(String[] args) {
            StackImpl myStack = new StackImpl(5);

            myStack.push(10);
            myStack.push(20);
            myStack.push(30);
            myStack.push(40);
            myStack.push(50);
            myStack.push(60); //overflow

            myStack.printStack();
            
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop(); //empty

            

        }
}
