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

public class subTree{
         public static void main(String args[]) throws IOException{
        
        subTree T1 = new subTree();    
        subTree T2 = new subTree();

        System.out.println("Enter the no of elements for Tree T1");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        
        int[] arrNode1 = new int[n1];
       
        for(int i=0;i<n1;i++){
            System.out.println("Enter the element for T1");
            arrNode1[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the no of elements for Tree T2");
        int n2 = Integer.parseInt(br.readLine());
        int[] arrNode2 = new int[n2];
        for(int i=0;i<n2;i++){
            System.out.println("Enter the element for T2");
            arrNode2[i] = Integer.parseInt(br.readLine());
        }

            //To create the tree
            Node root1 = T1.createTree(arrNode1,0,n1-1);
            Node root2 = T2.createTree(arrNode2,0,n2-1);
            
            // TO Process the tree
            T1.process(root1);
            System.out.println("");
            T2.process(root2);

            boolean check = T1.checkSubTree(root1,root2);
            System.out.println("The value of check is " + check);
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
            System.out.print(printNode.data+ " ");
            process(printNode.leftChild);
            process(printNode.rightChild);
        }


        boolean checkSubTree(Node p, Node q ){
           if(q == null){
               return true;
           }
           return checksubTreeChild(p,q);
            
        }

        boolean checksubTreeChild(Node p, Node q){
         if(p == null){
             return false;
         }   
         if(p.data == q.data && matchTree(p,q)){
             return true;
         }
         return checksubTreeChild(p.leftChild,q) || checksubTreeChild(p.rightChild,q);
             
         }

            
        boolean matchTree(Node p, Node q){
            if(p==null && q ==null){
                return true;
            }
            if(p==null ){
                return false;
            }
            else if(q == null){
                return true;
            }
            else if(p.data != q.data){
                return false;
            }
            else {
                return (matchTree(p.leftChild,q.leftChild)) && (matchTree(p.rightChild,q.rightChild));
        }
        }

}