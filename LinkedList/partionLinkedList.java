import java.io.*;
public class partionLinkedList{

    public static class Node{
         int data;
        Node next;
        public Node(int d){
            data = d;
        }
    }

    public static void main(String args[]) throws IOException{  
     System.out.println("Enter the value for the partion");
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
        partitionNode(n1,6);
    }

    public static void partitionNode(Node set, int val){
        Node point = set;
        Node check = set;
        Node new1;
        Node new2;
        Node last = set;
        Node first = set;
        Node previous = null;
        Node follow = null;

        while(last != null){
            previous = last;
            follow = last;
            last = last.next;
            
        }
     
        while(check != null){
            System.out.println(check.next);
            if(check.data >= val){
                
                if(check == first){
                first = check.next;
                new2 = check;
                previous.next = new2;
               
                new2.next = null;
                check = check.next;
                previous = previous.next;;
                }
                else if(check.next == null){
                    break;
                }
                else{
                    //int a  = check.data;
                    //Node add1 = new Node(a);
//                     int a  = check.data;
  //                   System.out.println(a); 
                    new2 = check.next;     
                    check.next = null;              
                    new1 = check;
                    
                    
                   // System.out.println("The value of new n1 is:" + new1.data);
                    check.data = new2.data;
                    check.next = new2.next;
                   // System.out.println("The value of previous n1 is:" + previous.data);  
                    previous.next = new1;
                    //new1.next = null;
                    //previous.next.next = null;
                    previous = new1;
                   // System.out.println("The value of new.next.data is:" + previous.next);  

                }
                
            }
            else{
                check = check.next;
            }
        }

         do{            
            System.out.println("The value of Node n1 is:=======" + first.data);    
            first = first.next;              
        }while(first != null);

    }
}


