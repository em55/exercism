import java.util.List;
import java.util.Map;
import java.util.*;

public class Etl {
  public Map<String, Integer> transform(Map<Integer, List<String>> oldMap) {
    Map<String, Integer> newMap = new HashMap<String, Integer>();

    for (Integer score : oldMap.keySet())
      for (String letter : oldMap.get(score)) {
        newMap.put(letter.toLowerCase(), score);
      }
    //newMap =Collections.unmodifiableMap(newMap);
    return newMap;
  }
}

