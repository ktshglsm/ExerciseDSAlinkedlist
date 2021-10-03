import java.util.Scanner;
public class InsertaNodeattheTail {
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
            System.out.println(temp.data);
            temp=temp.next;
        }


    }
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head==null){
            head = new SinglyLinkedListNode(data);
            }
        else {
            SinglyLinkedListNode node = head;
            while (node.next != null){
                node = node.next;
                }
            node.next=new SinglyLinkedListNode(data);
            }
        return head;
    }


    public static void main(String[] args) {
        SinglyLinkedList list= new SinglyLinkedList();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        
        for (int i=0;i<n;i++)  {
            int data=in.nextInt();
            SinglyLinkedListNode newhead= insertNodeAtTail(list.head, data);
            list.head=newhead;
            
        }
        
        
        
        printLinkedList(list.head);

        
    }
}
