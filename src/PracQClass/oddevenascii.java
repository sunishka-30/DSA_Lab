package PracQClass;



public class oddevenascii {
    static class Node3
    {
        char data;
        Node3 next;
        Node3(char data)
        {
            this.data = data;
        }
    }

    Node3 Rear = null;
    Node3 Front = null;
    public void enqueue(char data)
    {
       Node3 n =new Node3(data);
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
            System.out.print(Front.data);
            Front=Front.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        String s;
        oddevenascii obj = new oddevenascii();
        int value;
        for (String arg : args) {
            s = arg;
            for (int j = 0; j < s.length(); j++) {
                value = s.charAt(j);
                if (value % 2 != 0) {
                    obj.enqueue((char) value);
                }

            }
            for (int j = 0; j < s.length(); j++) {
                value = s.charAt(j);
                if (value % 2 == 0) {
                    obj.enqueue((char) value);
                }

            }

        }

        obj.display();

    }
}
