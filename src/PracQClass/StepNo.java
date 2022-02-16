package PracQClass;

public class StepNo {
    static class Node1
    {
        boolean data;
        Node1 next;
        Node1(boolean data)
        {
            this.data = data;
        }
    }

    Node1 Rear = null;
    Node1 Front = null;
    public void enqueue(boolean data)
    {
        Node1 n =new Node1(data);
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
        StepNo ob = new StepNo();
        String s;
        int f=0;
        for (String arg : args) {
            s = arg;
            for (int j = 0; j < s.length() - 1; j++) {
                int a = s.charAt(j) - '0';
                int b = s.charAt(j + 1) - '0';
                if ((a - b) == 1 || (a - b) == -1) {
                    f = 1;
                } else
                    f = 0;
            }
            ob.enqueue(f != 0);


        }
            ob.display();

        }
    }

