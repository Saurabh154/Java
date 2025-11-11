package DataStructure.LinkedList;

class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {

    Node2 head;

    public Node2 arrayToLinkedList(int[] arr){
        if(arr.length == 0) return null;

        Node2 head = new Node2(arr[0]);
        Node2 mover = head;

        for(int i=1; i<arr.length; i++){
            Node2 newNode = new Node2(arr[i]);
            mover.next = newNode;
            newNode = mover;
        }

        return head;
    }

    public void addLast(int data){
        Node2 newNode = new Node2(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node2 curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;

    }

    public void addFirst(int data){
        Node2 newNode = new Node2(data);
        newNode.next = head;
        head = newNode;
    }

    public void removeFirst() {
        if (head == null) return;
        head = head.next;
    }

    public void removeLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }

        Node2 curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    public void printList() {
        Node2 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.printList();

        list.addFirst(50);
        list.addFirst(100);

        list.printList();

        list.removeFirst();
        list.printList(); // 10 -> 20 -> 30 -> null

        list.removeLast();
        list.printList(); // 10 -> 20 -> null


        Node2 head = list.arrayToLinkedList(new int[]{10, 20, 30});

    }
}
