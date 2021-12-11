package com.algodata;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class majorityElementInArrayTests {
    @Test
    public void majorityElement() {
        Integer actual = majorityElementInArray.forTest(Arrays.asList(7, 3, 4, 5, 8, 7, 7, 7));
        Integer expected = 7;
        Assert.assertEquals(expected, actual);
    }
}
