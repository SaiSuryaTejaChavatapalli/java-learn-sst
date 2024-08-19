import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;




public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<Integer>();
        nums.add(14);
        nums.add(75);
        nums.add(21);
        System.out.println(nums);
        //Sort -changing original array
        Collections.sort(nums);
        System.out.println(nums);

        Comparator<Integer> comp=new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10>j%10){
                    return 1;
                }
                else{
                    return -1;
                }
                
            }
        };

    //Comparator
    Collections.sort(nums,comp);
    System.out.println("After comparator:"+nums);


    }
}
