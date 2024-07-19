public void sortCyclical(int[] inputArray) {
    for (int i = 0; i < inputArray.length; i++) {
        if (inputArray[i] != i + 1) {
            swap(i, inputArray[i]);
        }
    }
}

public void swap(int i1, int i2) {
    // theoretical in place swap of the values at i1 and i2
}
