import java.io.*;
public class stringCompression{
    public static void main(String args[]) throws IOException{
        int count =1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        String str1 = br.readLine();
        StringBuilder str2 = new StringBuilder(str1);
        StringBuilder str3 = new StringBuilder("");
        for(int i=0;i<str2.length();i++){
            count = 1;
            for(int j = i+1; j< str2.length();j++ ){
                
                if(str2.charAt(i)==str2.charAt(j)){
                    count++;
                }
                else{
                    System.out.println(count);
                    System.out.println(str2.charAt(i));
                    String str5 = str2.charAt(i) + "" + count;
                    str3.append(str5);
                    System.out.println(str3);
                    count--;
                    i = i + count;
                    System.out.println(i);
                    break;
                }
                if(j == str2.length()-1){
                    String str5 = str2.charAt(i) + "" + count;   
                    str3.append(str5);
                    count--;
                    i = i + count;
                    break;
                }
            }
            if((i == str2.length()-1) && (count ==1)){
                    String str5 = str2.charAt(i) + "" + count;   
                    str3.append(str5);
                    count--;
                    i = i + count;
                    break;
                }
        }
        if(str3.length()<str2.length()){
            System.out.println("the string is"+str3);
        }
        else{
            System.out.println("the string is"+str2);
        }
    }
}