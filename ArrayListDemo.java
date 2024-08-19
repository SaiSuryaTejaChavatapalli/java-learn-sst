
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class ArrayListDemo{
    public static void main(String[] args) {
     
        Collection<Integer> nums=new ArrayList<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(8);
        System.out.println("ArrayList:"+nums);

        // for(int i:nums){
        //     System.out.println(i);
        // }

        Set<Integer> nums1=new HashSet<Integer>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(2);
        System.out.println("Set:"+nums1);
    }
}
