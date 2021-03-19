
public class SelectionSort implements Sort {
    private int time = 0;

    public SelectionSort() {
        time = 0;
    }

    public SelectionSort(int _time) {
        time = _time;
    }

    public void sortArray(Drawing d) {
        int max, temp;
        for (int i = d.getNumBars(); i > 0; i--) {
            max = 0;
            for (int j = 1; j < i; j++) {
                if (d.get(j) > d.get(max)) {
                    max = j;
                }
            }
            temp = d.get(i - 1);
            d.set(i - 1, d.get(max));
            d.set(max, temp);
            d.paintArray(time);
        }
    }
}
