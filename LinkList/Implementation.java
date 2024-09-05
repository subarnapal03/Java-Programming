package LinkList;

public class Implementation {

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

//        creating a function to add node at end the funnction will also check that if no node is ther or node is their
        void insertionAtEnd(int val){
            Node temp = new Node(val);
//            check that is their any node is present or not
            if(head == null){
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linklist l1 = new linklist();
        l1.insertionAtEnd(5);
        l1.insertionAtEnd(8);
        l1.insertionAtEnd(10);
       l1.display();
    }
}
