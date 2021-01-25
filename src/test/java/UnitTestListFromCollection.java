import ObjectOrientedProgramming.Lists.CollectionToArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

import static org.codehaus.groovy.runtime.InvokerHelper.asList;
import static org.junit.Assert.assertEquals;

public class UnitTestListFromCollection {
    CollectionToArrayList c = new CollectionToArrayList();

    ArrayList<Integer> arrayList3 = new ArrayList<>();
    public Stream<Integer> streamInt = Stream.of(1, 2, 3, 4, 5);

    ArrayList<String> namesList = new ArrayList<>();
    public Stream<String> streamString = Stream.of("Fatih", "Rola", "Yusuf", "Elanur", "Harun");


    @Test
//    Integer List
    public void integerListFromCollectionsSysPrint() {
        // Convert Stream to ArrayList in Java
        ArrayList<Integer> arrayList = c.getArrayListFromStream(streamInt);
        System.out.println(arrayList);
    }

    @Test
//    Integer List
    public void integerListFromCollectionsAssertion() {
        arrayList3.add(1);
        arrayList3.add(2);
        arrayList3.add(3);
        arrayList3.add(4);
        arrayList3.add(5);

        // Convert Stream to ArrayList in Java
        List<ArrayList<Integer>> arrayList1 = asList(c.getArrayListFromStream(streamInt));
        System.out.println(arrayList1);

        assertEquals(arrayList1, arrayList3);

    }

    @Test
//    String List
    public void stringListFromCollectionsAssertion() {
        namesList.add("Fatih");
        namesList.add("Rola");
        namesList.add("Yusuf");
        namesList.add("Elanur");
        namesList.add("Harun");

        // Convert Stream to ArrayList in Java
        List<ArrayList<String>> arrayList1 = asList(c.getArrayListFromStream(streamString));
        System.out.println(arrayList1);

        assertEquals(arrayList1, namesList);

    }

    @Test
//    String List Assertion Exact value
    public void stringListFromCollectionsAssertionExact() {
        namesList.add("Fatih");
        namesList.add("Rola");
        namesList.add("Yusuf");
        namesList.add("Elanur");
        namesList.add("Harun");

        // Convert Stream to ArrayList in Java
        List<ArrayList<String>> arrayList1 = asList(c.getArrayListFromStream(streamString));
        System.out.println(arrayList1.get(0));

        assertEquals(arrayList1.get(0), "Fatih");

    }

    @Test
//    Integer List
    public void integerListFromCollectionsAssertionExact() {
        arrayList3.add(1);
        arrayList3.add(2);
        arrayList3.add(3);
        arrayList3.add(4);
        arrayList3.add(5);

        // Convert Stream to ArrayList in Java
        List<ArrayList<Integer>> arrayList1 = asList(c.getArrayListFromStream(streamInt));
        System.out.println(arrayList1.get(0));

        assertEquals(arrayList1.get(0), 1);

    }
}
