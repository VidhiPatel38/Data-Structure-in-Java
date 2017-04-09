import java.io.*;
public class fibo{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no you want for the Fibo Series");
        int n = Integer.parseInt(br.readLine());
        int previous=0;
        int current = 1;
        //int temp = 1;
        //System.out.print(previous);
        //System.out.print(current);
        int temp =0;
        for(int i=2;i<n;i++){
            temp = previous + current;
            previous = current;
            current = temp;
            //System.out.print(temp);
        }
        if(n==1){
            System.out.println(0);
        }
        else if(n==2){
            System.out.println(1);

        }
        else{
            System.out.println(temp);

        }

    }
}