
import java.io.*;
import java.util.*;
public class queueUsingStack{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        boolean check = true;
        int choice;
        int num;
        while(check){
            System.out.println("Enter the 1 to push in queue, 2 to pop from Queue, 3 to print the Queue and 4 to Exit");
            choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1: 
                    System.out.println("Enter the number to be pushed in queue");
                    num = Integer.parseInt(br.readLine());
                    s1.push(num);
                    break;
                
                case 2:
                    while(!s1.isEmpty()){
                        s2.push(s1.pop());
                    }
                    s2.pop();
                    while(!s2.isEmpty()){
                        s1.push(s2.pop());
                    }
                    break;

                case 3:
                    System.out.println("The Elements of the Queue is ");
                    for(Integer n1 : s1){
                        System.out.println(n1);
                    }
                    break;
                
                case 4:
                    check = false;
                    break;
            }

        }
    }

}