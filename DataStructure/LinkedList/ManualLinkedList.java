package DataStructure.LinkedList;

class Node{
    int data;  // data part
    Node next; // link to next node

    Node(int data){
        this.data = data;
        this.next = null;  // initially next kisi ko point nahi karta
    }
}

public class ManualLinkedList {
    public static void main(String[] args) {

        // 🟩 Step 1: Har node manually create karo
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // 🟩 Step 2: Unhe link karo ek dusre se
        first.next = second;   // 10 -> 20
        second.next = third;   // 20 -> 30
        third.next = fourth;   // 30 -> 40
        fourth.next = null;    // last node ka next null

        // 🟩 Step 3: Head node set karo (starting point)
        Node head = first;

        // 🟩 Step 4: Traverse (print all nodes)
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");

    }
}
