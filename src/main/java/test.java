import jdk.nashorn.internal.runtime.logging.Logger;
import org.junit.*;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass");
    }

    @Before
    public void before() {
        System.out.println("before");
    }

    @AfterClass
    public static void AfterClass() {
        System.out.println("AfterClass");
    }

    @Test
    public void test() {
        System.out.println("test");
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(3);

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + ",");
        }
        for (Integer i : list) {
            System.out.println(i+",");
        }
    }



    @After
    public void after() {
        System.out.println("after");
    }
}
