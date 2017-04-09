import java.io.*;
import java.util.*;
public class sortedMerge{

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
        Node n5 = new Node(10);
        Node n6 = new Node(2);
        Node n7 = new Node(2);
        Node n8 = new Node(4);
        Node n9 = new Node(5);
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
        Node next1;
        Node current = l1;
        Node innerCurrent = l2;
        while(current != null){
            boolean b2 = true;
            boolean b1 = false;
            Node new2 = current.next;
            next1 = current.next;
            current.next = null;
            if(innerCurrent == null){
                newList.next = current;
                newList = current;
            }
            System.out.println("CUrrent" + current.data);
            while(innerCurrent != null){
                
                if(innerCurrent.data < current.data){

                    Node new1 = innerCurrent.next;
                    innerCurrent.next = null;
                    
                     if(newList == null){
                        startList = innerCurrent;
                        newList = startList;
                        innerCurrent = new1;
                        //newList.next = null;
                     }
                     else{
                         newList.next = innerCurrent;
                         newList = innerCurrent;
                         innerCurrent = new1;
                         //innerCurrent = innerCurrent.next;
                     }
                }
                else if(innerCurrent.data >= current.data && innerCurrent.data < next1.data ){

                    Node new1 = innerCurrent.next;
                    innerCurrent.next = null;
                    
                   // System.out.println(innerCurrent.data);
                    if(newList == null){
                         
                             startList = current;
                             newList = startList;
                             newList.next = innerCurrent;
                            newList = innerCurrent;
                            innerCurrent = new1;
                             b2 = false;
                             b1 = true;
                        
                        
                     }
                     else{
                         if(b2){
                            newList.next = current;
                            newList = current;
                            newList.next = innerCurrent;
                            newList = innerCurrent;
                            System.out.println(newList.data);
                            innerCurrent = new1;
                            b2 = false;
                            b1 = true;
                        }
                        else{
                         
                         
                         newList.next = innerCurrent;
                         System.out.println("innerCurrent"+newList.data);
                         newList = innerCurrent;
                         System.out.println(newList.data);
                         innerCurrent = new1;
                        }

                         //innerCurrent = innerCurrent.next;
                     }
                }
                else{
                    if(b1){
                        break;
                    }
                    else{
                    if(newList == null){
                        startList = current;
                        newList = startList;
                        break;
                    }
                    else{
                    newList.next = current;
                    newList = current;
                    break;
                    }
                    }
                }
            }
            current = new2;
            


        }
        return startList;
    }



}