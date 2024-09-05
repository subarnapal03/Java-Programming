package LinkList;

public class printLingthOfll {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

public static int lengthll(Node head){
        int count = 0;
    while(head != null){
        count++;
        head = head.next;
    }
    return count;
}
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(15);
        Node c = new Node(25);
        Node d = new Node(35);
        Node e = new Node(45);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(lengthll(a));
    }
}
