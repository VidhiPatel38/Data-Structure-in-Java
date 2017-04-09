import java.io.*;
public class checkPermutationBook{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first String");
        String str = br.readLine();
        System.out.println("Enter the String2");
        String str1 = br.readLine();
        int per[] = new int[200];
        if(str.length()==str1.length()){
        for(int i=0; i<str.length();i++){
            int num = (int)str.charAt(i);
            per[num]++;
        }
        for(int i=0; i<str1.length();i++){
            int num = (int)str1.charAt(i);
            per[num]--;
            if(per[num]<0){
                System.out.println("There is no permutation");
                break;
            }
            if(i==str1.length()-1){
                  System.out.println("There is permutation");
            }
        }
        }
        else{
                System.out.println("There is no permutation");
        }
    }
}