
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    
        if(top==-1)
    {
      System.out.println("stack is empty");  
      return true;
    }
    else
    return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        System.out.println("activated"); 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top== MAX-1)
        {System.out.println("stack is overflow");
            return false;
        }
        else
        {
            ++top;
            a[top]=x;
            return  true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    if(top==-1)
    {
      System.out.println("stack is empty");  
      return -1;
    }
        else
        {
            int x=a[top];
            top--;
            return x;
        }
        
    } 
  
    int peek() 
    { 
        //Write your code here
        int x=a[top];
        return x;
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.peek() + " Peeked from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        
        
    } 
}
