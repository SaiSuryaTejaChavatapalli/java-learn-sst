

//  abstract class Computer{
//     public abstract void code();
// }

interface Computer{
     void code();
}

// class Desktop extends Computer{
//     public void code(){
//         System.out.println("compile, run:faster");
//     } 
// }
class Desktop implements Computer{
    public void code(){
        System.out.println("compile, run:faster");
    } 
}

class Laptop implements Computer{
    public void code(){
        System.out.println("compile, run");
    }
}

class Developer{
    public void code(Computer lap){
        lap.code();
    }
}



public class InterfaceDemo {
    public static void main(String[] args) {
       Developer obj=new Developer();
       Computer lap=new Laptop();
       Computer desk=new Desktop();
       obj.code(desk);
    }
}
