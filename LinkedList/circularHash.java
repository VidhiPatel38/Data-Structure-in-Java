// circular link list using HashSet
import java.util.*;
public class circularHash{
    public static class Node{
        int data;
        Node next = null;
        public Node(int n){
            data = n;
        }
    }

    public static void main(String args[]){
            Node n1 = new Node(1);
            Node n2 = new Node(2);
            Node n3 = new Node(3);
            Node n4 = new Node(4);
            Node n5 = new Node(5);
            Node n6 = new Node(6);
            Node n7 = new Node(7);
            Node n8 = new Node(8);
            Node n9 = new Node(9);
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n5;
            n5.next = n6;
            n6.next = n7;
            n7.next = n8;
            n8.next = n9;
            n9.next = n9;

            Node corrupt = circularCorrupt(n1);
            System.out.println("The corrupt Node is " + corrupt);
            System.out.println("The corrupt Node is " + corrupt.data);
    }

    public static Node circularCorrupt(Node l1){
        Node l2 = null;
        HashSet<Node> newset=new HashSet<Node>();  
        while(l1 != null){
            boolean exist = newset.contains(l1);
            if(exist){
                return l1;
            }
            else{
                newset.add(l1);
                l1 = l1.next;
            }
           
         
        }
         return l2;
    }
}