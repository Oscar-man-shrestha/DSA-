// public class LinkedList {
//     Node head = null;

//     class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }


//     public void add(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//         } else {
//             Node current = head;

//             while (current.next != null) {
//                 current = current.next;
//             }

//             current.next = newNode;
//         }
//     }

//     public void printValues() {
//         Node current = head;

//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }

//         System.out.println(); 
//     }


//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();

//         list.add(6);
//         list.add(7);
//         list.add(30);

//         list.printValues();  
//     }
// }






public class LinkedList{

    public static class Node {
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;

        }
    }

    public static Node head;
    public static void tail;


    public static void main(String[] args) {
    LinkedList [] =new Liked LinkedList();
         
    }
}