import java.util.*;

public class WordCount {

  public Map<String, Integer> phrase(String words) {
    Map<String, Integer> wordCount = new HashMap<>();

    String[] wordSet = words.replaceAll("^[,\\s]+", "").split("[,\\s]+");

    for (String word : wordSet){
      word = word.replace("[^a-zA-Z]", "").toLowerCase();
      wordCount.put(word, !wordCount.containsKey(word) ? 1 : wordCount.get(word) + 1);
    }

    return wordCount;
  }
}
