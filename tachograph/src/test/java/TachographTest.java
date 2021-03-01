import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class TachographTest {
    Tachograph tachograph;

    @Before
    public void before() {
        tachograph = new Tachograph();
    }

    @Test
    public void test() {
        tachograph.addEntry(new Date(System.currentTimeMillis()), 0.4f, 0.6f);
        tachograph.addEntry(new Date(System.currentTimeMillis()), 0.2f, 0.16f);

        Assert.assertEquals(2, tachograph.getSize());
    }
}
