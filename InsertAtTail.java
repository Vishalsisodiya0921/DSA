public class InsertAtTail {
    static class node{
        int data;
        node next;
        node(int val){
            this.data = val;
            this.next = null;
        }
    }
    public static node insertAtTail(node tail,int val){
        //task 1: create a new node
        node newnode = new node(val);
        //task 2: tail k next mai new node daldo
        tail.next = newnode;
        //task 3: update tail
        tail = newnode;
        //task 4: return tail
        return tail;
    }
    public static void traverse(node head){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        node head = new node(6);
        node tail = head;
        tail = insertAtTail(tail, 12);
        tail = insertAtTail(tail,11);
        tail = insertAtTail(tail,10);
        tail = insertAtTail(tail,9);

        traverse(head);
    }
}
