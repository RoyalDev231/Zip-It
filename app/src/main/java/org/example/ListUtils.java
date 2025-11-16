package org.example;
import java.util.ArrayList;
import java.util.List;




public class ListUtils {

    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();

        int max = Math.max(list1.size(), list2.size());

        for (int i = 0; i < max; i++) {
            if (i < list1.size()) {
                result.add(list1.get(i));
            }
            if (i < list2.size()) {
                result.add(list2.get(i));
            }
        }

        return result;
    }
}
