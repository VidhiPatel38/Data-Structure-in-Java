import java.io.*;
public class oneAway{
    public static void main(String args[]) throws IOException{
        int ch[] = new int[200];
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first String");
        String str3 = br.readLine();
        System.out.println("Enter the Second String");
        String str4 =  br.readLine();
        StringBuilder str1 = new StringBuilder(str3);
        StringBuilder str2 = new StringBuilder(str4);
        if(str1.equals(str2)){
            System.out.println("The output is true");
        }
        else{
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    str2.deleteCharAt(j);
                }
            }
        }
        if(str2.length()>1){
            System.out.println("not true");
        }
        else{
            System.out.println("true");
        }
    }
}
}



/*
 for(int i=0;i<str1.length();i++){
                int num = (int)str1.charAt(i);
                ch[num]++;
            }
            for(int i=0;i<str2.length();i++){
                int num = (int)str2.charAt(i);
                ch[num]++;
            }
            for(int i=0;i<200;i++){
                if(ch[i]==1){
                    count++;
                    if(count > 1){
                        break;
                    }
                }
            }
        }
        if(count >= 2){
             System.out.println("The output is false");
        }
        else{
             System.out.println("The output is true");
        }
        */