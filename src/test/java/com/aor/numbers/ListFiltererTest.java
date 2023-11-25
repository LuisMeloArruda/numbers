package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class ListFiltererTest {
    @Test
    public void Filtertest() {
        GenericListFilter glf = Mockito.mock(GenericListFilter.class);
        Mockito.when(glf.accept(1)).thenReturn(true);
        Mockito.when(glf.accept(2)).thenReturn(false);
        Mockito.when(glf.accept(3)).thenReturn(true);
        Mockito.when(glf.accept(4)).thenReturn(true);

        ListFilterer list = new ListFilterer(glf);
        Assertions.assertEquals(Arrays.asList(1,3,4), list.filter(Arrays.asList(1,2,3,4)));
    }

}
