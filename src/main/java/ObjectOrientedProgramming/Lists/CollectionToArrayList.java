package ObjectOrientedProgramming.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionToArrayList {
    public static List<Integer> l1 = new ArrayList<>();
    public static ArrayList<String> list = new ArrayList<>();

    public static List<String> expected = Arrays.asList("hello", "sunny", "world");
    public static List<String> expected2 = Arrays.asList("sunny", "world");


    // Function to get ArrayList from Stream
    public <T> ArrayList<T> getArrayListFromStream(Stream<T> stream) {

        // Convert the Stream to List
        List<T> list = stream.collect(Collectors.toList());

        // Return the ArrayList
        return new ArrayList<T>(list);

    }

}
