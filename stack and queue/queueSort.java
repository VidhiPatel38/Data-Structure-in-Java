import java.util.*;
import java.io.*;

public class queueSort{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack a = new Stack();
        Stack b = new Stack();
        int choice;
        int num;
        int comp;
        boolean check = true;
        while(check){
            System.out.println("Enter 1 to push into stack, 2 to pop , 3 to see the stack and 4 to exit");
            choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1: 
                    System.out.println("Enter the element to be Pushed");
                    num = Integer.parseInt(br.readLine());
                    if(a.isEmpty()){
                        a.push(num);
                    }
                    else{
                        comp = (int)(a.peek());
                        if(num <= comp){
                            a.push(num);
                        }
                        else{
                            while((comp < num)){
                                b.push(a.pop());
                                if(a.isEmpty()){
                                    break;
                                }
                                comp = (int)(a.peek());

                            }
                            a.push(num);
                            while(!b.isEmpty()){
                                a.push(b.pop());
                            }
                            
                        }
                    }
                    break;
                
                case 2 : 
                    a.pop();
                    break;
                
                case 3 : 
                    System.out.println("The elements of the sorted stack is " + a);
                    break;

                case 4 :
                    check = false;
                    break;
                
                default :
                    check = false;
                    break;
            }
        }



    }
}