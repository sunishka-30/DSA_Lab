package linkedlist;

public class T2 {
    Node head;
    static class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }
    public void insert(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
            head= newnode;
        else {
            Node temp = head;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newnode;
        }


    }
    public  void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }

    }
    public static int fibbonaci(int data)
    {
        if(data==0 || data==1)
            return data;
        return fibbonaci(data-1)+fibbonaci(data-2);
    }

    public static void main(String[] args) {
        T2 l =new T2();
        for (String arg : args) {
            int n = Integer.parseInt(arg);
            l.insert(fibbonaci(n - 1));
        }
        l.display();

    }
}
