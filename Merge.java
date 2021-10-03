import java.util.Scanner;
public class Merge {
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
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1,SinglyLinkedListNode head2){
        SinglyLinkedListNode temp1=head1,temp2=head2;
        SinglyLinkedList newlist = new SinglyLinkedList();
        while (temp1!=null&&temp2!=null){
            if (temp1.data<temp2.data) {
                newlist.insertNode(temp1.data);
                temp1=temp1.next;
            } else {
                newlist.insertNode(temp2.data);
                temp2=temp2.next;
            }
        }
        while (temp1!=null) {
            newlist.insertNode(temp1.data);
            temp1=temp1.next;
        }
        while (temp2!=null) {
            newlist.insertNode(temp2.data);
            temp2=temp2.next;
        }
        return newlist.head;
    }
    


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i=0;i<n;i++)  {
            int num1=in.nextInt();
            SinglyLinkedList list1= new SinglyLinkedList();
            for (int j = 0; j < num1; j++) {
                int data = in.nextInt();
                list1.insertNode(data);

            }
            int num2=in.nextInt();
            SinglyLinkedList list2= new SinglyLinkedList();
            for (int j = 0; j < num2; j++) {
                int data = in.nextInt();
                list2.insertNode(data);
            }
            
            SinglyLinkedListNode newhead= mergeLists(list1.head, list2.head);
            
            printLinkedList(newhead);
            System.out.println();
        }
        
        
        

        
    }
    
}
