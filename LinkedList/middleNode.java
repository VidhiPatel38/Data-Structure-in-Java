import java.io.*;

public class middleNode{

    public static class Node{
        int data;
        Node next;
    
    public Node(int n){
        data = n;
    }
    }

    public static void main(String args[]) throws IOException{

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
        deleteNode(n4);
        Node print = n1;
        do{
            
            System.out.println("The value of Node n1 is:" + print.data);    
            print = print.next;              
        }while(print != null);
    }

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter the node you want to delete");
        //String s = br.readLine();
        public static void deleteNode(Node current){
        //Node current = s;
        Node next1 = current.next;
        current.data = next1.data;
        current.next = next1.next;

        
    }

}