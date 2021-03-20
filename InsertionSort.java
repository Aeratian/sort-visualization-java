import javax.sound.sampled.SourceDataLine;

public class InsertionSort implements Sort {
    private int time = 0;

    public InsertionSort() {
        time = 0;
    }

    public InsertionSort(int _time) {
        time = _time;
    }

    public void setTime(int _time) {
        time = _time;
    }

    public String getType() {
        return "Insertion Sort";
    }

    public void sortArray(Drawing d) {
        for (int i = 1; i < d.getNumBars(); i++) {
            int pos = i;
            int key = d.get(i);
            while (pos > 0 && d.get(pos - 1) > key) {
                d.set(pos, d.get(pos - 1));
                pos--;
                d.paintArray(time);
            }
            d.set(pos, key);
            d.paintArray(time);
        }
    }
}
