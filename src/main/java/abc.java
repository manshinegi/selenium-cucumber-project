import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class abc {
    public static void main(String []args){
    HashMap<String , Integer>  map = new HashMap<String, Integer>();
    map.put("manhsi" , 1);
    map.put("aman" , 1);
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
           Map.Entry obj = (Map.Entry) iterator.next();
           obj.getKey();
           obj.getValue();
        }
    }
}
