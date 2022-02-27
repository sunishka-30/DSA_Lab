package linkedlist;

public class MyLL {
    static class Nodenew
    {
        int data;
        Nodenew next;

        Nodenew(int data)
        {
            this.data=data;
        }
        Nodenew(int data,Nodenew next)
        {
            this.next=next;
            this.data=data;
        }
    }
    int size=0;
    Nodenew head;
    Nodenew tail;
    public void insertBeg(int data)
    {
        Nodenew n = new Nodenew(data);
        n.next=head;
        head=n;
        if(tail==null)
            tail=head;
        size++;
    }
    public void insertlastbytail(int data)
    {
        Nodenew n = new Nodenew(data);
        size++;
        if(head.next==null)
        {

            head.next=n;
            head=n;
            return;
        }
        tail.next=n;
        tail=n;
    }
    public void insertlastbyhead(int data)
    {   size++;
        Nodenew n = new Nodenew(data);
        Nodenew temp = head;
        if(head==null)
        {
            head=n;
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;

    }
    public void insertByIndex(int data,int index)
    {
        if(index==0)
        {
            insertBeg(data);
            return;
        }
        if(index==size)
        {
            insertlastbytail(data);
            return;
        }
        Nodenew temp =head;
        for(int i=1;i<index;i++)
        {
            temp = temp.next;
        }
        temp.next= new Nodenew(data,temp.next);
        size++;
    }
    public void deletebeg()
    {
        if(head==null)
            System.out.println("empty list");
        else {
            head = head.next;
            if (head == null)
                tail = null;
            size--;
        }

    }
    public void deletelast()
    {
        size--;
        if(size<=1)
        {
            deletebeg();
            return;
        }
        tail= get(size-2);
        tail.next=null;

    }
    public Nodenew get(int index)
    {
        Nodenew n = head;
        for(int i=0;i<index;i++)
            n=n.next;
        return n;
    }
    public void deletelastByHead()
    {
        if (head == null)
            return;

        if (head.next == null) {
            return ;
        }

        // Find the second last node
        Nodenew second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;

        // Change next of second last
        second_last.next = null;

    }

    public void deleteByIndex(int index)
    {
        if(index==0)
        {
            deletebeg();
            return;
        }
        if(index==size-1)
        {
            deletelast();
            return;
        }
        Nodenew previous = get(index-1);
        previous.next=previous.next.next;
    }

    public int findInd(int data)
    {
        Nodenew temp =head;
        int index=0;
        while(temp!=null){
            if(temp.data==data)
            {
               return index;
            }
            temp=temp.next;
            index++;
        }
        System.out.println("No such element.");
        return -1;
    }

    public void displayLL()
    {
        Nodenew temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("END");

    }

    public static void main(String[] args) {
        MyLL l = new MyLL();
        l.insertBeg(10);
        l.insertBeg(20);
        l.insertBeg(30);
        l.insertlastbytail(70);
        l.insertlastbytail(80);
        l.displayLL();
        l.insertlastbyhead(200);
        l.insertlastbyhead(300);
        l.displayLL();
        l.insertByIndex(40,4);
        l.insertByIndex(250,7);
        l.displayLL();
        l.deletebeg();
        l.displayLL();
        l.deletelast();
        l.displayLL();
        l.deleteByIndex(3);
        l.displayLL();
        System.out.println(l.findInd(200));
        System.out.println(l.findInd(400));
        l.deletelastByHead();
        l.displayLL();

    }
}
