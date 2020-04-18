public class TimeCell implements Cell {
    private final Cell cell;
    private final int millis;

    public TimeCell(Cell cell, final int millis) {
        this.cell = cell;
        this.millis = millis;
    }

    @Override
    public void run() {
        cell.run();
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
