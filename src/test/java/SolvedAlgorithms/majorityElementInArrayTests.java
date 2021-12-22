package SolvedAlgorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class majorityElementInArrayTests {
    @Test
    public void majorityElement() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(7, 3, 4, 5, 8, 7, 7, 7, 7));
        Integer actual = majorityElementInArray.majorityElement(list);
        Integer expected = 7;
        Assert.assertEquals(expected, actual);
    }


}
