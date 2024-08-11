class Calculator{
    int x;
    public int add(int num1,int num2){

        int r=num1+num2;
        return r;
    }
}

class Computer{
    public void playMusic(){
        System.out.println("Playing music");
    }
    public String getMePen(int cost){
        if(cost>=10) return "Pen";
        return "Nothing";
    }
}

public class Demo {
    public static void main(String a[]){
        int num1=4;
        int num2=5;
        //System.out.println(num1+num2);
        Calculator calc=new Calculator();
        int result=calc.add(num1,num2);
        System.out.println(result);

        Computer com=new Computer();
        com.playMusic();
        String pen=com.getMePen(2);
        System.out.println(pen);
        String pen1=com.getMePen(12);
        System.out.println(pen1);
    }
}
