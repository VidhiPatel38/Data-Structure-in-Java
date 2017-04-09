import java.io.*;
import java.util.*;
public class removeDuplicateCTCI{

    // Node class
    public static class Node{
        int data;
        Node next;
        public Node(int d){
            data = d;
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
        deleteDuplicate(n1);

    }

public static void deleteDuplicate(Node n){
    Node print = n;
    HashSet<Integer> set = new HashSet<Integer>();
    Node previous = null;
    while(n != null){
        if(set.contains(n.data)){
            previous.next = n.next;
            n = n.next;
        }
        else{
            set.add(n.data);
            previous = n;
            n = n.next;
        }
    }
        
        do{
            
            System.out.println("The value of Node n1 is:" + print.data);    
            print = print.next;              
        }while(print != null);
           
    }
}

