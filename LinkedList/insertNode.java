//creating a linked list

import java.io.*;
public class insertNode{

    //node class
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
        n1.next = n2;
        n2.next = n3;
        Node print = n1;
        do{
            
            System.out.println("The value of Node n1 is:" + print.n);    
            print = print.next;              
        }while(print != null);
         
    }

}
