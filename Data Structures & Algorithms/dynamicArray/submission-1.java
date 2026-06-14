class DynamicArray {

    int[] arr;
    int idx;

    public DynamicArray(int capacity) {
        arr = new int[capacity];
        idx = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(idx == arr.length){
            resize();
        }
        arr[idx++] = n;
    }

    public int popback() {
        return arr[--idx];
    }

    private void resize() {
        int[] newArr = Arrays.copyOf(arr, arr.length*2);
        arr = newArr;
    }

    public int getSize() {
        return idx;
    }

    public int getCapacity() {
        return arr.length;
    }
}
