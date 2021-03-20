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

    public void setTime(int _time) {
        time = _time;
    }
    
    public String getType() {
        return "Merge Sort";
    }

    public int mergeSort(Drawing d, int beg, int end) {
        if (end - beg < 2) {
            if (end > beg && d.get(end) < d.get(beg)) {
                int temp = d.get(end);
                d.set(end, d.get(beg));
                d.set(beg, temp);
                d.paintArray(time);
            }
        } 
        else {
            int middle = (beg + end) / 2;
            mergeSort(d, beg, middle);
            mergeSort(d, middle + 1, end);
            merge(d, beg, middle, end);
        }
        return 1;
    }

    public int merge(Drawing d, int beg, int middle, int end) {
        int i = beg, j = middle + 1, k = beg;
        int[] temp = new int[d.getNumBars()];
        d.paintArray(time);
        while (i <= middle && j <= end) {
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
        while (j <= end) {
            temp[k] = d.get(j);
            j++;
            k++;
        }
        for (k = beg; k <= end; k++) {
            d.set(k, temp[k]);
            d.paintArray(time);
        }
        return 1;
    }
}
