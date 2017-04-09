import java.io.*;
public class removeDuplicate{

    // Node class
    public static class Node{
        int n;
        Node next;
        public Node(int d){
            n = d;
        }
    }


    public static void main(String args[]){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(20);
        Node n5 = new Node(10);
        Node n6 = new Node(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        Node original = n1;
        
        do{           
            Node duplicate = original.next;
            System.out.println("The value of d  Node is:" + duplicate);    
            Node previous = original;
       
            while(duplicate != null){ 
                System.out.println("The value of previous  Node is:" + duplicate.n);                    
                if(original.n == duplicate.n){
                    previous.next = duplicate.next;
                    duplicate = duplicate.next;
                }
                else{
                    previous = duplicate;
                    duplicate = duplicate.next;
                }               
            }            
            System.out.println("The value of Node is:" + original.n);    
            original = original.next;  
            System.out.println("The value of Node is:" + original);  
        }while(original != null);

        //printing the values
        Node print = n1;
        do{
            
            System.out.println("The value of Node n1 is:" + print.n);    
            print = print.next;              
        }while(print != null);
           
    }
}