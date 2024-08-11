

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
    }
}
