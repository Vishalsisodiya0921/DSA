package DoublyLinkedlist;
public class CircularLL{
    static class node{
        int data;
        node next;
        node(int val){
            this.data = val;
            this.next = null;
        }
    }
    public static node InsertAtHead(node head,int val){
        node newnode = new node(val);
        if(head == null){
            newnode.next = newnode;
            return newnode;
        }
        newnode.next =head;
        node tail = head;
        while(tail.next != head &&tail.next!=null){
            tail = tail.next;
        }
        tail.next = newnode;
        return newnode;
    }
    public static void traverse(node head){
        node temp = head;
        do{
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
        while(temp!=head);
    }
    public static void main(String[] args) {
        node head = new node(12);
        head = InsertAtHead(head,11);
        head = InsertAtHead(head,10);
        head = InsertAtHead(head,9);
        head = InsertAtHead(head,8);
        traverse(head);
    }
}