package assesment.codeverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TaskHashMap {
    public static void main(String[] args) {
        Map<Integer, Integer> inputMap = new HashMap<>();

        Integer lastValue = Integer.valueOf(args[args.length-1]);

        for(int i = 0; i < args.length -1; i+=2){
            inputMap.put(Integer.valueOf(args[i]), Integer.valueOf(args[i+1]));
        }
        Set<Map.Entry<Integer, Integer>> entries = inputMap.entrySet();

        boolean contains = inputMap.values().contains(lastValue);
        for ( Map.Entry<Integer, Integer> entry : inputMap.entrySet()) {
            Integer key = entry.getKey();
            key+=230;
            Integer value = entry.getValue();
        }
        inputMap.forEach((key, val) -> key += 23);
        inputMap.values().forEach(val -> val+=34);
        inputMap.forEach((key, val) -> System.out.println(key+"---" +val));


    }
}
