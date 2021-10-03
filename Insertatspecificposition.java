import java.util.Scanner;
public class Insertatspecificposition {
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
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head,int data,int position){
        SinglyLinkedListNode temp= new SinglyLinkedListNode(data);
        SinglyLinkedListNode node=head;
        int x=0;
        while(x<position-1){
            node=node.next;
            x++;
        }
        temp.next=node.next;
        node.next=temp;
        return head;
        

    }
    


    public static void main(String[] args) {
        SinglyLinkedList list= new SinglyLinkedList();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i=0;i<n;i++)  {
            int data=in.nextInt();
            list.insertNode(data);
            
        }
        int data=in.nextInt();
        int position=in.nextInt();
        SinglyLinkedListNode newhead= insertNodeAtPosition(list.head, data, position);
        list.head=newhead;
        
        printLinkedList(list.head);

        
    }
    
}
