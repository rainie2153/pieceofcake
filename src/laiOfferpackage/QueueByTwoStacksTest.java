package laiOfferpackage;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yuliu on 3/13/16.
 */
public class QueueByTwoStacksTest {
    QueueByTwoStacks test = new QueueByTwoStacks();

    @Test
    public void testPoll() throws Exception {
        test.offer(1);
        int actual = test.poll();
        assertEquals(1, actual);
    }

    @Test
    public void testOffer() throws Exception {

    }

    @Test
    public void testPeek() throws Exception {

    }

    @Test
    public void testSize() throws Exception {

    }

    @Test
    public void testIsEmpty() throws Exception {

    }
}
//override    overload 多态---/继承()