import java.io.*;
import java.util.*;

class Graph{
    
    Node [] nodes;
    public Graph(int n){
        nodes = new Node[n];
    }
}

class Node{
    boolean visited = false;
    String name;
    Node[] children;
}

public class BuildOrder{

    LinkedList l = new LinkedList();
     Map multiMap = new HashMap();
    public static void main(String args[]){

        BuildOrder b2 = new BuildOrder();
       
        Graph g1 = new Graph(6);
        g1.nodes[0] = new Node();
        g1.nodes[0].name = "A";
        g1.nodes[0].children  = new Node[1];
        

        g1.nodes[1] = new Node();
        g1.nodes[1].name = "B";
        g1.nodes[1].children  = new Node[1];

        g1.nodes[2] = new Node();
        g1.nodes[2].name = "C";
        //g1.nodes[2].children  = new Node[1];

        g1.nodes[3] = new Node();
        g1.nodes[3].name = "D";
        g1.nodes[3].children  = new Node[1];

        g1.nodes[4] = new Node();
        g1.nodes[4].name = "E";
        //g1.nodes[4].children  = new Node[2];

        g1.nodes[5] = new Node();
        g1.nodes[5].name = "F";
        g1.nodes[5].children  = new Node[2];

        g1.nodes[0].children[0] =  g1.nodes[3];
       
        g1.nodes[1].children[0] =  g1.nodes[3];
       
        //g1.nodes[2].children[0] =  g1.nodes[1];

        g1.nodes[3].children[0] =  g1.nodes[2];
        
        g1.nodes[5].children[0] =  g1.nodes[0];
        g1.nodes[5].children[1] =  g1.nodes[1];

        b2.displayNode(g1);
       
        
       // Node check = displayOrder(g1.nodes[0]);
       for(int i=0;i<g1.nodes.length;i++){
           if(g1.nodes[i].visited == false){
               System.out.println("---------------"+g1.nodes[i].visited);
                b2.displayOrder(g1.nodes[i]);
           }
       }
        b2.disp();
       

       // multiMap.add    
    }
        void displayNode(Graph g1){
            for(int i=0; i<g1.nodes.length;i++){
            //ArrayList<String> a = new ArrayList<String>();
            ArrayList a = new ArrayList();
            System.out.println("The neighbors of " + g1.nodes[i].name + " are");
            if(g1.nodes[i].children != null){
            for(int j=0; j < g1.nodes[i].children.length;j++){
                System.out.println(g1.nodes[i].children[j].name);
                a.add(g1.nodes[i].children[j]);
                }
            }
            multiMap.put(g1.nodes[i],a);
        }
        }

        // to build an order
        void displayOrder(Node root){

            if(root.children == null){
                if(root.visited == false){
                root.visited = true;
                System.out.println(root.name);
                l.add(root.name);
                }
                return ;
               // root.visited = true;
                //l.add(root);
            }
                for(int i=0 ; i< root.children.length; i++){
                    displayOrder(root.children[i]);
                   if(root.visited == false){
                        root.visited = true;
                        l.add(root.name);
                        System.out.println(root.name);
                        return ;
                   }                   
                }
        }

        void disp(){
            System.out.println("The build order is " + l);
        }
}