package linkedlist;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
    }
}
 class LinkedListPracMet {
    Node head;
    public  void insertAtBeginning(Node newnode)
    {
        newnode.next=head;
        head=newnode;

    }

    public void insertAtLast(Node newnode)
    {
        if(head==null)
            head = newnode;
        else {
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next=newnode;
        }

    }

    public void deleteFromBeginning()
    {
        if(head==null)
            System.out.println("empty");
        else
            head=head.next;
    }

    public void deleteFromEnd()
    {
        Node temp=head;
        if(head==null)
            System.out.println("Empty List");
        else
        {
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
    }

     public boolean search(Node head, int x)
     {
         Node current = head;
         while (current != null)
         {
             if (current.data == x)
                 return true;
             current = current.next;
         }
         return false;
     }

     public void display()
    {
        Node temp = head;
        while(temp!=null)
            {
                System.out.print(temp.data+"  ");
                temp=temp.next;
            }
    }
}
public class LinkedListPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListPracMet ll = new LinkedListPracMet();
        System.out.println("Enter elements : ");
        Node n1 =  new Node(sc.nextInt());
        ll.insertAtBeginning(n1);
        Node n2 =  new Node(sc.nextInt());
        ll.insertAtLast(n2);
        Node n3 = new Node(sc.nextInt());
        ll.insertAtLast(n3);
        System.out.println("Linked List: ");
        ll.display();
        System.out.println("\nEnter element to be searched : ");
        int x =sc.nextInt();

        if (ll.search(ll.head, x))
            System.out.println(x+" is present in Linked List");
        else
            System.out.println(x+" is not present in Linked List");
        ll.deleteFromBeginning();
        System.out.println("After deletion from beginning");
        ll.display();
        System.out.println("\nAfter deletion from end");
        ll.deleteFromEnd();
        ll.display();
    }
}
