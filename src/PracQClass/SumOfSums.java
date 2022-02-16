package PracQClass;

public class SumOfSums {


    static class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
        }
    }
    //int front = -1, rear = -1;
    Node Rear = null;
    Node Front = null;
    public void enqueue(String data)
    {
        Node n =new Node(data);
        if(Front == null && Rear==null)
        {
            Front = Rear = n;
        }
        else {
            Rear.next=n;
            Rear=n;
        }

    }
    public void display()
    {
        while(Front != null)
        {
           System.out.println(Front.data);
            Front=Front.next;
        }
    }

    public static void main(String[] args) {
        if(args.length>3)
        {
            System.out.println("Please specify less than 3 strings");
            return;
        }
        SumOfSums obj = new SumOfSums();
        for (String arg : args) {
            int n = Integer.parseInt(arg);
            int res = 0;
            for (int j = arg.length(); j > 0; j--) {
                res = res + j * (n % 10);
                n = n / 10;
            }
            String snew = String.valueOf(res);
            obj.enqueue(snew);

        }
        obj.display();

    }

}
