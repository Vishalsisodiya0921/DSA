public class InsertAtAnyPos {
    static class node{
        int data;
        node next;
        node(int val){
            this.data = val;
            this.next = null;
        }
    }
    public static node insertAtHead(node head,int val){
        //task 1:create new node
        node newnode = new node(val);
        //task 2: new node k next mai head daldo
        newnode.next = head;
        //task 3:update 
        head = newnode;
        //return
        return head;
    }
    public static node insertAtTail(node tail,int val){
        //task 1: create newnode
        node newnode = new node(val);
        //task 2: tail k next mai new node daldo
        tail.next = newnode;
        //task 3:update tail
        newnode = tail;
        //task 4:return tail
        return tail;
    }
    public static node insertAtAnyPosition(node head,int val,int pos){
        //task 1:create new node
        if(pos<=0){
            System.out.println("Invalid position");
            return head;
        }
        if(pos==1){
            return insertAtHead(head,val);
        }
        node newnode = new node(val);
        node prev = null;
        node curr = head;
        int count =1;
        while(count < pos && curr !=null){
            prev = curr;
            curr = curr.next;
            count++;
        }
        prev.next = newnode;
        newnode.next =curr;
        return head;
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
        head = insertAtHead(head,112);
        head = insertAtHead(head,113);
        head = insertAtHead(head,114);
        head = insertAtHead(head,115);

        tail = insertAtTail(tail, 11);
        tail = insertAtTail(tail, 12);
        tail = insertAtTail(tail, 13);
        tail = insertAtTail(tail, 16);

        head = insertAtAnyPosition(head,1992,10);
        traverse(head);
    }
}
