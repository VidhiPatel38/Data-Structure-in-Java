import java.io.*;

class Node{
        int data;
        Node rightChild=null;
        Node leftChild=null;
    }

public class BST{
       public static Node[] nodes;   
       public static Node root = null;
       public static void main(String args[]) throws IOException{
        
        int no;   
        
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENter the number of elements you want to enter" );
        no = Integer.parseInt(br.readLine());
        nodes = new Node[no];
        System.out.println("Enter the elements in Sorted order");
        for(int i = 0; i< no ;i++){
            System.out.println("Enter the element for the number " + i+1);
            nodes[i] = new Node();
            nodes[i].data = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i< no ;i++){
            System.out.println("Enter the element for the number " + nodes[i].data);
        }
        int rootIndex = no/2;
        Node temp ;
        
        temp = leftNode(0,no-1);
        printFunction(temp);
        
       
    }

    public static Node leftNode(int start,int end){
       
        if (start > end) {
            return null;
        }
        int leftIndex = (start + end)/2;
        root = nodes[leftIndex];
        System.out.println("The rootNode is" + root.data );
        root.leftChild = leftNode(start,leftIndex-1);
        root.rightChild = leftNode(leftIndex+1,end);
        return root;
    }

    public static void printFunction(Node start){
        if(start == null){
            return;
        }
        System.out.println("The rootNode is" + start.data );
        printFunction(start.leftChild);
        printFunction(start.rightChild);
        
    }

   

    
}