package Queue;

//FIFO
//Enqueue -> add
//Dequeue -> remove

public class QueueImpl {
  int front;
  int rear;
  int capacity;
  int noOfItems;

  int arr[];

  //Constructor method
  QueueImpl(int size){
    capacity=size;
    front=0; //empty 
    rear=-1; //empty
    arr = new int[size];
  }

  //Check if the queue is full
  Boolean isFull(){
    return rear+1 == capacity;
  }

  // Add data
  void enqueue(int data){
    if (isFull()) {
        System.out.println("Queue is Full!");
    }else{
        rear++;
        arr[rear] = data;
        System.out.println("added " + data);
    }
  }

  //Check if the queue is empty
  Boolean isEmpty(){
    return front>rear;
  }

  //Remove data
  void dequeue(){
    if (isEmpty()) {
        System.out.println("Queue is empty");
    }else{
        System.out.println("Removed "+ arr[front]);
        front++;
    }
  }

  //Print queue
  void printQueue(){
    System.out.println("Elements in queue");
    for(int i = front; i<=rear;i++){
        System.out.print(arr[i] +" ");
    }
  }
  

  public static void main(String[] args) {
    QueueImpl myQueue = new QueueImpl(5);
    myQueue.enqueue(10);
    myQueue.enqueue(20);
    myQueue.enqueue(30);

    myQueue.dequeue();

    myQueue.printQueue();


  }

}
