import java.util.Scanner;
public class Reverselinkedlist {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }


    }
    static SinglyLinkedListNode insertNodeatHead(SinglyLinkedListNode head, int data){
        SinglyLinkedListNode temp = head;
        head= new SinglyLinkedListNode(data);
        head.next=temp;
        return head;
    }

    static SinglyLinkedListNode reverse(SinglyLinkedListNode head){
        SinglyLinkedList newlist= new SinglyLinkedList();
        SinglyLinkedListNode temp= head;
        while (temp!=null){
            SinglyLinkedListNode newhead=insertNodeatHead(newlist.head, temp.data);
            newlist.head=newhead;
            temp=temp.next;
        }
        temp= newlist.head;
        
        return newlist.head;

    }
    


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i=0;i<n;i++)  {

            int num=in.nextInt();
            SinglyLinkedList list= new SinglyLinkedList();
            for (int j=0;j<num;j++){
                int data=in.nextInt();
                list.insertNode(data);
            }
            SinglyLinkedListNode result= reverse(list.head);
            printLinkedList(result);
            System.out.println();
            
            
        }
        
        
        
        

        
    }
    
}
