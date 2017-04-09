//we take first iterate through value n.



import java.io.*;

public class returnLast{

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
        Node n = n1;
        Node Previous = n1;
        System.out.println("Enter the no of values you want to iterate");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        for(int i =0;i<k;i++){
            n = n.next;
        }

        while(n != null){
            n = n.next;
            Previous = Previous.next;
        }

        while(Previous != null){
            System.out.println("The data is "+ Previous.data);
            Previous = Previous.next;
        }
    }

}