
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

public class BSTSequence{
    public static void main(String args[]) throws IOException{
        BSTSequence b = new BSTSequence();
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

           ArrayList<LinkedList<Integer>> sequenceList =    b.allSequences(root1);
           System.out.println(sequenceList);
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
            System.out.println(printNode.data);
            process(printNode.leftChild);
            process(printNode.rightChild);
        }


        ArrayList<LinkedList<Integer>> allSequences(Node node){
            ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
          //  System.out.println(node);
            if(node == null){
                result.add(new LinkedList<Integer>());
                return result;
            }

            LinkedList<Integer> prefix = new LinkedList<Integer>();
            prefix.add(node.data);
            ArrayList<LinkedList<Integer>> leftSeq = allSequences(node.leftChild);
            ArrayList<LinkedList<Integer>> rightSeq = allSequences(node.rightChild);
            
            for(LinkedList<Integer> left : leftSeq){
                for(LinkedList<Integer> right : rightSeq){
                    ArrayList<LinkedList<Integer>> weaved = new ArrayList<LinkedList<Integer>>();
                    weavedList(left, right, weaved, prefix);
                    result.addAll(weaved);
                }
            }
            return result;

        }

        void weavedList(LinkedList<Integer> first, LinkedList<Integer> second, ArrayList<LinkedList<Integer>> results, LinkedList<Integer> prefix){


            if(first.size() == 0 || second.size()==0){
                LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
                result.addAll(first);
                result.addAll(second);
                results.add(result);
                return;
            }

            int headFirst = first.removeFirst();
            prefix.addLast(headFirst);
            weavedList(first, second, results, prefix);
            prefix.removeLast();
            first.addFirst(headFirst);

            System.out.println("headFirst"+headFirst);
            int headSecond = second.removeFirst();
            prefix.addLast(headSecond);
            weavedList(first, second, results,prefix);
            prefix.removeLast();
            second.addFirst(headSecond);
            System.out.println("headFirst"+headFirst);
        }
}