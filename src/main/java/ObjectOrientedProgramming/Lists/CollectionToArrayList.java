package ObjectOrientedProgramming.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionToArrayList {

    // Function to get ArrayList from Stream
    public <T> ArrayList <T> getArrayListFromStream (Stream<T> stream) {

        // Convert the Stream to List
        List<T> list = stream.collect(Collectors.toList());

        // Return the ArrayList
        return new ArrayList<T>(list);

    }
}
