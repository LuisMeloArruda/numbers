package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositiveFilterTest {
    @Test
    public void test() {
        PositiveFilter pf = new PositiveFilter();
        Assertions.assertFalse(pf.accept(-1));
        Assertions.assertFalse(pf.accept(0));
    }
}
