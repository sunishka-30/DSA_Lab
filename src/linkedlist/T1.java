package linkedlist;

public class T1 {


        static class Node{
            char data;
            Node next;

            public Node(char data) {
                this.data = data;
                this.next = null;
            }
        }
        public Node head = null;
        public  void add(char data)
        {
            Node new_node= new Node(data);
            if(head==null)
                head=new_node;
            else
            {
                Node temp=head;
                while(temp.next!=null)
                {temp=temp.next;}
                temp.next=new_node;
            }
        }
        public static void display(T1[] l)
        {
            for (T1 t1 : l) {
                Node temp = t1.head;
                while (temp != null) {
                    System.out.print(temp.data);
                    temp = temp.next;
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            T1[] l = new T1[args.length];
            for(int i=0;i<args.length;i++)
            {
                l[i] = new T1();
                for (int j=0;j<args[i].length();j++)
                {
                    boolean b = (args[i].charAt(j)) % 2 == 0;
                    if(b)
                    {l[i].add('o');}
                    else
                    {l[i].add('e');}
                }
            }
            display(l);
        }

    }

