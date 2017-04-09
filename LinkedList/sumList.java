

/*public static void reversePrint (LN l)
  {
    if (l == null)
      return;
    else {
      reversePrint(l.next);
      System.out.println(l.value);
    }
  }
*/

import java.io.*;
import java.util.*;
public class sumList{

    public static class Node{
         int data;
        Node next;
        public Node(int d){
            data = d;
        }
        public Node(){
        
        }
    }

    public static void main(String args[]) throws IOException{  
     //System.out.println("Enter the value for the partion");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node n1 = new Node(3);
        Node n2 = new Node(5);
        Node n3 = new Node(8);
        Node n4 = new Node(6);
        Node n5 = new Node(10);
        Node n6 = new Node(2);
        Node n7 = new Node(1);
        Node n8 = new Node(3);
        Node n9 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;

        Node print2 = reversePrint(n1,n6,0);
    

 //      Node print2 =  reversePrint2(n1);

        System.out.println("Reverse print using Current");
         do{            
                    System.out.println("The value of reversePrint2 is:=======" + print2.data);    
                    print2 = print2.next;              
        }while(print2 != null);
    
    }

// using the current sumList
/*
public static Node reversePrint2(Node l){
    Node current = l;
    Node next = null;
    Node previous = null;

    while(current != null){
        next = current.next;
        current.next = previous;
        previous = current;
        current = next;
    }
    return previous;

}*/

public static Node reversePrint (Node l, Node m, int carry){

    int sum, a=0, b=0;
    Node result = new Node();
    //Node newList = result;

    if(l != null){
         a = l.data;
    }

    if(m != null){
         b = m.data; 
    }

    sum = a + b + carry;

    if(sum > 10){
        sum = sum % 10;
        result.data = sum;

        carry  = 1;
    }
    else{
        carry = 0;
    }
// recursion 

    if(l != null || m != null){
        Node more = reversePrint(l == null ? null : l.next, m == null ? null : m.next , carry);
        if(result == null){
            newList = result;
            result
        }
        result.next = more;
        result = more;
    }

    return result;

    
  }


}


