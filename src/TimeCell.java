public class TimeCell implements Cell {
    private final Cell cell;

    public TimeCell(Cell cell) {
        this.cell = cell;
    }

    @Override
    public void run() {
        cell.run();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
