import java.util.*;
public class happyNumber{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        ArrayList<Integer> copy = new ArrayList<Integer>(); 
        ArrayList<Integer> notCopy = new ArrayList<Integer>(); 
       //ArrayList<Integer> copy ;
        int num = 0;
        for(int i=2;i<=100;i++){
            int unitDigit = 0;
            //
            int sum = 0;
            int unitSquare =0;
            num = i;
            int n1 = num;
            System.out.println(num);
            al.clear();
            // if(!notCopy.contains(n1) && !copy.conatins(n1) ){

            // }
            while(true){
                //int n1 = num;
                
                if(al.contains(n1)){
                    notCopy.addAll(al);
                    al.clear();
                    System.out.println("conatins");
                    break;
                }
                else if(copy.contains(n1)){
                    break;
                }
                else{
                //    if(!al.contains(num)){
                //        al.add(n1); 
                //    }
                }
                
                
                unitDigit = num%10;
                //System.out.println("unitDigit"+unitDigit);
                unitSquare = unitDigit * unitDigit;
                sum = sum + unitSquare;
                //System.out.println("sum"+sum);
                num = num/10;
                //System.out.println("num"+num);
                
                if(num == 0){
                    if(sum == 1){
                    //copy = (ArrayList<Integer>) al.clone();
                    System.out.println("------"+al);
                    copy.addAll(al);
                    copy.add(n1);
                    al.clear();
                    break;
                }
                else{
                    //notCopy.add(n1);
                    al.add(n1); 
                    n1 = sum;
                    num = sum;
                    sum =0;
                }
                }
            }
        }
        Set<Integer> hs = new HashSet<Integer>();
        hs.addAll(copy);
        copy.clear();
        copy.addAll(hs);
        for(int a : copy){
            if(a<100){
                System.out.println("The happy numbers is "+ a);
            }
        }
        
    }
}