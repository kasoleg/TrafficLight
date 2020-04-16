public class App {
    public static void main(final String[] args) {
        new TrafficLight(
                new TimeCell(
                    new RedCell()
                ),
                new TimeCell(
                    new YellowCell()
                ),
                new TimeCell(
                    new GreenCell()
                )
        ).run();
    }
}
