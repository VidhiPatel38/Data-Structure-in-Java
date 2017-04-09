import java.io.*;
import java.util.*;

public class stackArrayImplement{
    public static void main(String args[]) throws IOException{
         int choice;
         ArrayList<Integer> al = new ArrayList<Integer>();
         al.add(8);
         al.add(1);
         al.add(2);
         al.add(3);
         al.add(4);
         boolean flag = true;
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         while(flag){
            System.out.println("To add element enter 1, to delete element enter 2 and to see the elements enter 3 and 4 to exit");
            choice = Integer.parseInt(br.readLine()); 
            switch(choice){
                case 1 : 
                    System.out.println("ENter the element to add");
                    int num = Integer.parseInt(br.readLine());
                    al.add(num);
                    break;
                // System.out.println("Contents of al: " + al);
                case 2 :  
                    int s = al.size();
                    System.out.println("The poped element " + al.remove(s-1));
                    break;
                case 3 :
                    System.out.println("Contents of al: " + al);
                    break;
                case 4 :
                    flag = false;
                    break;
            }  
         }       
    }
}