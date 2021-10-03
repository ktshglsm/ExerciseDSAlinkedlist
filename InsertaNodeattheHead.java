import java.util.Scanner;
public class InsertaNodeattheHead {
    

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
    static SinglyLinkedListNode insertNodeatHead(SinglyLinkedListNode head, int data){
        SinglyLinkedListNode temp = head;
        head= new SinglyLinkedListNode(data);
        head.next=temp;
        return head;
    }
    


    public static void main(String[] args) {
        SinglyLinkedList list= new SinglyLinkedList();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i=0;i<n;i++)  {
            int data=in.nextInt();
            SinglyLinkedListNode newhead= insertNodeatHead(list.head, data);
            list.head=newhead;
        }
        
        
        

        
        
        printLinkedList(list.head);

        
    }
}

    

