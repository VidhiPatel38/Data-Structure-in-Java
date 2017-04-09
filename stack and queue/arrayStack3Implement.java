
import java.io.*;
public class arrayStack3Implement{

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size[] = new int[3];
        System.out.println("Enter the size of stack");
        int stackValue = Integer.parseInt(br.readLine());
        int StackSize[] = new int[3 * stackValue];
        //System.out.println("Enter the Stack no on whoch you want to perform the operation");
        //int stackNo = Integer.parseInt(br.readLine());
        int stackNo;
        boolean flag = true;
        while(flag){
        System.out.println("To add element enter 1, to delete element enter 2 and to see the elements enter 3 and 4 to exit");
        int choice = Integer.parseInt(br.readLine()); 
        System.out.println("Enter the Stack no on whoch you want to perform the operation");
        stackNo = Integer.parseInt(br.readLine());
        switch(choice)
        {
                   
            case 1 :
                  
                    if(StackSize[(stackNo-1)*stackValue] == 0){
                        System.out.println("ENter the element to 1111");
                        int stackNoValue;
                        System.out.println("ENter the element to add");
                        int num = Integer.parseInt(br.readLine());
                        stackNoValue = (stackNo-1)*stackValue + size[stackNo-1];
                        StackSize[stackNoValue] = num;
                        for(int i = 0;i<StackSize.length;i++){
                            System.out.println("The value of STack is " + StackSize[i]);
                        }
                    } 
                    else{
                        int stackNoValue;
                        System.out.println("ENter the element to add");
                        int num = Integer.parseInt(br.readLine());
                        //System.out.println("The value of STack is " + size[stackNo-1]);
                        size[stackNo-1]++;
                        //System.out.println("The value of STack is " + size[stackNo-1]);
                        stackNoValue = (stackNo-1)*stackValue + size[stackNo-1];
                        StackSize[stackNoValue] = num;
                        for(int i = 0;i<StackSize.length;i++){
                            System.out.println("The value of STack is " + StackSize[i]);
                        } 
                        }
                        break;
                    
                case 2 :  
                    int delValue ;
                    if(StackSize[stackNo-1] == 0){
                       System.out.println("The value of STack is empty");
                    }
                    else{
                         delValue = (stackNo-1)*stackValue + size[stackNo-1];
                         //System.out.println("The value of STack is " + delValue);
                         StackSize[(stackNo-1)*stackValue + size[stackNo-1]] = 0;
                         if(size[stackNo-1]==0){
                             size[stackNo-1] = 0; 
                         }
                         else{
                            size[stackNo-1]--; 
                         }
                         for(int i = 0;i<StackSize.length;i++){
                            System.out.println("The value of STack is " + StackSize[i]);
                        }

                    }
                    
                    break;
                case 3 :
                //    System.out.println("Contents of al: " + al);
                    break;
                case 4 :
                    flag = false;
                    break;
            }
         }


    }

}