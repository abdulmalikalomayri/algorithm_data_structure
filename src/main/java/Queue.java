import java.util.Random;

public class Queue {

    public Node front;
    public Node rear;
    public int queueSize;
    public static int maxRandomNumber = 100;
    public static int minRandomNumber = 1;

    public Queue() {
        front = null;
        rear = null;
        queueSize = 0;
    }

    // return true if the empty
    public boolean isEmpty(){
        return (queueSize == 0);
    }

    // validate the Queue is full return greater than 10 return true
    public boolean isFull(){
        if(queueSize > 9){
            return true;
        }
        return false;
    }


    // Add node at the rear of the queue
    public void enqueue() {
        if(isFull()){
            return;
        }
        // generate a random data
        Random rand = new Random();
        int data = rand.nextInt(maxRandomNumber + minRandomNumber);

        rear= new Node();
        rear.data = data;
        rear.next = null;
        if(isEmpty()){
            front = rear;
        }
        else {
            Node tempRear = rear;
            tempRear.next = rear;
        }

        queueSize++;
        System.out.println(queueSize+"- Element "+ data +" added to the queue");
    }

    public Node dequeue(){
        var myNode = front;
        front = front.next;
        if(isEmpty()){
            rear = null;
        }
        queueSize--;
        System.out.println(myNode.data+" Element ");
        return myNode;

    }

    public Node peek(){

        return front;
    }

    // Print Front & Rear
    public void print_frontRear() {
        if(isEmpty()){
            System.out.println("Queue if Empty");
            return;
        }
        System.out.println("Front of the queue: "+ front.data + "\n" +
                "Rear of the queue: "+ rear.data);
    }
}
