import java.io.*;
public class rotateMatrixCTCI{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first String");
        String str1 = br.readLine();
        System.out.println("Enter the second String");
        String str2 = br.readLine();
        boolean checkRotation = isString(str1,str2);
        if(checkRotation){
            System.out.println("The string is rotation");
        }
        else{
            System.out.println("The string is not rotation");
        }
    }

    public static boolean  isString(String str1, String str2){
        String s3 = str1+str1;
        return (s3.contains(str2));
    }
}