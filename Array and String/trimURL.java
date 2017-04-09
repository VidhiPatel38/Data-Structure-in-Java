import java.io.*;
public class trimURL{
    public static void main(String args[]) throws IOException{
        System.out.println("Enter the String");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str3 ="";
        String str1 = str.trim();
        String strArr[] = str1.split(" ");
        for(int i=0; i<strArr.length;i++){
            if(i < strArr.length-1){
            str3 = str3 + strArr[i] + "%20";
            }
            else{
                str3 = str3 + strArr[i];
            }
        }
        System.out.println(str3);
    
    }
}
