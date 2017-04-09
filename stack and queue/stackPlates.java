import java.io.*;
import java.util.*;

public class stackPlates{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Stack> a = new ArrayList<Stack>();
        int limitOfStack = 5;
        int arraySize =0;
        int sizeOfStack = 0;
        int num =0;
        int choice;
        boolean check = true;
        while(check){
            System.out.println("Enter 1 to add, 2 to pop and 3 to exit");
            choice = Integer.parseInt(br.readLine());
                switch(choice){
                    case 1:
                        if(a.isEmpty()){
                            a.add(new Stack());
                            System.out.println("The no of stack is " + a.size());
                        }
                        arraySize = a.size() - 1;
                        sizeOfStack = a.get(arraySize).size();
                        //System.out.println(a.get().size());
                        
                        if(sizeOfStack == limitOfStack){
                            System.out.println("The no of stack is " + a.size());
                            a.add(new Stack());
                            arraySize = a.size() - 1;
                        }
                        System.out.println("Enter the element you want to add to stack");
                        num = Integer.parseInt(br.readLine());
                        a.get(arraySize).push(num);
                        //System.out.println("The size of the stack is " + a.get(arraySize).size());
                        break;
                    case 2:
                        if(a.isEmpty() || a.get(0).isEmpty()){
                            System.out.println("The stack is empty");
                        }
                        else{
                            arraySize = a.size() - 1;
                            //sizeOfStack = a.get(arraySize).size();
                            System.out.println(a.get(arraySize).pop());
                            break;

                        }
                    case 3:
                        check = false;
            }
        }
        
    }
}