class Calculator{
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1, int n2){
        return (int)n1+n2;
    }
}

// class Computer{
//     public void playMusic(){
//         System.out.println("Playing music");
//     }
//     public String getMePen(int cost){
//         if(cost>=10) return "Pen";
//         return "Nothing";
//     }
// }

public class Demo1 {
    public static void main(String a[]){
        int num1=4;
        int num2=5;
        //System.out.println(num1+num2);
        Calculator calc=new Calculator();
        int result1=calc.add(num1,num2);
        System.out.println(result1);

        int result2=calc.add(1,2,3);
        System.out.println(result2);

        // int result3=calc.add(1.5,2);
        // System.out.println(result3);

        // Computer com=new Computer();
        // com.playMusic();
        // String pen=com.getMePen(2);
        // System.out.println(pen);
        // String pen1=com.getMePen(12);
        // System.out.println(pen1);
    }
}
