package collectionInJava.map;
import java.util.HashMap;
import java.util.Map;
public class Example3 {
    public static void main(String[] args) {
      Map<Integer,String>hashmap=new HashMap<>();

      Map<String,Map<Integer,String>> hm=new HashMap<>();
      hm.put("MH",new HashMap<>());
      hm.get("MH").put(0,"NGP");
      hm.get("MH").put(1,"pune");
      hm.get("MH").put(2,"mumbai");
      hm.put("UP",new HashMap<>());
      hm.get("UP").put(0,"aayodhya");
      hm.get("UP").put(1,"Vrindavan");
      hm.get("UP").put(2,"Gokul dham");
        System.out.println(hm);

    }
}
