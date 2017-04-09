public class Solution {
    public int romanToInt(String s) {
        LinkedList<Integer> st = new LinkedList<Integer>();
        char[] ch=s.toCharArray();
        int sum =0;
        int num1=0;
        int num2=0;
        for(int i=ch.length-1; i>=0 ;i--){
        char c = ch[i];
        switch(c){
            case 'I' : st.add(1);
            break;
            
            case 'V' : st.add(5);
            break;
            
            case 'X' : st.add(10);
            break;
            
            case 'L' : st.add(50);
            break;
                
            case 'C' : st.add(100);
            break;
                
            case 'D' : st.add(500);
            break;
                
            case 'M' : st.add(1000);
            break;
        }
        }
        if(!st.isEmpty()){
            num1 = st.removeLast();
            if(st.isEmpty()){
                return num1;
            }
        }
        while(!st.isEmpty()){
            num2 = st.removeLast();
            if(num1 >= num2){
                sum = sum + num1;
            }
            else{
                sum = sum - num1;
            }
            num1 = num2;
            if(st.isEmpty()){
                sum = sum + num1;
        }
    }
    return sum;
}
}