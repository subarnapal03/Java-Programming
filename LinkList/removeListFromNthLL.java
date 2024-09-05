package LinkList;

public class removeListFromNthLL {
    public static void removeNth2(Node head,int idx){
        Node temp = head;
        Node slow = head;
        Node fast = head;
        for(int i =1; i<=idx; i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next= slow.next.next;
    }

    public static void removeNth(Node head, int idx){
        Node temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int m = size - idx +1;
        temp = head;
        for(int i =1; i<= m-2; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
//        return temp;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(12);
        Node c = new Node(20);
        Node d = new Node(30);
        Node e = new Node(14);
        Node f = new Node(10);
        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next =f;
        display(a);

    removeNth(a,2);
//        removeNth2(a,2);
        System.out.println(" ");
//        System.out.println(q.data);
        display(a);
    }
}
