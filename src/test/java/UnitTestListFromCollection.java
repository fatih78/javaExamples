import ObjectOrientedProgramming.Lists.CollectionToArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.Test;

import static org.codehaus.groovy.runtime.InvokerHelper.asList;
import static org.junit.Assert.assertEquals;

public class UnitTestListFromCollection {
    CollectionToArrayList c = new CollectionToArrayList();
    public Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);


    @Test
    public void integerListFromCollectionsSysPrint(){
        // Convert Stream to ArrayList in Java
        ArrayList<Integer> arrayList = c.getArrayListFromStream(stream);
        System.out.println(arrayList);
    }

    @Test
    public void integerListFromCollectionsAssertion(){
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(1);
        arrayList3.add(2);
        arrayList3.add(3);
        arrayList3.add(4);
        arrayList3.add(5);

        // Convert Stream to ArrayList in Java
        List<ArrayList<Integer>> arrayList1 = asList(c.getArrayListFromStream(stream));

        assertEquals(arrayList1, arrayList3);


        System.out.println(arrayList1);
        System.out.println(arrayList3);

    }
}
