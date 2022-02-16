package queue;
import java.util.Scanner;

    public class QueueByArray {
        int[] arr;
        int front,rear;

        public QueueByArray(int size) {
            arr = new int[size];
            this.front = -1;
            this.rear = -1;
        }
        public boolean isEmpty()
        {
            return rear == -1;
        }
        public boolean isOverflow()
        {
            return rear == arr.length - 1;
        }
        public void enqueue(int val)
        {
            if(isOverflow()) {
                System.out.println("overflow");
                return;
            }
            else if(rear==-1 && front == -1)
            {
                rear++;
                front++;
                arr[rear] = val;
                return;
            }
            rear++;
            arr[rear] = val;
        }
        public void dequeue()
        {
            if(isEmpty()){
                System.out.println("empty queue, nothing to delete.");
                return;
            }
            System.out.println("Deleted element : "+arr[front]);
            arr[front] = Integer.MIN_VALUE;
            front++;
            if(front>rear)
            {
                front=rear=-1;
            }
        }
        public void display()
        {
            if(isEmpty()){
                System.out.println("empty queue, nothing to display.");
                return;
            }
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            QueueByArray ob = new QueueByArray(size);
            ob.dequeue();
            ob.enqueue(30);
            ob.enqueue(20);
            ob.enqueue(24);
            ob.display();
            ob.dequeue();
            ob.dequeue();
            ob.display();

        }
    }

