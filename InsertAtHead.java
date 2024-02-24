public class InsertAtHead{
    static class node{
        int data;
        node next;
        node(int val){
            this.data = val;
            this.next = null;
        }
    }
    public static node insertAtHead(node head,int val){
        //task 1 : create node
        node newnode = new node(val);
        //Task 2 : new node k next m head daldo
        newnode.next = head;
        // task 3: update head
        head = newnode;
        //task 4: return head
        return head;
    }
    public static void traverse(node head){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        node head = new node(11);
        head = insertAtHead(head,12);
        head = insertAtHead(head,13);
        head = insertAtHead(head,14);
        head = insertAtHead(head,15);
        traverse(head);
    }
}