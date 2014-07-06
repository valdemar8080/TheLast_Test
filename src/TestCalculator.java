import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Test;
import org.omg.CORBA.INTERNAL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by katya on 06.07.2014.
 */
public class TestCalculator {

    @Test
    public void testMaxOk() throws EmptyArrayException {
        Calculator calc = new Calculator();
        Integer[] array = {1,2};
        int i = calc.max(array);
        assertEquals("ok", 2, i);
    }


    @Test
    public void testMaxNull()
    {
        Calculator calc = new Calculator();

        Integer[] array = null;

        try {
            calc.max(array);
            fail();
        } catch (EmptyArrayException e) {

        }


    }
/*
    @Test(expected = EmptyArrayException.class)
    public void testMaxNullElement() throws EmptyArrayException {
        Calculator calc = new Calculator();
        Integer[] array = {null, 2};
        calc.max(array);
    }

*/
}
