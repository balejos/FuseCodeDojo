package redhat.fusecodedojo.kata1;

import org.junit.Test;
import static org.junit.Assert.*;

public class KataTest 
{
    @Test
    public void BasicTests()
    {
        assertEquals(21, Kata.nextBiggerNumber(12));
        assertEquals(531, Kata.nextBiggerNumber(513));
        assertEquals(2071, Kata.nextBiggerNumber(2017));
        assertEquals(441, Kata.nextBiggerNumber(414));
        assertEquals(414, Kata.nextBiggerNumber(144));
    }
}
