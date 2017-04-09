import java.io.*;

public class isUnique{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str1 = br.readLine();
            String str = str1.toLowerCase();
            boolean ch[] = new boolean[200];
            for(int i=97;i<=122;i++){
                ch[i] = false;
            }
            for(int i=0;i<str.length();i++){
                int num = (int)str.charAt(i);
                if(ch[num] == false){
                    ch[num] = true;
                    System.out.println(ch[num]);
                    if(i == str.length()-1){
                         System.out.println("The string is unique");
                    }
                }
                else{
                    System.out.println("The string is not unique");
                    break;
                }
            }
    }
}