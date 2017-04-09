import java.io.*;
import java.util.*;
public class sortedMerge2{

    public static class Node{
         int data;
        Node next;
        public Node(int d){
            data = d;
        }
        
    }

    public static void main(String args[]) throws IOException{  
     //System.out.println("Enter the value for the partion");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(7);
        Node n4 = new Node(7);
        Node n5 = new Node(8);
        Node n6 = new Node(2);
        Node n7 = new Node(2);
        Node n8 = new Node(4);
        Node n9 = new Node(10);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        Node print1 = mergeMethod(n1,n6);
         do{            
                    System.out.println("The value of Node n1 is:=======" + print1.data);    
                    print1 = print1.next;              
        }while(print1 != null);

    }

    public static Node mergeMethod(Node l1, Node l2){
        Node newList = null;
        Node startList = null;
        while(l1 != null || l2 != null){
            if(l1 == null){
                Node new1 = l2.next;
                 l2.next = null;
                if(newList == null){
                    startList = l2;
                    newList = startList;
                    l2 = new1;
                }
                else{
                    newList.next = l2;
                    newList = l2;
                    l2 = new1;
                }   
            }
            else if(l2 == null ){
                Node new1 = l1.next;
                 l1.next = null;
                if(newList == null){
                    startList = l1;
                    newList = startList;
                    l1 = new1;
                }
                else{
                    newList.next = l1;
                    newList = l1;
                    l1 = new1;
                }   
            }
            
            else{
            if(l2.data < l1.data){
                 Node new1 = l2.next;
                 l2.next = null;

                if(newList == null){
                    startList = l2;
                    newList = startList;
                    l2 = new1;;
                }
                else{
                    newList.next = l2;
                    newList = l2;
                    l2 = new1;
                }
            }
            else{
                Node new1 = l1.next;
                 l1.next = null;
                if(newList == null){
                    startList = l1;
                    newList = startList;
                    l1 = new1;
                }
                else{
                    newList.next = l1;
                    newList = l1;
                    l1 = new1;
                }   
            }

            }
        }       
        return startList;
        }
       
    }


