import java.io.*;
import java.util.*;
public class linkedListPalindrome{
    
    public static class Node{
        int data;
        Node next =null;
        public Node(int d){
            data = d;
        }
        public Node(){
        }
    }

    public static void main(String args[]){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(4);
        Node n7 = new Node(7);
        Node n8 = new Node(2);
        Node n9 = new Node(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;

        boolean reverseLink = reverseNode(n1);
        if(reverseLink){
            System.out.println("The LinkedList is Palindrome");
        }
        else{
            System.out.println("The LinkedList is not Palindrome");
        }

    }

    public static boolean reverseNode(Node set){
        boolean pal = true;
        Stack<Node> st = new Stack<Node>();
        Node checkPal = set;
        Node reverseSet = null;
        Node Head = new Node();
        while(set != null){
            st.push(set);
            set = set.next;
            
        }

        while(!st.isEmpty()){
            reverseSet = (Node)st.pop();
            System.out.println(reverseSet.data);
            System.out.println(checkPal.data);
            if(reverseSet.data != checkPal.data){    
                pal = false;
                System.out.println(pal);
                break;
            }
            checkPal = checkPal.next;
        }
        return pal;
    }

}