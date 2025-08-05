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






// public class LinkedList{

//     public static class Node {
//         int data;
//         Node next;
//         public Node (int data){
//             this.data=data;
//             this.next=null;

//         }
//     }

//     public static Node head;
//     public static void tail;

//     public void addFirst (int data){
       
//         Node newNode =new Node(data);

        
        
//     }

//     public static void main(String[] args) {
//     LinkedList ll =new  LinkedList();
         
//     }
// }


public class LinkedListOperations {

   
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

       
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }

       
        public boolean search(int key) {
            Node curr = head;
            while (curr != null) {
                if (curr.data == key) {
                    return true;
                }
                curr = curr.next;
            }
            return false;
        }

        
        public int getSum() {
            int sum = 0;
            Node curr = head;
            while (curr != null) {
                sum += curr.data;
                curr = curr.next;
            }
            return sum;
        }

        
        public void deleteFirst() {
            if (head != null) {
                head = head.next;
            }
        }

        
        public void deleteKey(int key) {
            if (head == null) return;

            if (head.data == key) {
                head = head.next;
                return;
            }

            Node curr = head;
            while (curr.next != null && curr.next.data != key) {
                curr = curr.next;
            }

            if (curr.next != null) {
                curr.next = curr.next.next;
            }
        }

        
        public void display() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println("null");
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Original list:");
        list.display();

        // Search key
        int key = 30;
        System.out.println("Is " + key + " present? " + list.search(key));

        // Get sum
        System.out.println("Sum of nodes: " + list.getSum());

        // Delete first node
        list.deleteFirst();
        System.out.println("After deleting first node:");
        list.display();

        // Delete a specific key
        list.deleteKey(40);
        System.out.println("After deleting key 40:");
        list.display();
    }
}
