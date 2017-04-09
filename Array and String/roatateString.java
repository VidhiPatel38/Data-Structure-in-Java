import java.io.*;
public class roatateString{
    public static void main(String args[]) throws IOException{
        System.out.println("Enter the first String");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        System.out.println("Enter the second String");
        String str2 = br.readLine();
        int count = 0;
        String str3;
        int match =0;
        int l = str1.length();
        if(str1.length() == str2.length()){
            ag :
            for(int i=0;i<str1.length();i++){
                for(int j=match;j<str2.length();j++)
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;
                    match = j+1;
                    continue ag;
                }
             
            }
            int n1 = l-count-1;
            System.out.println(n1);
            String s1 = str1.substring(0,n1);
            String s2 = str1.substring(n1);
            String s3 = s1+s2;
            System.out.println("The rotated String is:" +s3);
          //  System.out.println(s2);
        }
        else{
            System.out.println("Not a roatateString");
        }

    }
}