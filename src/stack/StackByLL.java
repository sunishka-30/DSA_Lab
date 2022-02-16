package stack;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        next = null;
    }
}
public class StackByLL {
   Node top;
   public StackByLL()
   {
       top=null;
   }
   public boolean isEmpty()
   {
       return top==null;
   }
   public void push(int data)
   {
       Node newnode =new Node(data);
       if (!isEmpty()) {
           newnode.next = top;
       }
       top=newnode;

   }
   public void pop()
   {
       if(isEmpty())
       {
           System.out.println("empty,no element to be popped");

       }
       else {
           top=top.next;
       }
   }
    public void display()
    {
        if(top==null)
            System.out.println("stack is empty, no element to be displayed");
        else
        {
            Node temp=top;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackByLL obj=new StackByLL();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.display();
        obj.pop();
        obj.display();
        obj.pop();
        obj.display();
        obj.pop();
        obj.display();
        obj.pop();
        obj.display();
        obj.pop();

    }
}
