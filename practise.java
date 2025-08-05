public class practise {
    public static class Node {
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head; // declaring ( static references (pointers) at the class level)
    public static Node tail;

    public void addFirst(int data){
         Node newNode = new Node (data);
        if(head ==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode =new Node(data);
        if(head==null){
            tail=head=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }


    public void print (){   //O(n)
       if(head==null){
System.out.print("LL is empty ");
return;
       }
Node temp=head;
while(temp!=null){
    System.out.print(temp.data+" -> ");;
    temp=temp.next;

}
System.err.println("null");
       }
    
    public static void main(String[] args) {
        practise ll = new practise();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}
 