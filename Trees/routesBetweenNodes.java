import java.io.*;

public class routesBetweenNodes{
    
    public static class Graph{
        Node [] nodes;
        public Graph(){
            nodes = new Node[4];
        }
    }

    public static class Node{
        String name;
        boolean visited = false;
        Node[] children;

    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Graph g1 = new Graph();
        g1.nodes[0] = new Node();
        g1.nodes[0].name = "A";
        g1.nodes[0].children = new Node[2];

        g1.nodes[1] = new Node();
        g1.nodes[1].name = "B";
        g1.nodes[1].children = new Node[1];

        g1.nodes[2] = new Node();
        g1.nodes[2].name = "C";
        g1.nodes[2].children = new Node[1];
        
        g1.nodes[3] = new Node();
        g1.nodes[3].name = "D";
        g1.nodes[3].children = null;

        g1.nodes[0].children[0] = g1.nodes[1];
        g1.nodes[0].children[1] = g1.nodes[3];
        g1.nodes[1].children[0] = g1.nodes[2];
        g1.nodes[2].children[0] = g1.nodes[0];
        
        System.out.println(g1.nodes[3].children);
        System.out.println("Enter the start point of Node");
        System.out.println("Enter the End point of Node");
        String start = br.readLine();
        String end = br.readLine();
        Node startPoint=null;
        for(int i=0;i<g1.nodes.length;i++){
           // System.out.println(g1.nodes[i].name);
            if(g1.nodes[i].name.equals(start)){
                System.out.println("The start point is");
                startPoint = g1.nodes[i];
                break;
            }
        }
        
        for(int i=0;i<g1.nodes.length;i++){
                if(g1.nodes[i].children == null){
                    break;
            }   
            else{
                
                System.out.println("The next element is "+ );
            }

        }

    }
}