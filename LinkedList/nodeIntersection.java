public class nodeIntersection{
    public static int len1 =0;
    public static int len2 =0;
    
    public static class Node{
        int data;
        Node next = null;
        public Node(int n){
            data = n;
        }
    }

        public static void main(String args[]){
            Node n1 = new Node(1);
            Node n2 = new Node(2);
            Node n3 = new Node(3);
            Node n4 = new Node(4);
            Node n5 = new Node(5);
            Node n6 = new Node(6);
            Node n7 = new Node(7);
            Node n8 = new Node(8);
            Node n9 = new Node(9);
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n7;
            n7.next = n8;
            n8.next = n9;
            n5.next = n6;
            n6.next = n7;
            len1 = nodeLength(n1);
            len2 = nodeLength(n5);
            System.out.println("The length of the Node is "+ len1);
            System.out.println("The length of the Node is "+ len2);
            Node intersectNode = intersectMethod(n1,n5);
            System.out.println("The intersected Node is " + intersectNode);
            System.out.println("The intersected Node is " + intersectNode.data);
            // Node intersectNode = intersectMethod(n1,n5);
        }

        public static Node intersectMethod(Node l1, Node l2){
            int diff = 0;
            int i=0;
            Node inter = null;
            Node pointOne = l1;
            Node pointTwo = l2;

            while(pointOne.next !=null){
                pointOne = pointOne.next;
            }
            while(pointTwo.next != null){
                pointTwo = pointTwo.next;
            }

             System.out.println(pointOne);
             System.out.println(pointTwo);

            if(pointOne == pointTwo){
                    if(len1 > len2){
                        diff = len1 - len2;
                        while(i < diff){
                            l1 = l1.next;
                            i++;
                        }
                    }
                    else if(len2 > len1){
                        diff = len2 - len1;
                        while(i< diff){
                            l2 = l2.next;
                            i++;
                        }
                    }
                    else{
                        
                    }
                    while(l1 != null || l2 != null){
                        if(l1 == l2){
                            //break;
                            return l1;
                        }
                        else{
                            l1 = l1.next;
                            l2= l2.next;
                        }
                    }
            }
            else {
                return inter;
            }
            return inter;
        }

        public static int nodeLength(Node m){
            int count =0;
            Node node1 = m;
            while(node1 != null){
                count++;
                node1 = node1.next;                
            }
            return count;
        }
}