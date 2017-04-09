import java.io.*;
import java.util.*;
public class BFS{
    static class Graph{
        Node[] nodes;
        public Graph(int n){
        nodes = new Node[n];
        System.out.println("The node array is " + nodes.length);
        }

    }

    public static class Node implements Comparable<Node>{
        boolean visited = false;
        String name;
        Node[] children;        

        public int compareTo(Node b) {  
            if(b == null){  
            return 0;  
            }
            else{  
                return 1;  
            }  
}  
    }
    public static void main(String args[]){
        // ArrayList<String> a = new ArrayList<String>();
       //  Map<String,ArrayList<String>> multiMap = new HashMap<String,ArrayList<String>>();
        Map multiMap = new HashMap();
        Graph g1 = new Graph(5);
        g1.nodes[0] = new Node();
        g1.nodes[0].name = "A";
        g1.nodes[0].children  = new Node[3];
        

        g1.nodes[1] = new Node();
        g1.nodes[1].name = "B";
        g1.nodes[1].children  = new Node[2];

        g1.nodes[2] = new Node();
        g1.nodes[2].name = "C";
        g1.nodes[2].children  = new Node[1];

        g1.nodes[3] = new Node();
        g1.nodes[3].name = "D";
        g1.nodes[3].children  = new Node[2];

        g1.nodes[4] = new Node();
        g1.nodes[4].name = "E";
        g1.nodes[4].children  = new Node[2];

        g1.nodes[0].children[0] =  g1.nodes[1];
        g1.nodes[0].children[1] =  g1.nodes[2];
        g1.nodes[0].children[2] =  g1.nodes[3];

        g1.nodes[1].children[0] =  g1.nodes[0];
        g1.nodes[1].children[1] =  g1.nodes[4];
       
        g1.nodes[2].children[0] =  g1.nodes[1];

        g1.nodes[3].children[0] =  g1.nodes[1];
        g1.nodes[3].children[1] =  g1.nodes[4];
        
        g1.nodes[4].children[0] =  g1.nodes[1];
        g1.nodes[4].children[1] =  g1.nodes[3];

       // multiMap.add    
        for(int i=0; i<g1.nodes.length;i++){
         //   ArrayList<String> a = new ArrayList<String>();
            ArrayList a = new ArrayList();
            System.out.println("The neighbors of " + g1.nodes[i].name + " are");
            for(int j=0; j < g1.nodes[i].children.length;j++){
                //System.out.println(g1.nodes[i].children[j].name);
                a.add(g1.nodes[i].children[j]);
            }
            multiMap.put(g1.nodes[i],a);
        }
  
        // TO Display the map
       // for(Object s1 : multiMap.keySet()){
          //  System.out.println((Node)multiMap.get(s1).name);

        //}
        search(g1.nodes[0]);
       
    }

    public static void search(Node N1){
      Queue<Node> Q1 = new PriorityQueue<Node>();
      Q1.add(N1);
      while(!Q1.isEmpty()){
          N1 = (Node)Q1.poll();
          //System.out.println("nnn" + N1.name);
          if(N1.visited == false){
              N1.visited = true;
              System.out.println(N1.name);
              for(Node n2 : N1.children){                
                Q1.add(n2);
               // System.out.println("Push" +n2.name);
                    }    
                    Iterator itr=Q1.iterator();  
                    while(itr.hasNext()){  
                        Node n2 = (Node)itr.next();
                   // System.out.println(n2.name);  
}  
                }
          }
    }
}