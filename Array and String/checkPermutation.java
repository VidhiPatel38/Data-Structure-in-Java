import java.io.*;

public class checkPermutation{
    public static void main(String args[]) throws IOException{
        int count=0;
        System.out.println("Enter the first string");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String str = br.readLine();
         StringBuilder str1 = new StringBuilder(str);
        System.out.println("Enter the second string");
        String str3 = br.readLine();
         StringBuilder str2 = new StringBuilder(str3);
        if(str1.length()==str2.length()){
            loop1: 
            for(int i=0; i<str1.length();i++){
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        count++;
                        str2.deleteCharAt(j);
                        continue loop1;
                    }
                }
            }
            if(str1.length()==count){
                System.out.println("The string are the permutations of each other");
            
        }
        else{
            System.out.println("There is no permutation of string");
        }
        }
        else{
            System.out.println("There is no permutation of string");
        }
    }
}