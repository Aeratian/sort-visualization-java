public class HeapSort implements Sort {
    private int time = 0;

    public HeapSort() {
        time = 0;
    }

    public HeapSort(int _time) {
        time = _time;
    }

    public void sortArray(Drawing d) {
        for (int i = d.getNumBars() / 2 - 1; i >= 0; i--) {
            heapify(d, d.getNumBars(), i);
        }
        for (int i = d.getNumBars() - 1; i > 0; i--) {
            int temp = d.get(0);
            d.set(0, d.get(i));
            d.set(i, temp);
            d.paintArray(time);
            heapify(d, i, 0);
        }
    }

    public void heapify(Drawing d, int size, int ind) {
        int max = ind;
        int leftPointer = 2 * ind + 1;
        int rightPointer = 2 * ind + 2;
        if (leftPointer < size) {
            max = (d.get(max) < d.get(leftPointer)) ? leftPointer : max;
        }
        if (rightPointer < size) {
            max = (d.get(max) < d.get(rightPointer)) ? rightPointer : max;
        }
        if (max != ind) {
            int temp = d.get(ind);
            d.set(ind, d.get(max));
            d.set(max, temp);
            d.paintArray(time);
            heapify(d, size, max);
        }
    }

}
