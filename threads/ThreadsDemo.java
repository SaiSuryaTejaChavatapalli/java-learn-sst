package threads;



class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
        }
    }
}

 class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
        System.out.println("Hello");
        }
    }
}

public class ThreadsDemo {
    public static void main(String[] args) {
        A obj1=new A();
        obj1.start();
        B obj2=new B();
        obj2.start();
        System.out.println("hello");
    }
}
