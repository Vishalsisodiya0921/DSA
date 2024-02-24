package DoublyLinkedlist;
public class InsertAtHeadTail {
    static class node{
        int data;
        node next;
        node prev;
        node(int val){
            this.prev =null;
            this.data = val;
            this.next = null;
        }
    }
    public static node insertAtHead(node head,int val){
        if(head == null){
            head = new node(val);
            return head;
        }
        //task 1:create new node
        node newnode = new node(val);
        //task 2:new node k next mai head ki value
        newnode.next = head;
        head.prev = newnode;
        //Task 3:update head
        head = newnode;
        //task 4:return
        return head;
    }
    public static node insertAtTail(node tail,int val){
        //task1: create new node
        node newnode = new node(val);
        //task 2: tail k next mai newnode ki value
        if(tail == null){
            tail = new node(val);
        }
        else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        //task 3:return
        return tail;
    }
    public static void traverse(node head){
        node temp = head;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        node head = new node(12);
        node tail = head;

        head = insertAtHead(head, 11);
        head = insertAtHead(head, 10);
        head = insertAtHead(head, 9);
        head = insertAtHead(head, 8);

        traverse(head);
        System.out.println();

        tail = insertAtTail(tail, 13);
        tail = insertAtTail(tail, 14);
        tail = insertAtTail(tail, 15);
        tail = insertAtTail(tail, 16);

        traverse(head);
        System.out.println();
    }
}
