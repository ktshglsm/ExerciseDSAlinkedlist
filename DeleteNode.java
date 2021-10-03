import java.util.Scanner;
public class DeleteNode {
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
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position){
        SinglyLinkedListNode temp=head;
        if (position==0) {
            head=head.next;
            return head;
        }
        int x=0;
        while(x<position-1){
            temp=temp.next;
            x++;
        }
        SinglyLinkedListNode node=temp;
        temp=temp.next;
        node.next=temp.next;

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
        int position=in.nextInt();
        SinglyLinkedListNode newhead= deleteNode(list.head, position);
        list.head=newhead;
        
        
        printLinkedList(list.head);

        
    }
    
}
