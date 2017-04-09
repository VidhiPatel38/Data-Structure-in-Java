public class recursiveTest{
    public static void main(String args[]){
        int n = 5;
        fact(5);
    }

    public static void fact(int n1){
        if(n1 == 1){
            System.out.println("The number is " + n1);
        }
        else{
            fact(n1-1);
            System.out.println("The number is "+ n1);
        }
    }
}