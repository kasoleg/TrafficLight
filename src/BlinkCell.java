public class BlinkCell implements Cell {

    private final Cell cell;
    private final int count;

    public BlinkCell(Cell cell, int count) {
        this.cell = cell;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            cell.run();
        }
    }
}
