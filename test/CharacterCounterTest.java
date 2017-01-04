import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alwin on 04/01/2017.
 */
public class CharacterCounterTest {
    @Test
    public void counter_stringA_returnOne() throws Exception{
        CharacterCounter counter = new CharacterCounter("A");
        int countA = counter.count('A') ;
        Assert.assertEquals(1, countA);
    }

    @Test
    public void count_string()throws Exception {

    }
}
