public class BubbleSort implements Sort {
    public void sortArray(Drawing d) {
        for (int i = 0; i < d.getNumBars(); i++) {
            for (int j = 1; j < d.getNumBars() - i; j++) {
                if (d.get(j - 1) > d.get(j)) {
                    int temp = d.get(j - 1);
                    d.set(j - 1, d.get(j));
                    d.set(j, temp);
                    d.paintArray();
                }
            }
        }
    }
}
