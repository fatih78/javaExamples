import FatihObjectOrientedProgramming.Lists.CollectionToArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

import static FatihObjectOrientedProgramming.Lists.CollectionToArrayList.*;
import static org.codehaus.groovy.runtime.InvokerHelper.asList;
import static org.junit.Assert.assertEquals;

public class UnitTestListFromCollection {
    int result;
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
//    Integer List Assertion Exact value
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

    @Test
    public void addIntegerValuesInLoop(){
        Stream<Integer> streamInt2 = Stream.of(1, 2, 3, 4);
        List<ArrayList<Integer>> arrayList2 = asList(c.getArrayListFromStream(streamInt2));

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        for (int i = 0; i < l1.size(); i++) {
             result = l1.get(i);
            System.out.println(result);
        }
        assertEquals(arrayList2, l1);
    }

    @Test
    public void addIntegerValuesInLoopExact(){
        int n = 5;
        for (int i = 0; i <= n ; i++) {
            l1.add(i);
        }
        System.out.println(l1);
        result = l1.get(0);
        assertEquals(result, 0);
    }

    @Test
    public void addAndRemoveIntegerValues(){
        list.add("hello");
        list.add(1, "sunny");
        list.add(2, "world");
        assertEquals(expected, list);

        list.remove("hello");
        assertEquals(expected2, list);

    }
}
