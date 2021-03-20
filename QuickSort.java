public class QuickSort implements Sort {
    private int time = 0;

    public QuickSort() {
        time = 0;
    }

    public QuickSort(int _time) {
        time = _time;
    }

    public void sortArray(Drawing d) {
        quickSort(d, 0, d.getNumBars() - 1);
    }
    
    public void setTime(int _time) {
        time = _time;
    }

    public String getType() {
        return "Quick Sort";
    }

    public void quickSort(Drawing d, int beg, int end) {
        if (beg < end) {
            int par = partition(d, beg, end);
            quickSort(d, beg, par - 1);
            quickSort(d, par + 1, end);
        }
    }

    public int partition(Drawing d, int beg, int end) {
        int pivot = d.get(end);
        int key = beg - 1;
        for (int i = beg; i < end; i++) {
            if (d.get(i) < pivot) {
                key++;
                int temp = d.get(key);
                d.set(key, d.get(i));
                d.set(i, temp);
                d.paintArray(time);
            }
        }
        int temp = d.get(key + 1);
        d.set(key + 1, d.get(end));
        d.set(end, temp);
        d.paintArray(time);
        return key + 1;
    }
}
