
import java.io.*;
import java.util.*;
 class Node{

    int data;
    Node rightChild;
    Node leftChild;

    public Node(int val){
        data = val;
        rightChild = null;
        leftChild = null;
    }
}

public class successor_Tree{
    Node success_N = null;
    boolean flag = false;
    public static void main(String args[]) throws IOException{
        successor_Tree v = new successor_Tree();
        System.out.println("Enter the no of elements");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arrNode = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the no of elements");
            arrNode[i] = Integer.parseInt(br.readLine());
        }


        Node root =    v.createTree(arrNode,0,n-1);
        v.process(root);
        
        //TO find the tree is BST
         v.successor_Node(root , 3);

       /// System.out.println("The BST valid is " + check);
    }

        //creating a createTree

        Node createTree(int arr[],int start, int end){

            if(start > end){
                return null;
            }
            
            int mid = (start + end) / 2;
            Node root = new Node(arr[mid]);
            root.leftChild  = createTree(arr,start,mid-1);
            root.rightChild  = createTree(arr,mid+1,end);
            return root;

        }

        //printing the Node
        void process(Node printNode){
            if(printNode == null){
                return;
            }
            System.out.println(printNode.data);
            process(printNode.leftChild);
            process(printNode.rightChild);
        }

        
        // Checking the BST tree
        void successor_Node(Node root,int n1){

            
            if(root == null){
                return ;
            }

            successor_Node(root.leftChild,n1);
            if(flag){
                System.out.println("The successor_Node is " + root.data);
                flag = false;
            }
            if(root.data == n1){
                flag = true;
            }
            successor_Node(root.rightChild,n1);
            
            
        }


        
    }

