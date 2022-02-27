package stack;

import java.util.Scanner;

public class reverseStr {
    stack top;
    int size;
    static class stack {
        char data;
     stack next;
        stack(char data, stack next)
        {
            this.data = data;
            this.next = next;
        }
    }
    public void push(char data)
    {   stack d = new stack(data,null);
        size++;
        if(top==null)
        {
            top=d;
            return;
        }
        d.next=top;
        top=d;

    }
    public String  pop()
    {
        String res="";
       stack temp =top;
        while(temp!=null)
        {
            res=res+temp.data;
            temp=temp.next;
        }
        return res;
    }
    public int size()
    {
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseStr st = new reverseStr();

        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }

        System.out.println(st.pop());
    }
}
