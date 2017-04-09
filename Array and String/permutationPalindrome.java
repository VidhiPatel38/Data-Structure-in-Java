import java.io.*;
public class permutationPalindrome {
    public static void main(String args[]) throws IOException{
        int count =0;
        int odd =0;
        int even=0;
        int ch[] = new int[200];
        System.out.println("Enter the String");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        if(str1.length()%2 == 0){
            count++;
        }
        else{
            count = 0;
        }
        for(int i=0;i<str1.length();i++){
            int str2 = (int)str1.charAt(i);
            ch[str2]++;
        }
        for(int i=0;i<200;i++){
            
            if(ch[i] == 1){
                odd++;
            }
            else if(ch[i]>=2){
                System.out.println(ch[i]);
                int a = (ch[i]%2);
                if(a == 1){
                    odd++;
                }
            }
        }
        if(odd > 1){
            System.out.println("not palindrome");
        }
        else{
            System.out.println("palindrome");
        }

    }
}