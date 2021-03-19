public class Main {
    private static Sort[] sorts = {new BubbleSort(), new SelectionSort(10), new InsertionSort(10)};
    public static void main(String[] args) {
        final int WIDTH = 1300;
        final int HEIGHT = 700;
        StdDraw.setCanvasSize(WIDTH, HEIGHT);
        StdDraw.setXscale(0, 1300);
        StdDraw.setYscale(0, 700);
        StdDraw.clear(StdDraw.WHITE);
        StdDraw.enableDoubleBuffering();
        solve();
    }

    public static void solve() {
        for(Sort s: sorts) {
            Drawing d = new Drawing(100);
            d.paintArray();
            s.sortArray(d);
            d.paintArray(500);
        }
    }
}