package LinkList;

public class nthNodeFromEnd {

    public static Node nthNode(Node head,int idx){
        int size =0;
        Node temp =head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size - idx + 1;
        temp = head;
        for(int i =1; i<=m-1;i++){
            temp = temp.next;
        }
        return temp;
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(11);
        Node b = new Node(25);
        Node c = new Node(100);
        Node d = new Node(12);
        Node e = new Node(14);
        Node f = new Node(1);
        Node g = new Node(30);
        Node h = new Node(10);
        a.next =b;
        b.next =c;
        c.next =d;
        d.next =f;
        f.next =g;
        g.next =h;
        Node q = nthNode(a,3);
        System.out.println(q.data);
    }
}
