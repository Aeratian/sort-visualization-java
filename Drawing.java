import java.awt.Color;

 public class Drawing {
    private static final int HEIGHT = 700, WIDTH = 1300;
    private static int barWidth;

    private int[] arr;
    private Color[] colors;
    private int numBars;
    
    public Drawing(int num) {
        arr = new int[num];
        colors = new Color[num];
        numBars = num;
        barWidth = WIDTH / numBars;
        for(int i = 0; i < num; i++) {
            arr[i] = (int)(Math.random()*(HEIGHT-50))+5;
            colors[i] = Color.DARK_GRAY;
        }
    }
    public int get (int ind) {
        return arr[ind];
    }
    public void set(int ind, int val) {
        arr[ind] = val;
        colors[ind] = Color.GREEN;
    }
    public void resetColors() {
        for(int i = 0; i < numBars; i++) colors[i] = Color.DARK_GRAY;
    }
    public void paintArray() {
        StdDraw.clear(Color.WHITE);
        for(int i = 0; i < numBars; i++) {
            StdDraw.setPenColor(colors[i]);
            StdDraw.filledRectangle(barWidth / 2.0 + barWidth * i, arr[i] / 2.0, barWidth / 2.0, arr[i] / 2.0);
        }
        StdDraw.show();
        resetColors();
    }
    public void paintArray(int time) {
        StdDraw.clear(Color.WHITE);
        for(int i = 0; i < numBars; i++) {
            StdDraw.setPenColor(colors[i]);
            StdDraw.filledRectangle(barWidth / 2.0 + barWidth * i, arr[i] / 2.0, barWidth / 2.0, arr[i] / 2.0);
        }
        StdDraw.show(time);
        resetColors();
    }
    public int getNumBars() {
        return numBars;
    }
}
