package stringArrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class TestProblem {

    private Problems problems;

    @Before
    public void init(){
        problems = new Problems();
    }

    @Test
    public void test_wordFreq(){
        Map<String,Integer> map = problems.findDuplicateWordsAndNumberOfOccurances("This is a test a");
        Assert.assertNotNull(map);
        Assert.assertEquals(4,map.size());
        map.forEach((key,value)->{
            System.out.println(key + "\t\t\t" + value);
        });
    }
}
