package DataStructure.LinkedList;

class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CustomLinkedList {
    Node3 head;

    // 🔹 Convert array to LinkedList
    public void createFromArray(int[] arr) {
        if (arr.length == 0) return;

        head = new Node3(arr[0]);
        Node3 current = head;

        for (int i = 1; i < arr.length; i++) {
            Node3 newNode = new Node3(arr[i]);
            current.next = newNode;
            current = newNode;
        }
    }

    // 🔹 Add element at last
    public void addLast(int data) {
        Node3 newNode = new Node3(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node3 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // 🔹 Add element at first
    public void addFirst(int data) {
        Node3 newNode = new Node3(data);
        newNode.next = head;
        head = newNode;
    }

    // 🔹 Remove first element
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    // 🔹 Remove last element
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node3 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // 🔹 Display the LinkedList
    public void printList() {
        Node3 temp = head;
        if (temp == null) {
            System.out.println("List is empty!");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 🔹 Main function
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        // Step 1: Create list from array
        int[] arr = {10, 20, 30, 40, 50};
        list.createFromArray(arr);

        System.out.println("Initial List:");
        list.printList();

        // Step 2: Add at last
        list.addLast(60);
        System.out.println("After addLast(60):");
        list.printList();

        // Step 3: Add at first
        list.addFirst(5);
        System.out.println("After addFirst(5):");
        list.printList();

        // Step 4: Remove first
        list.removeFirst();
        System.out.println("After removeFirst():");
        list.printList();

        // Step 5: Remove last
        list.removeLast();
        System.out.println("After removeLast():");
        list.printList();
    }
}
