package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {
    @Test
    public void testeDivisible()

    {
        DivisibleByFilter dbf = new DivisibleByFilter(2);
        List<Integer> a = Arrays.asList(4, 6, 8, 10);
        List<Integer> b = Arrays.asList(3, 5, 7);

        for (int i : a) {
            Assertions.assertTrue(dbf.accept(i));
        }
        for (int i : b) {
            Assertions.assertFalse(dbf.accept(i));
        }
    }
}
