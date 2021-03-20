import java.awt.Color;
import java.util.ArrayList;

public class Main {
    private static Sort[] allSorts = { new BubbleSort(), new SelectionSort(), new InsertionSort(), new MergeSort(),
            new QuickSort(), new HeapSort() };
    private static Sort curSort;

    public static void main(String[] args) {
        final int WIDTH = 1300;
        final int HEIGHT = 700;
        StdDraw.setCanvasSize(WIDTH, HEIGHT);
        StdDraw.setXscale(0, 1300);
        StdDraw.setYscale(0, 700);
        StdDraw.clear(StdDraw.WHITE);
        StdDraw.enableDoubleBuffering();
        initialGUI();
    }

    public static void initialGUI() {
        StdDraw.setPenColor(Color.DARK_GRAY);
        StdDraw.text(650, 550, "Pick a Sort Option");
        StdDraw.text(650, 475, "Press 0 to quit");
        for (int i = 0; i < 6; i++) {
            StdDraw.text(650, 425 - 50 * i, "Press " + (i + 1) + " for " + allSorts[i].getType());
        }
        StdDraw.show();
        int counter = 0;
        while (true) {
            if (StdDraw.isKeyPressed(counter + '0')) {
                if (counter == 0)
                    break;
                curSort = allSorts[counter - 1];
                solve();
            }
            counter++;
            counter %= 8;
        }
    }

    public static void chooseSort() {
        StdDraw.setPenColor(Color.DARK_GRAY);
        StdDraw.text(150, 650, "Pick a Sort Option");
        StdDraw.text(150, 600, "Press 0 to quit");
        for (int i = 1; i < 7; i++) {
            StdDraw.text(150, 600 - 50 * i, "Press " + i + " for " + allSorts[i - 1].getType());
        }
        StdDraw.show();
        int counter = 0;
        while (true) {
            if (StdDraw.isKeyPressed(counter + '0')) {
                if (counter == 0)
                    break;
                curSort = allSorts[counter - 1];
                solve();
            }
            counter++;
            counter %= 8;
        }
    }

    public static void solve() {
        Drawing d = new Drawing(100);
        d.paintArray();
        curSort.sortArray(d);
        d.paintArray(500);
        chooseSort();
    }
}