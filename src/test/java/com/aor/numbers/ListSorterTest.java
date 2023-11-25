package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListSorterTest {

    private List<Integer> list;
    private List<Integer> expected;
    private ListSorter sorter;

    @BeforeEach
    public void Helper() {
        list = Arrays.asList(1,2,4,2,2,2,2,2);
        expected = Arrays.asList(1,2,2,2,2,2,2,4);
        sorter = new ListSorter();
    }

    @Test
    public void sort() {
        List<Integer> sorted = sorter.sort(list);

        Assertions.assertEquals(expected, sorted);
    }

    @Test
    public void sort2() {
        list = Arrays.asList(2,1);
        expected = Arrays.asList(1,2);
        List<Integer> sorted = sorter.sort(list);

        Assertions.assertEquals(expected, sorted);
    }
}
