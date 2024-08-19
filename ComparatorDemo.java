import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student implements Comparable<Student>{
    String name;
    int  age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    };

  
    public int compareTo(Student that) {
        if(this.age>that.age){
            return 1;
        }
        else{
            return -1;
        }
    }

    
}


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

        Comparator<Student> comp2=(i,j)->(i.age>j.age)?1:-1;

    //Comparator
    // Collections.sort(nums,comp);
    // System.out.println("After comparator:"+nums);


    List<Student> names=new ArrayList<Student>();
    names.add(new Student("Sai", 21));
    names.add(new Student("Teja", 80));
    names.add(new Student("Surya", 18));
    // System.out.println("Names:"+names);
    // Collections.sort(names,comp2);
    // System.out.println("Names after sort by age:"+names);
    Collections.sort(names);
    System.out.println("Nums after comparable:"+names);

    }
}
