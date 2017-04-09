import java.io.*;
public class dublicateNum{
    public static void main(String arg[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of array");
        int num = Integer.parseInt(br.readLine());
        int a[] = new int[num];
        int count = 1;
         System.out.println("Enter the numbers");
        for(int i=0;i<num;i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<num;i++){
        System.out.println(a[i]);
        }
        for(int i=0;i<num;i++){
            count =1;
            for(int j=i+1;j<num;j++){
                if(a[i]==a[j]){
                    a[j] = 0;
                    count++;
                }
               
            }
             if(count > 1){
                    a[i] = 0;
                }
        }
                 

        for(int i=0;i<num;i++){
            if(a[i] > 0){
                 System.out.println("the numbers is");
                System.out.println(a[i]);
            }
        }
    }
}