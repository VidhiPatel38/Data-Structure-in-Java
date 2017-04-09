public class inorder{

    public static class Node{
        Node leftChild = null;
        Node rightChild = null;
        int name;
        
        public Node(int name){
            this.name = name;
        }
    }

    public static void main(String args[]){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);       
        n1.rightChild = n3;
        n1.leftChild = n2;
        n2.leftChild = n4;
        n2.rightChild = n5;
        printInOrder(n1);

        
    }

    public static void printInOrder(Node visit){
        if(visit.leftChild == null){
            System.out.println("The processNode is " + visit.name);   
        }
        else{
            
            printInOrder(visit.leftChild);
            
            rightChildPrint(visit.rightChild);
            System.out.println("The processNode is " + visit.name);  
        }
    }

    public static void rightChildPrint(Node visit){
        if(visit.rightChild == null){
            System.out.println("The processNode is " + visit.name);   
        }
        else{
            printInOrder(visit.leftChild);
            //System.out.println("The processNode is " + visit.name);  
        }

    }

}