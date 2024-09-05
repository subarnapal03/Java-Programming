package LinkList;

public class insertAtBigninng {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linklist{
        Node head = null;
        Node tail = null;

        void insertAtHead(int val){
            Node temp = new Node(val);

            if(head == null){
                head = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
        }

    }
    public static void main(String[] args) {
        linklist l1 = new linklist();
        l1.insertAtHead(45);
        l1.insertAtHead(46);
        l1.insertAtHead(47);
        l1.insertAtHead(48);
        l1.insertAtHead(5);
        l1.display();
    }
}
