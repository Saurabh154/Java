package DataStructure.LinkedList;

class Node1{
    int data;
    Node1 next;
}

public class WithoutConstructor {
    public static void main(String[] args) {
        // Node without constructor
        System.out.println("Node without constructor");

        Node1 pehla = new Node1();
        pehla.data = 10;
        pehla.next = null;

        Node1 dusra = new Node1();
        dusra.data = 20;
        dusra.next = null;

        Node1 tisra = new Node1();
        tisra.data = 30;
        tisra.next = null;

        // connect all node
        pehla.next = dusra;
        dusra.next = tisra;
        tisra.next = null;

        Node1 head1 = pehla;
        Node1 temp = head1;

        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
