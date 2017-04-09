import java.io.*;
import java.util.*;

class Node{
    int data;
    Node rightChild;
    Node leftChild;
    public Node(int a){
        data = a;
        rightChild =null;
        leftChild = null;
    }
}

class BBT{
            int temp = 1;
           
          

    public static void main(String args[]) throws IOException{
        
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);       
        n1.rightChild = n3;
        n1.leftChild = n2;
        n3.rightChild = n4;
        n4.rightChild = n5;

        BBT b = new BBT();
        System.out.println("Enter the no of elements");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arrNode = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the no of elements");
            arrNode[i] = Integer.parseInt(br.readLine());
        }

            //To create the tree
            Node root1 = b.createTree(arrNode,0,n-1);
            
            // TO Process the tree
            b.process(root1);
            
            b.process(n1);

            //to find the height of the BST_Tree
            int h1 = b.treeHeight(root1);
            System.out.println("The height of the tree is "+h1);
            LinkedList[] vertex = new LinkedList[h1+1];
            for(int i=0;i<=h1;i++){
              vertex[i] = new LinkedList();
            }
        
            LinkedList[] temp = b.createNodeList(vertex,0,root1);
            for(int i = 0;i<temp.length;i++){
                System.out.println("#1 iterator");
	            Iterator iterator = temp[i].iterator();
	            while (iterator.hasNext()) {
                    Node nn = (Node)iterator.next();
		            System.out.println(nn.data);
	            }
            }
            int a = b.checkBalancedBinary(root1);
            int c = b.checkBalancedBinary(n1);
            
    }

      Node createTree(int arr[],int start, int end){

            if(start > end){
                return null;
            }
            int mid = (start+end)/2;
            Node root = new Node(arr[mid]);
            root.leftChild = createTree(arr,start, mid-1);
            root.rightChild = createTree(arr,mid+1, end);
            return root;

        }

        void process(Node printNode){
            if(printNode == null){
                return;
            }
            System.out.print("  " + printNode.data);
            process(printNode.leftChild);
            process(printNode.rightChild);
        }

        int treeHeight(Node root){
            
            if(root == null){
                return -1;
            }
            int left = treeHeight(root.leftChild);
            int right = treeHeight(root.rightChild);

            if(left > right){
                return left+1;
            }
            else{
                return right+1;
            }

        }

        LinkedList[] createNodeList(LinkedList[] vertex,int count, Node root){
            if(root == null){
                return null;
            }
            
            vertex[count].add(root); 
            System.out.println("Counter " + count);
            System.out.println("Root" + root.data);
            LinkedList[] vertex2 = createNodeList(vertex,++count,root.leftChild);
            LinkedList[] vertex3 = createNodeList(vertex,count--,root.rightChild);
            return vertex;
        }

        //Check if the tree is balanced binary tree
        int checkBalancedBinary(Node root){
            
            if(root == null){
                return -1;
            }
            int leftNode = checkBalancedBinary(root.leftChild);
            int rightNode = checkBalancedBinary(root.rightChild);

            int height = (Math.abs(leftNode)) - (Math.abs(rightNode));
            //int height = Math.abs(leftNode - rightNode);

            System.out.println("Height binary tree " + height);
            if(Math.abs(height) > 1){
                System.out.println("Not a balanced binary tree");
            }
            if(leftNode > rightNode){
                return leftNode+1;
            }
            else{
                return rightNode+1;
            }
            
        }

        


    
}
