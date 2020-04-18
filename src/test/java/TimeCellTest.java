import org.junit.Assert;
import org.junit.Test;

public class TimeCellTest {
    @Test
    public void runWithPrecision100millis() {
        final long beforeTime = System.currentTimeMillis();
        final int workTime = 1000;
        new TimeCell(new RedCell(), workTime).run();
        final long afterTime = System.currentTimeMillis();
        final long actualWorkTime = afterTime - beforeTime;
        final int precision = 100;
        final long expectedWorkTime = workTime + precision;
        Assert.assertTrue(
                "actual work time = " + actualWorkTime + " expected work time = " + expectedWorkTime,
                actualWorkTime >= workTime && actualWorkTime < expectedWorkTime
        );
    }
}
