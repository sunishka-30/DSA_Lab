package stack;

import java.util.Scanner;


public class PalindromeByStack {
    stack top;
    int size;
    static class stack {
        char data;
        stack next;
        stack(char data,stack next)
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
        PalindromeByStack st = new PalindromeByStack();
        int n = sc.nextInt();
        String s = String.valueOf(n);
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        if(s.equals(st.pop())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
