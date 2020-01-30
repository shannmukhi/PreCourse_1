public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
             this.data = data; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
       return  root == null;  //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
         StackNode temp = new StackNode(data); 
  
        // check if stack (heap) is full. Then inserting an 
        //  element would lead to stack overflow 
        if (temp == null) { 
            System.out.print("\nHeap Overflow"); 
            return; 
        } 
  
        // initialize data into temp data field 
        temp.data = data; 
  
        // put top reference into temp link 
        temp.next = root; 
  
        // update top reference 
        root = temp; 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	if (root == null) { 
            System.out.print("\nStack Underflow"); 
            return 0; 
        } 
  
        // update the top pointer to point to the next node 
       StackNode temp=root;
        root = root.next; 
         
         return temp.data; 
        
    } 
  
    public int peek() 
    { 
      StackNode temp=root;
        root = root.next; 
         return temp.data;  //Write code to just return the topmost element without removing it.
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
        //System.out.println(sll.pop() + " popped from stack");
  
        System.out.println("Top element is " + sll.peek()); 
    } 
}
