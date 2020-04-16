public class App {
    public static void main(final String[] args) {
        new TrafficLight(
                new TimeCell(
                    new RedCell(),
                    5000
                ),
                new TimeCell(
                    new YellowCell(),
                    1000
                ),
                new TimeCell(
                    new GreenCell(),
                    4000
                )
        ).run();
    }
}
