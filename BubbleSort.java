public class BubbleSort implements Sort {
    private int time = 0;

    public BubbleSort() {
        time = 0;
    }

    public BubbleSort(int _time) {
        time = _time;
    }

    public void sortArray(Drawing d) {
        for (int i = 0; i < d.getNumBars(); i++) {
            for (int j = 1; j < d.getNumBars() - i; j++) {
                if (d.get(j - 1) > d.get(j)) {
                    int temp = d.get(j - 1);
                    d.set(j - 1, d.get(j));
                    d.set(j, temp);
                    d.paintArray(time);
                }
            }
        }
    }
}
