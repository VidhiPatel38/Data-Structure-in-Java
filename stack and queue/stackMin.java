import java.io.*;
import java.util.*;

public class stackMin{
     static ArrayList<Integer> al = new ArrayList<Integer>();
     static ArrayList<Integer> minValue = new ArrayList<Integer>();
        
    public static void main(String args[]) throws IOException{
         int choice;
         boolean flag = true;
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         while(flag){
            System.out.println("To add element enter 1, to delete element enter 2 and to see the elements enter 3 and 4 to exit and 5 to see the minimum element");
            choice = Integer.parseInt(br.readLine()); 
            switch(choice){
                case 1 :
                    System.out.println("Enter the element to add");
                    int num1 = Integer.parseInt(br.readLine()); 
                    push(num1); 
                    break;
                case 2 :  
                    pop();
                    break;
                case 3 :
                    System.out.println("Contents of al: " + al);
                    break;
                case 4 :
                    flag = false;
                    break;
                case 5 : 
                    int s = minValue.size();
                    System.out.println("The min element " + minValue.get(s-1));
                    break;
            }  
         }
    }

            public static void push(int num){
                boolean check = empty();
                if(check){
                    minValue.add(num);
                    al.add(num);
                }
                else{

                    int a = minCheck();
                    if(num<a){
                        minValue.add(num);
                    }
                    al.add(num);
                }
                
            }

            public static boolean empty(){
                if(al.isEmpty()){
                    return true;
                }
                return false;
            }

            public static void peek(){
                if(al.isEmpty()){
                   // return 0;
                }
                else{
                    int s = al.size();
                    System.out.println("The poped element " + al.get(s-1));
                   // break;
                }
            }

            public static void pop(){
                int s = al.size();
                int n1 = al.remove(s-1);
                int b = minCheck();
                if(n1 == b){
                    int s2 = minValue.size();
                    int s3 = minValue.remove(s2-1);
                }
                System.out.println("The poped element " + n1);
            }

            public static int minCheck(){
                if(minValue.isEmpty()){
                    return 0;
                }
                else{
                    int s = minValue.size();
                    int m2 = minValue.get(s-1);
                    return m2;
//                    break;
                }
            }

         }       
