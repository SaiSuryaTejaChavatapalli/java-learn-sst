import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        
        Map<String,Integer> marksData=new HashMap<String,Integer>();
        marksData.put("Sai", 90);
        marksData.put("Surya", 100);
        marksData.put("Harshi", 100);
        System.out.println(marksData); //Print the Map
        System.out.println("Surya Marks:"+marksData.get("Surya")); //get
        System.out.println("Keys:"+marksData.keySet()); //Keys
        System.out.println("Values:"+marksData.values());
        //Print values using loop
        for (String s:marksData.keySet()){
            System.out.println(s+":"+marksData.get(s));
        }
    }
}
