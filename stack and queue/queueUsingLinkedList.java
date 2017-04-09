import java.io.*;
import java.util.*;

public class queueUsingLinkedList{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> ll = new LinkedList<String>();
        int choice;
        String animal;
        int index;
        boolean check  = true; 
        while(check){
            System.out.println("Enter 1 to add Dog or Cat , 2 to take the oldest of all, 3 to take oldest Dog or Cat, 4 to see the elements and 5 to exit");
            choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                    System.out.println("you want to add Dog or Cat");
                    animal = br.readLine();
                    ll.add(animal);
                    break;
                
                case 2: 
                    ll.removeFirst();
                    break;

                case 4:
                    System.out.println("The animals in the shelters are ");
                    for(String s : ll){
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.println("Which Animal do you want");
                    animal = br.readLine();
                    index = ll.indexOf(animal);
                    ll.remove(index);
                    break;
                    

                case 5:
                    check = false;
                    break;

            }
        }
    }
}