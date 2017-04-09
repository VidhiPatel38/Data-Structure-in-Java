

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
public class reverseUsingStack{

    public static class Node{
         int data;
        Node next;
        public Node(int d){
            data = d;
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
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        Node print1 = reversePrint(n1);
       
        System.out.println("Reverse print using Stack");
         do{            
                    System.out.println("The value of reversePrint is:=======" + print1.data);    
                    print1 = print1.next;              
        }while(print1 != null);
    }
    
      

    


public static Node reversePrint(Node head){


       Node StartHead = null;
       Node EndHead = null;
       Stack<Node> st = new Stack<Node>();
        // add code here
        while(head != null){
           // System.out.println(Head);
            st.push(head);
            head = head.next;
        }
        
        if(!st.isEmpty()){
            StartHead = (Node)st.pop();
            EndHead = StartHead;
            EndHead.next = null;
            
        }
        while (!st.isEmpty()){
            EndHead.next = (Node)st.pop();
            EndHead = EndHead.next;
            EndHead.next = null;
        }
        return StartHead;
   }


}


