package LinkList;

public class InsertAtAny {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class Linklist{
        Node head = null;
        Node tail = null;

        public void insertAtAny(int idx,int val)
        {
            Node t = new Node(val);
            Node temp = head; //this is used as a pointer to travers the list

//            if(idx == size()){
//
//            }

            for(int i =1; i<=idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        void display(){
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
   /* int size(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }*/

    public static void main(String[] args) {
        Linklist l1 = new Linklist();
        l1.insertAtAny( 1,11);
        l1.display();
    }
}
