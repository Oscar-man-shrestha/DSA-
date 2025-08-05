public class linkedList {

    //Make the refrences of Node
    public static class Node{
        int data;
        Node next;

        public Node (int data ){
            this.data = data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    

    public void addFirst(int data){
  //Steps1 = create new node

        Node newNode = new Node(data);

        if(head==null){
           head=tail=newNode;
           return;
        }
      
        //step2: newNode next=head
        newNode.next=head;//link
        //step3:
        head=newNode;
        
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}