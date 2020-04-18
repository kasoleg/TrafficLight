import org.junit.Test;

public class BlinkCellTest {
    @Test
    public void blinkGreenThreeTimes() {
        new BlinkCell(new GreenCell(), 3).run();
    }
}
