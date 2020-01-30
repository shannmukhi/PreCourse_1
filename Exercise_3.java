import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
             this.data = d;    
            this.next = null;    //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
      
       Node newNode = new Node(data); 
        if(list.head == null) {    
            list.head = newNode;    
            
        }    
        else {    
             while(list.head != null) {
            list.head=list.head.next ;  } 
            list.head= newNode;
            
        }    
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
      return list;  
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
            if(list.head==null)
            {System.out.println("no list to display");}
            else
{
while(list.head != null) {
    System.out.println(list.head.data+" ");
            list.head=list.head.next ;  } 
        
}            
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ***INSERTION*** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        printList(list);
        list = insert(list, 2); 
        printList(list);
        list = insert(list, 3); 
        printList(list);
        list = insert(list, 4); 
        printList(list);
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}
