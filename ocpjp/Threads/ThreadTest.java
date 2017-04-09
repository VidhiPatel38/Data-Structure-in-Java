class ThreadTestA extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println("Hey this is a ThreadTestA class");
        }
    }
}

public class ThreadTest{
    public static void main(String args[]){
        ThreadTestA a = new ThreadTestA();
        a.start();
        System.out.println("This is the ThreadTest class");
    }
}