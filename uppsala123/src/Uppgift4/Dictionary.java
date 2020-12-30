package Uppgift4;

import java.util.List;
import java.util.Map;

public class Dictionary {


    private Map<String, List<String>> dictionary;
    public Dictionary(Map<String, List<String>> dictionary) {
        this.dictionary = dictionary;
        dictionary.put("bil", List.of("car", "runcarsnowpen"));
        dictionary.put("hus", List.of("house"));
        dictionary.put("springa", List.of("run"));
        dictionary.put("blå", List.of("blue"));
        dictionary.put("baka", List.of("bake"));
        dictionary.put("hoppa", List.of("jump"));
        dictionary.put("simma", List.of("swim"));
        dictionary.put("måne", List.of("moon"));
        dictionary.put("väg", List.of("road"));
        dictionary.put("snäll", List.of("kind", "sweet"));
    }

}
