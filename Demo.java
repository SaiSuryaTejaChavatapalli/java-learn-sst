class Student{
  int rollNo;
  int marks;
  String name;
}

public class Demo {
    public static void main(String a[]){
      int nums[]={1,2,3};
      System.out.println(nums[0]);


      int threeDArray[][]=new int[3][4];
      for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            threeDArray[i][j]= (int)(Math.random()*10);
        }
        }
      
      for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            System.out.print(threeDArray[i][j]+" ");

        }
        System.out.println();
      }

      for(int i[]:threeDArray){
        for(int j:i){
            System.out.print(j+" ");
        }
        System.out.println();
      }

      //Jagged Array
      int jaggedArray[][]=new int[3][];
      jaggedArray[0]=new int[4];
      jaggedArray[1]=new int[2];
      jaggedArray[2]=new int[5];

      for(int i=0;i<jaggedArray.length;i++){
        for(int j=0;j<jaggedArray[i].length;j++){
            jaggedArray[i][j]=(int)(Math.random()*10);
        }
      }
      for(int i[]:jaggedArray){
        for(int j:i){
            System.out.print(j+" ");
        }
        System.out.println();
      }


      // Array of objects

      Student s1=new Student();
      s1.name="Sai";
      s1.marks=99;
      s1.rollNo=1;

      Student s2=new Student();
      s2.name="Surya";
      s2.marks=86;
      s2.rollNo=2;

      Student s3=new Student();
      s3.name="Teja";
      s3.marks=79;
      s3.rollNo=3;


      System.out.println(s1); // will print Address of the object

      Student students[]=new Student[3];
      students[0]=s1;
      students[1]=s2;
      students[2]=s3;

      for(int i=0;i<students.length;i++){
        System.out.println(students[i].name+":"+students[i].marks);
      }

      // Enhanced for loop

      int numsArray[]={1,2,3};
      System.out.println("Enhanced for loop");
      for (int n:numsArray){
        System.out.println(n);
      }

    }
}
