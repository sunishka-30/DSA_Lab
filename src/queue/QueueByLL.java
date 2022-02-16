package queue;
public class QueueByLL {
    static class Noden
    {
        int data;
        Noden next;
        Noden(int data)
        {
            this.data = data;
        }
    }

    Noden Rear = null;
    Noden Front = null;
    public void enqueue(int data)
    {
        Noden n =new Noden(data);
        if(Front == null && Rear==null)
        {
            Front = Rear = n;
        }
        else {
            Rear.next=n;
            Rear=n;
        }

    }
    public void dequeue()
    {
        if(Front==null)
        {
            System.out.println("Underflow");
        }
        else {
            System.out.println(Front.data);
            Front=Front.next;
        }
    }
    public void display()
    {   Noden  head = Front;
        while(head != null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueByLL o = new QueueByLL();
        o.enqueue(10);
        o.enqueue(20);
        o.enqueue(30);
        o.enqueue(40);
        o.enqueue(50);
        o.display();
        o.dequeue();
        o.display();
        o.dequeue();
        o.display();
    }

}
