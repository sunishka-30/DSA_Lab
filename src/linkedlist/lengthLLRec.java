package linkedlist;

import java.util.Scanner;

public class lengthLLRec {
    static class NodeRe{
        int data;
        NodeRe next;
        NodeRe(int data,NodeRe next)
        {
            this.data = data;
            this.next =next;
        }
    }
    NodeRe head;
    public void insertLastRe(int data)
    {
        NodeRe node = new NodeRe(data,null);
        if(head==null){
            head=node;
            return;
        }
        NodeRe temp =head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;

    }
    public int lengthRec(NodeRe temp)
    {
        if(temp==null)
        {
            return 0;
        }
        return 1+lengthRec(temp.next);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lengthLLRec ll = new lengthLLRec();
        while (true){
            int x = sc.nextInt();
            if(x==-1) break;
            ll.insertLastRe(x);
        }
        System.out.println(ll.lengthRec(ll.head));

    }
}
