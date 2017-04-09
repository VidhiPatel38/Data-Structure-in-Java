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

class FirstCommonAncestor{          

    public static void main(String args[]) throws IOException{
        
        FirstCommonAncestor b = new FirstCommonAncestor();             
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);       
        n1.rightChild = n3;
        n1.leftChild = n2;
        n2.leftChild = n4;
        n2.rightChild = n5;
      //  printInOrder(n1);

            Node ancestor = b.checkNullNodes(n1,n2,n5.rightChild);
            System.out.println(ancestor);
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

        
        
        Node checkNullNodes(Node root, Node p, Node q){
            if(!(covers(root,p))||!(covers(root,q)) ){
                return null;
            }
            return findCommonAncestor(root,p,q);
        }
        Node findCommonAncestor(Node root, Node p, Node q ){
            if(root == p || root == q || root == null){
                return root;
            }
            boolean pIsLeft = covers(root.leftChild,p);
            boolean qIsLeft = covers(root.leftChild,q);
            if(pIsLeft != qIsLeft){
                return root;
            }
            Node childNode = (pIsLeft) ? root.leftChild : root.rightChild;
            return findCommonAncestor(childNode,p,q);
        }

        boolean covers(Node root, Node p){
            if(root == null){
                return false;
            }
            if(root == p){
                return true;
            }
            return covers(root.leftChild,p) || covers(root.rightChild,p);
        }
}
