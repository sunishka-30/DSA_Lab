package linkedlist;

import java.util.Scanner;

public class reverseLLRec {
   static class NodeRL{
        int data;
        NodeRL next;
        NodeRL(int data,NodeRL next)
        {
            this.data = data;
            this.next = next;
        }

    }
    NodeRL head;
    public void insertLastRL(int data)
    {
        NodeRL node = new NodeRL(data,null);
        if(head==null)
        {
            head=node;
            return;
        }
        NodeRL temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;

    }
    public void recurDisplay(NodeRL temp)
    {
        if(temp == null) return;
        recurDisplay(temp.next);
        System.out.print(temp.data+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseLLRec l = new reverseLLRec();
        while(true)
        {
            int x=sc.nextInt();
            if(x==-1)
                break;
            l.insertLastRL(x);

        }
        l.recurDisplay(l.head);
    }
}
