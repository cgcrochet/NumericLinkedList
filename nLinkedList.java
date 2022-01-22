

package numericlinkedlist;


public class nLinkedList {
    
 
    Node head;  
    
    public nLinkedList(){
        head=null;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void insertAtBeginning(int new_data) {
        // Create new node
        Node new_node = new Node(new_data);
        
        // Link new node to head
        new_node.next = head;
        
        // Make the new node the new head
        head = new_node;
  }
    
   public void insertAtEnd(int new_data) {
        
       Node new_node = new Node(new_data);

        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;
  }
   
   
    public void printList()
    {
       if (head == null)
            return;
       
        Node current = head;
        while (current.next != null)
        {
            System.out.print(current.key + ", ");
            current = current.next;
        
        }
       
        System.out.print(current.key + "\n");
   }
   
   //Complete this method
   public void deleteAt(int position)
   {
        if (head == null)
            return;
       
        Node current = head;
        
        if (position == 0) {
            head = current.next; // Head becomes next value in list
            return;
        }
        
        for (int i = 0; current != null && i < position - 1; i++) {
            
            current = current.next;
            
            // Check for invalid input
            if (current == null || current.next == null){
                return;
            }
            
            if (i == position - 2) {
                Node next = current.next.next;
                current.next = next;
            }
            
            
        }
        
   }
   
   //Complete this method
   public void deleteValue(int data)
   {
       Node current = head;
       Node prev = null;
       
       if (head == null)
            return;
       
       if (current != null && current.key == data) {
           head = head.next;
       }
        
       while (current != null && current.key != data) {
           prev = current;
           current = current.next;
       }
       
       if (current == null){
           return;
       }
        
       prev.next = current.next;
   }
            
   
   
  

}