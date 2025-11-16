package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ListUtilsTest {

    @Test
    void testZipEqualSizes() {
        List<Integer> a = List.of(1, 3, 5);
        List<Integer> b = List.of(2, 4, 6);

        List<Integer> result = ListUtils.zip(a, b);

        assertEquals(List.of(1, 2, 3, 4, 5, 6), result);
    }

    @Test
    void testZipUnequalSizesFirstLonger() {
        List<String> a = List.of("A", "B", "C", "D");
        List<String> b = List.of("1", "2");

        List<String> result = ListUtils.zip(a, b);

        assertEquals(List.of("A", "1", "B", "2", "C", "D"), result);
    }

    @Test
    void testZipUnequalSizesSecondLonger() {
        List<Integer> a = List.of(10);
        List<Integer> b = List.of(20, 30, 40);

        List<Integer> result = ListUtils.zip(a, b);

        assertEquals(List.of(10, 20, 30, 40), result);
    }

    @Test
    void testZipEmptyLists() {
        List<Object> a = List.of();
        List<Object> b = List.of();

        List<Object> result = ListUtils.zip(a, b);

        assertTrue(result.isEmpty());
    }

    @Test
    void testZipFirstEmpty() {
        List<String> a = List.of();
        List<String> b = List.of("X", "Y");

        List<String> result = ListUtils.zip(a, b);

        assertEquals(List.of("X", "Y"), result);
    }

    @Test
    void testZipSecondEmpty() {
        List<String> a = List.of("X", "Y");
        List<String> b = List.of();

        List<String> result = ListUtils.zip(a, b);

        assertEquals(List.of("X", "Y"), result);
    }
}
