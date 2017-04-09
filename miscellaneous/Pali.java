public class Pali{
    
    public static void main(String args[]){
        String max=null;
        String s = "babad";
        for(int i = 0; i < s.length();i++){
           // System.out.println("HEllo");
             String s1 = s.substring(i);
             System.out.println("s1 length" + s1.length());
             int k =0;
             int m = s1.length();
            for(int j =0; j<s1.length();j++){
                
               System.out.println(max);
                System.out.println(m-k);
                String s2 = s1.substring(0,m-k);
                k++;
                StringBuffer originalStr = new StringBuffer(s2);            
                StringBuffer reverseStr = new StringBuffer(s2);
                reverseStr.reverse();
              //  System.out.println(originalStr);
                // System.out.println(reverseStr);
                 System.out.println(originalStr.toString().equals(reverseStr.toString()));
              //  System.out.println(originalStr.equals(reverseStr));
                if(originalStr.toString().equals(reverseStr.toString())){
                    if(max == null){
                        max = s2;
                    }
                    else if(max.length() < s2.length()){
                        max = s2;
                    }
                    else{

                    }
                }
            }
        }
      //  System.out.println("HIIII" + max);
    }
    
}