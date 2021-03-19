public class MergeSort implements Sort {
    private int time = 0;

    public MergeSort() {
        time = 0;
    }

    public MergeSort(int _time) {
        time = _time;
    }

    public void sortArray(Drawing d) {
        mergeSort(d, 0, d.getNumBars() - 1);
    }

    public int mergeSort(Drawing d, int from, int to) {
        if (to - from < 2) {
            if (to > from && d.get(to) < d.get(from)) {
                int temp = d.get(to);
                d.set(to, d.get(from));
                d.set(from, temp);
                d.paintArray(time);
            }
        } 
        else {
            int middle = (from + to) / 2;
            mergeSort(d, from, middle);
            mergeSort(d, middle + 1, to);
            merge(d, from, middle, to);
        }
        return 1;
    }

    public int merge(Drawing d, int from, int middle, int to) {
        int i = from, j = middle + 1, k = from;
        int[] temp = new int[d.getNumBars()];
        d.paintArray(time);
        while (i <= middle && j <= to) {
            if (d.get(i) < d.get(j)) {
                temp[k] = d.get(i);
                i++;
            } 
            else {
                temp[k] = d.get(j);
                j++;
            }
            k++;
        }
        while (i <= middle) {
            temp[k] = d.get(i);
            i++;
            k++;
        }
        while (j <= to) {
            temp[k] = d.get(j);
            j++;
            k++;
        }
        for (k = from; k <= to; k++) {
            d.set(k, temp[k]);
            d.paintArray(time);
        }
        return 1;
    }
}
