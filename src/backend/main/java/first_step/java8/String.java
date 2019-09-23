package first_step.java8;


import java.util.*;


public class String {

    List<String> stringCollection = new ArrayList<>();

    private void StringCollection() {
        stringCollection
                .stream()
                .filter((s) -> s.stringCollection.contains("a"))
                .forEach(System.out::println);
    }

    private void StringCollection2() {

    }
}
