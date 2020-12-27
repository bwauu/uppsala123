package Uppgift4;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Dictionary {

    private HashMap<String, List<String>> dictionary = new HashMap<>();

    public Dictionary() {
        dictionary.put("bil", Collections.singletonList("car"));
        dictionary.put("hus", Collections.singletonList("house"));
        dictionary.put("springa", Collections.singletonList("run"));
        dictionary.put("blå", Collections.singletonList("blue"));
        dictionary.put("baka", Collections.singletonList("bake"));
        dictionary.put("hoppa", Collections.singletonList("jump"));
        dictionary.put("simma", Collections.singletonList("swim"));
        dictionary.put("måne", Collections.singletonList("moon"));
        dictionary.put("väg", Collections.singletonList("road"));
        dictionary.put("snäll", Collections.singletonList("kind"));

    }

}
