

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
public class sumList2{

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
        Node n1 = new Node(9);
        Node n2 = new Node(7);
        Node n3 = new Node(8);
        //Node n4 = new Node(2);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(5);
   //     Node n9 = new Node(5);
        n1.next = n2;
        n2.next = n3;
       // n3.next = n4;

        n6.next = n7;
        n7.next = n8;
      //  n8.next = n9;

       // Node l1= reversePrint2(n1);
        //Node m1 = reversePrint2(n6);
        //Node print2 = reversePrint(l,m,0);
    
        System.out.println("Reverse print using Current");
      /*   do{            
                    System.out.println("The value of n is:=======" + l1.data);    
                    l1 = l1.next;              
        }while(l1 != null);

        // reverse Array
         System.out.println("Reverse print using Current");
         do{            
                    System.out.println("The value of m is:=======" + m1.data);    
                    m1 = m1.next;              
        }while(m1 != null); */
        
        Node  reverseResult = reversePrint(n1,n6,0);
        Node print2 = reversePrint2(reverseResult);
        
        do{            
                    System.out.println("The value of reversePrint2 is:=======" + print2.data);    
                    print2 = print2.next;              
        }while(print2 != null);
        
    
    }


public static Node reversePrint(Node l, Node m, int carry){
    
    
    Node StartList = null;
    Node EndList = null;
    while(l != null || m != null){
    Node newNode = new Node();

    int sum=0, a=0, b=0;
    if(l != null){
         a = l.data;
         l = l.next;
    }

    if(m != null){
         b = m.data; 
         System.out.println(m.data);
         m = m.next;
         
    }
    sum = a + b + carry;
    
    if(sum > 10){
        sum = sum % 10;
        carry  = 1;
    }
    else{
        carry = 0;
    }

    newNode.data = sum;
    System.out.println("sum" + newNode);

    System.out.println("Reverse print result");

    if(StartList == null){
        System.out.println("Reverse print StartList");
        StartList = newNode;
        EndList = StartList;
        //result = l4.next;
    }
    else{
        System.out.println("Reverse print EndList");
        EndList.next = newNode;
        //result = l4.next;
        EndList = newNode;
        
    }
    

    }

    if(l==null && m==null & carry==1){
        Node newNode = new Node();
        newNode.data = carry;
        EndList.next = newNode;
        EndList = newNode;
    }    
    return StartList;
    
  }

  public static Node reversePrint2(Node head){

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


