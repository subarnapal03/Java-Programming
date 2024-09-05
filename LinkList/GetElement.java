package LinkList;

public class GetElement {

    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linklist{
        Node head;
        Node tail;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else{
                temp.next = head;
            }
        }

        void insertAtAny(int idx,int val){
            Node temp = new Node(val);
            Node t = head;
            for(int i =1; i<=idx;i++){
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linklist l1 = new linklist();
        l1.insertAtHead(1);
        l1.insertAtAny(1,2);
//        l1.insertAtEnd(2);
//        l1.insertAtEnd(3);
//        l1.insertAtEnd(4);
//        l1.insertAtEnd(5);
    l1.display();
    }
}
