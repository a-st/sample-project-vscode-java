package com.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleBTest {

    @Test
    void test() {
        Assertions.assertEquals("A", TestCommons.MY_CONTANT_A);
    }

}
