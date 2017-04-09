
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

class BST_Tree{
            int temp = 1;
           
          

    public static void main(String args[]) throws IOException{
        

        BST_Tree b = new BST_Tree();
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
                    Node n1 = (Node)iterator.next();
		            System.out.println(n1.data);
	}
            }
            
    }

      Node createTree(int arr[],int start, int end){

            if(start > end){
                return null;
            }
            int mid = (start+end)/2;
            Node root = new Node(arr[mid]);
            root.leftChild = createTree(arr, start, mid-1);
            root.rightChild = createTree(arr, mid+1, end);
            return root;

        }

        void process(Node printNode){
            if(printNode == null){
                return;
            }
            System.out.print(printNode.data);
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




    
}