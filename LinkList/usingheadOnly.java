package LinkList;

public class usingheadOnly {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void insertAt(Node head,int num){
        Node temp = new Node(num);
        Node t = head;
        while (t.next != null){
            t=t.next ;
        }
     t.next = temp;

    }
    public static void display(Node Head){
        Node temp = Head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node l1 = new Node(1);
        Node l2 = new Node(2);
        Node l3 = new Node(3);
        Node l4 = new Node(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        display(l1);
//        l1.next = l2;
        insertAt(l1,5);
        display(l1);
    }
}
