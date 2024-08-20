import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(4,5,3,2);
        Stream<Integer> s=nums.stream();
        Stream<Integer> s1=s.filter(n->n%2==0);
        Stream<Integer> s2=s1.map(n->n*2);
        int result= s2.reduce(0,(a,c)->a+c);
        System.out.println("Result:"+result);


        int res=nums.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(a,c)->a+c);
        System.out.println("Res:"+res);
    }
}
