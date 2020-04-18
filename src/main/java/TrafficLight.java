public class TrafficLight {
    private final Cell[] cells;
    public TrafficLight(Cell... cells) {
        this.cells = cells;
    }

    public void run() {
        while (true) {
            for (final Cell cell : cells) {
                cell.run();
            }
        }
    }
}
