import java.io.*;
public class partitionLinkedListCTCI{

    public static class Node{
         int data;
        Node next;
        public Node(int d){
            data = d;
        }
    }

    public static void main(String args[]) throws IOException{  
    // System.out.println("Enter the value for the partion");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node n1 = new Node(3);
        Node n2 = new Node(5);
        Node n3 = new Node(8);
        Node n4 = new Node(6);
        Node n5 = new Node(5);
        Node n6 = new Node(2);
        Node n7 = new Node(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        Node print1 = partitionNode(n1,5);
        do{            
                    System.out.println("The value of Node n1 is:=======" + print1.data);    
                    print1 = print1.next;              
        }while(print1 != null);

    }

public static Node partitionNode(Node set, int val){
    Node beforeStart = null;
    Node beforeEnd = null;
    Node afterStart = null;
    Node afterEnd = null;

    while(set != null){
    Node new1 = set.next;
    set.next = null;

    if(set.data >= val){
        if(afterStart == null){
            afterStart = set;
            afterEnd = afterStart;
        }
        else{
            afterEnd.next = set;
            afterEnd = set;
        }
    }

    else{
        if(beforeStart == null){
            beforeStart = set;
            beforeEnd = beforeStart;
        }
        else{
            beforeEnd.next = set;
            beforeEnd = set;
        }   
    }

    set  = new1;

    }

    beforeEnd.next = afterStart;
    return beforeStart;


}
}
